package tree;

import c0.Global;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Assignment extends Tree {

    private String lhs;
    private Tree rhs;
    private int type;
    Integer direction;
    public Assignment(String s, Tree e, int t) {
        lhs = s;
        rhs = e;
        type = t;
    }

    public Integer eval(Environment e) {
        Integer val = rhs.eval(e);
        if(type == -2){
            e.set(lhs, val);
            
        }else{
            e.add(lhs, val,type, this.direction);
        }
        
        return val;
    }

    public void print() {
        System.out.print("(ASSIGNMENT " + lhs + ", ");
        rhs.print();
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

    @Override
    public void writeIC(Environment e) {
        try {
            this.direction = e.lookupDir(lhs);
            rhs.writeIC(e);
            Global.writeLine("CARGAR_DIRECCION " + rhs.getDirection() + " null " + this.getDirection()+"\n");
        } catch (IOException ex) {
            Logger.getLogger(Assignment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}