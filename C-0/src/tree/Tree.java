package tree;
import c0.Global;
public abstract class Tree {
    public abstract Integer eval(Environment e);
    public abstract void print();
    public abstract Integer getDirection();
    public abstract void setDirection(Integer dir);
}

