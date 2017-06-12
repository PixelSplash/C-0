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
public class Putw extends Tree{
    Tree expression;
    Global global = new Global();
    Integer direction;
    public Putw(Tree exp){
        expression = exp;
    }
    
    public Integer eval(Environment e) {
        
        Integer ret = expression.eval(e);
        try {
            Global.writeLine("IMPRIMIR_ENTERO " + expression.getDirection() + " null null\n");
        } catch (IOException ex) {
            Logger.getLogger(Putw.class.getName()).log(Level.SEVERE, null, ex);
        }
        global.outputs.add(ret.toString());
        return ret;
    }
    
    public void print() {
        System.out.print("(PUTW ");
        expression.print();
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
    
    
}
