package tree;

public class MultiExp extends Tree {
    Tree left;
    Tree right;

    public MultiExp(Tree l, Tree r) {
        left = l;
        right = r;
    }

    public Integer eval(Environment e) {
        left.eval(e);
        right.eval(e);
        return 0;
    }
    public void print() {
        System.out.print("MultiExp");
    }
}

