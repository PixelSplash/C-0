package tree;

public class Break extends Tree {

    public Break() {
    }

    public Integer eval(Environment e) {
        e.set("break", 1, 0);
        return 0;
    }

    public void print() {
        System.out.print("(BREAK)");
    }
}
