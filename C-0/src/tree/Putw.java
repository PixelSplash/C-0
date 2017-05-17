/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import c0.Global;
/**
 *
 * @author sescalo
 */
public class Putw extends Tree{
    Tree expression;
    Global global = new Global();
    
    public Putw(Tree exp){
        expression = exp;
    }
    
    public Integer eval(Environment e) {
        
        Integer ret = expression.eval(e);
        global.outputs.add(ret.toString());
        return ret;
    }
    
    public void print() {
        System.out.print("(PUTW ");
        expression.print();
        System.out.print(")");
    }
    
}
