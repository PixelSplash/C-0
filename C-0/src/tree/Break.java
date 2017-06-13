package tree;

public class Break extends Tree {
    Integer direction;
    public Break() {
    }

    public Integer eval(Environment e) {
        e.set("break", 1);
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

    @Override
    public void writeIC(Environment e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
