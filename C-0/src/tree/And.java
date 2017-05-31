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
public class And extends Tree{
    Tree left;
    Tree right;
    Integer direction;
    public And(Tree l, Tree r){
        left = l;
        right = r;
    }
    
    public Integer eval(Environment e) {
        if((left.eval(e) == 1)&&(right.eval(e)==1)){
            return 1;
        }
        else {
            return 0;
        }
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
    
}
