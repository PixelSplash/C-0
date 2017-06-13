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
public class And extends Tree{
    Tree left;
    Tree right;
    Integer direction;
    public And(Tree l, Tree r){
        left = l;
        right = r;
    }
    
    public Integer eval(Environment e) {
        boolean expr = (left.eval(e) == 1)&&(right.eval(e)==1);
        int result;
        if(expr){
            result = 1;
        }
        else {
            result = 0;
        }
        writeIC(e);
        return result;
    }
    
    public void print() {
        System.out.print("(AND ");
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
                Global.writeLine("AND " + left.getDirection() + " " + right.getDirection() + " " + this.getDirection()+"\n");
            } catch (IOException ex) {
                Logger.getLogger(And.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
