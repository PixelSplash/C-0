/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import c0.Global;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sescalo
 */
public class If extends Tree{
    Tree left;
    Tree right;
    Tree condition;
    int flag;
    Integer direction;
    public If(Tree cond, Tree l, Tree r, int fl){
        condition = cond;
        left = l;
        right = r;
        flag = fl;
    }
    
    public Integer eval(Environment e) {
        if(condition.eval(e) == 1){
            e.newScopeTable();
            return left.eval(e);
            
        }
        else if(flag == 1){
            e.newScopeTable();
            return right.eval(e);
        }
        e.deleteLastScopeTable();
        return 0;
    }
    
    public void print() {
        System.out.print("(IF ");
        left.print();
        System.out.print(", ");
        right.print();
        System.out.print(")");
    }

    @Override
    public Integer getDirection() {
        return direction;
    }

    @Override
    public void setDirection(Integer dir) {
        direction = dir;
    }

    @Override
    public void writeIC(Environment e) {
        int ifCounter = Global.getIfCounter();
        try {
            condition.writeIC(e);
            if(flag == 1){
                Global.writeLine("SALTAR_CONDICION " + condition.getDirection() + " null ELSE_" + ifCounter + "\n");
            }else{
                Global.writeLine("SALTAR_CONDICION " + condition.getDirection() + " null FINIF_" + ifCounter+ "\n");
            }
            left.writeIC(e);
            Global.writeLine("SALTAR_ETIQUETA null null FINIF_" + ifCounter + "\n");
            if(flag == 1){
                Global.writeLine("ETIQUETA null null ELSE_" + ifCounter + "\n");
                right.writeIC(e);
            }
           
            Global.writeLine("ETIQUETA null null FINIF_" + ifCounter + "\n");
        } catch (IOException ex) {
            Logger.getLogger(While.class.getName()).log(Level.SEVERE, null, ex);
        }    }
}
