package tree;

public class Identifier extends Tree {

    private String id;
    Integer direction;
    public Identifier(String s) {
        id = s;
    }

    public Integer eval(Environment e) {
        this.direction = e.lookupDir(id);
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
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}