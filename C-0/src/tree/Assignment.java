package tree;

public class Assignment extends Tree {

    private String lhs;
    private Tree rhs;
    private int type;

    public Assignment(String s, Tree e, int t) {
        lhs = s;
        rhs = e;
        type = t;
    }

    public Integer eval(Environment e) {
        Integer val = rhs.eval(e);
        e.set(lhs, val,type);
        return val;
    }

    public void print() {
        System.out.print("(ASSIGNMENT " + lhs + ", ");
        rhs.print();
        System.out.print(")");
    }
}