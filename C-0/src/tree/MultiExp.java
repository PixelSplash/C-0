package tree;

public class MultiExp extends Tree {
    Tree left;
    Tree right;
    Integer type;

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
        System.out.print("MultiExp");
    }
}

