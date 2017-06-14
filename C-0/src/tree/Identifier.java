package tree;

public class Identifier extends Tree {

    private String id;
    Integer direction;
    public Identifier(String s) {
        id = s;
    }

    public Integer eval(Environment e) {
        return e.lookup(id);
    }

    public void print() {
        System.out.print("(IDENT " + id + ")");
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
        this.direction = e.lookupDir(id);
    }
    
}