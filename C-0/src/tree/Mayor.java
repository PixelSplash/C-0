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
public class Mayor extends Tree{
    Tree left;
    Tree right;
    
    public Mayor(Tree l, Tree r){
        left = l;
        right = r;
    }
    
    public Integer eval(Environment e) {
        if(left.eval(e) > right.eval(e)){
            return 1;
        }
        else {
            return 0;
        }
    }
    
    public void print() {
        System.out.print("(MAYOR ");
        left.print();
        System.out.print(", ");
        right.print();
        System.out.print(")");
    }
    
}
