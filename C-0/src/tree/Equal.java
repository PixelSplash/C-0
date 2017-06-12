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
public class Equal extends Tree{
    Tree left;
    Tree right;
    Integer direction;
    public Equal(Tree l, Tree r){
        left = l;
        right = r;
    }
    
    public Integer eval(Environment e) {
        int result;
        if(Objects.equals(left.eval(e), right.eval(e))){
            result = 1;
        }
        else {
            result = 0;
        }
        try {
            Global.writeLine("IGUAL " + left.getDirection() + " " + right.getDirection() + " " + this.getDirection()+"\n");
        } catch (IOException ex) {
            Logger.getLogger(Equal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public void print() {
        System.out.print("(EQUAL ");
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
