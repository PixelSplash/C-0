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
public class Minor extends Tree{
    Tree left;
    Tree right;
    
    public Minor(Tree l, Tree r){
        left = l;
        right = r;
    }
    
    public Integer eval(Environment e) {
        if(left.eval(e) < right.eval(e)){
            return 1;
        }
        else {
            return 0;
        }
    }
    
    public void print() {
        System.out.print("(MINOR ");
        left.print();
        System.out.print(", ");
        right.print();
        System.out.print(")");
    }
    
}
