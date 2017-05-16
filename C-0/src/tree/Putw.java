/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author sescalo
 */
public class Putw extends Tree{
    Tree expression;
    
    public Putw(Tree exp){
        expression = exp;
    }
    
    public Integer eval(Environment e) {
        return expression.eval(e);
    }
    
    public void print() {
        System.out.print("(PUTW ");
        expression.print();
        System.out.print(")");
    }
    
}
