package tree;

public class Identifier extends Tree {

    private String id;
    Integer direction;
    public Identifier(String s) {
        id = s;
    }

    public Integer eval(Environment e) {
<<<<<<< HEAD
=======
       
>>>>>>> no commit
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
<<<<<<< HEAD
        this.direction = e.lookupDir(id);
=======
         this.direction = e.lookupDir(id);
>>>>>>> no commit
    }
    
}