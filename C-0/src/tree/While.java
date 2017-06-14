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
public class While extends Tree{
    Tree left;
    Tree right;
    Integer direction;
    public While(Tree l, Tree r){
        left = l;
        right = r;
    }
    
    public Integer eval(Environment e) {
        while(left.eval(e) > 0){
            e.newScopeTable();
            right.eval(e);
            e.deleteLastScopeTable();
            if(e.lookup("break")==1){
                e.set("break", 0);
                break;
            }
        }
        
        return 1;
    }
    
    public void print() {
        System.out.print("(WHILE ");
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
        int whileCounter = Global.getWhileCounter();
        try {
            Global.writeLine("ETIQUETA null null BUCLE_" + whileCounter + "\n");
            left.writeIC(e);
            Global.writeLine("SALTAR_CONDICION " + left.getDirection() + " null FINBUCLE_" + whileCounter + "\n");
            right.writeIC(e);
            Global.writeLine("SALTAR_ETIQUETA null null BUCLE_" + whileCounter + "\n");
            Global.writeLine("ETIQUETA null null FINBUCLE_" + whileCounter + "\n");
        } catch (IOException ex) {
            Logger.getLogger(While.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
