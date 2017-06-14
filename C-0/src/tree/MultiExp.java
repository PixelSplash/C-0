package tree;

import java.io.IOException;

public class MultiExp extends Tree {
    Tree left;
    Tree right;
    Integer type;
    Integer direction;
    public MultiExp(Tree l, Tree r, Integer t) {
        left = l;
        right = r;
        type = t;
    }

    public Integer eval(Environment e) {
        left.eval(e);
        if(type == 1)right.eval(e);
        return 0;
    }
    public void print() {
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
    public void writeIC(Environment e) throws IOException {
        left.writeIC(e);
        if(type == 1){
            right.writeIC(e);
        }
    }
}

