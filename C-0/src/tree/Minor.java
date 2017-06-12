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
public class Minor extends Tree{
    Tree left;
    Tree right;
    Integer direction;
    public Minor(Tree l, Tree r){
        left = l;
        right = r;
    }
    
    public Integer eval(Environment e) {
        boolean expr = left.eval(e) < right.eval(e);
        int result;
        if(expr){
            result = 1;
        }
        else {
            result = 0;
        }
        try {
            Global.writeLine("MENOR " + left.getDirection() + " " + right.getDirection() + " " + this.getDirection()+"\n");
        } catch (IOException ex) {
            Logger.getLogger(Minor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public void print() {
        System.out.print("(MINOR ");
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
}
