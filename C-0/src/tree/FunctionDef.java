/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import c0.Global;
import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sescalo
 */
public class FunctionDef extends Tree{
    String id;
    Tree exp;
    Tree ret;
    Integer direction;    
    Tree parameters;
    public FunctionDef(String s, Tree p, Tree e, Tree r){
        id = s;
        exp = e;
        parameters = p;
        ret = r;
    }
    
    public Integer eval(Environment e) {
        Function func = new Function(id, exp, ret);
        func.setDirection(direction);
        Global.addFunction(func);
        parameters.eval(e);
        return 0;
    }
    
    public void print() {
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
        //System.out.println("Write Function Def");
        try {
            //int funcCounter = Global.getFuncCounter();
            Global.writeLine("ETIQUETA null null FUNCION_" + id+"\n");
            parameters.writeIC(e);
            exp.writeIC(e);
            if(ret!= null){
                ret.writeIC(e);
                Global.writeLine("CARGAR_EN_ACUMULADOR " + ret.getDirection() + " null " + this.getDirection()+"\n");

            }
            Global.writeLine("RETORNO null null null\n");//arreglar
        } catch (IOException ex) {
            Logger.getLogger(Or.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
