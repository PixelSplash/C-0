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
public class If extends Tree{
    Tree left;
    Tree right;
    Tree condition;
    int flag;
    
    public If(Tree cond, Tree l, Tree r, int fl){
        condition = cond;
        left = l;
        right = r;
        flag = fl;
    }
    
    public Integer eval(Environment e) {
        if(condition.eval(e) == 1){
            return left.eval(e);
        }
        else if(flag == 1){
            return right.eval(e);
        }
        return 0;
    }
    
    public void print() {
        System.out.print("(IF ");
        left.print();
        System.out.print(", ");
        right.print();
        System.out.print(")");
    }
    
}
