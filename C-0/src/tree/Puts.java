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
public class Puts extends Tree{
    private String expression;
    Global global = new Global();
    public Puts(String exp){
        expression = exp;
    }
    
    public Integer eval(Environment e) {
        global.outputs.add(expression);
        return 0;
    }
    
    public void print() {
        System.out.print("(PUTS "+ expression);
    }
    
}
