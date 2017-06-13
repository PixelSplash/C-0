package tree;

import c0.Global;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Divide extends Tree {
    Tree left;
    Tree right;
    Integer direction;
    public Divide(Tree l, Tree r) {
        left = l;
        right = r;
    }

    public Integer eval(Environment e) {
        int result = left.eval(e) / right.eval(e);
        return result;
    }

    public void print() {
        System.out.print("(DIVIDE ");
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
            Global.writeLine("DIVIDIR " + left.getDirection() + " " + right.getDirection() + " " + this.getDirection()+"\n");
        } catch (IOException ex) {
            Logger.getLogger(Divide.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
