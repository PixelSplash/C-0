package tree;

public class Break extends Tree {
    Integer direction;
    public Break() {
    }

    public Integer eval(Environment e) {
        e.set("break", 1, 0);
        return 0;
    }

    public void print() {
        System.out.print("(BREAK)");
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
