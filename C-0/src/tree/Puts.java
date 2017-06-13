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
public class Puts extends Tree{
    private String str;
    Integer direction;
    Global global = new Global();
    public Puts(String exp){
        str = exp;
    }
    
    public Integer eval(Environment e) {
        global.outputs.add(str);
        
        return 0;
    }
    
    public void print() {
        System.out.print("(PUTS "+ str);
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
        try {
            Global.writeLine("IMPRIMIR_CADENA CADENA_"+global.addICString(str)+" null null\n");
        } catch (IOException ex) {
            Logger.getLogger(Puts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
