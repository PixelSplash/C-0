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
public class While extends Tree{
    Tree left;
    Tree right;
    Integer direction;
    public While(Tree l, Tree r){
        left = l;
        right = r;
    }
    
    public Integer eval(Environment e) {
        while(left.eval(e) == 1){
            e.newScopeTable();
            right.eval(e);
            e.deleteLastScopeTable();
            if(e.lookup("break")==1){
                e.set("break", 0, 0, 0);
                break;
            }
        }
        
        return 1;
    }
    
    public void print() {
        System.out.print("(WHILE ");
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
