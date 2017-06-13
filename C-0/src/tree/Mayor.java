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
public class Mayor extends Tree{
    Tree left;
    Tree right;
    Integer direction;
    public Mayor(Tree l, Tree r){
        left = l;
        right = r;
    }
    
    public Integer eval(Environment e) {
        boolean expr = left.eval(e) > right.eval(e);
        int result;
        if(expr){
            result = 1;
        }
        else {
            result = 0;
        }
        return result;
    }
    
    public void print() {
        System.out.print("(MAYOR ");
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
        try {
                left.writeIC(e);
                right.writeIC(e);
                Global.writeLine("MAYOR " + left.getDirection() + " " + right.getDirection() + " " + this.getDirection()+"\n");
            } catch (IOException ex) {
                Logger.getLogger(Mayor.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
