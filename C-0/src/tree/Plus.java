package tree;

public class Plus extends Tree {
    Tree left;
    Tree right;
    Integer direction;
    public Plus(Tree l, Tree r) {
        left = l;
        right = r;
    }

    public Integer eval(Environment e) {
        return left.eval(e) + right.eval(e);
    }
    public void print() {
        System.out.print("(PLUS ");
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

