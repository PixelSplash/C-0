package tree;

import c0.Global;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Literal extends Tree {
    Integer direction;
    Integer val;
    public Literal(Integer i) {
        val = i;
    }

    public Integer eval(Environment e) {
        try {
            Global.writeLine("CARGAR_VALOR " + val + " null " + this.getDirection()+"\n");
        } catch (IOException ex) {
            Logger.getLogger(Literal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return val;
    }
    public void print() {
        System.out.print("(LITERAL " + val + ")");
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

