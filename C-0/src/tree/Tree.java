package tree;

public abstract class Tree {
    public abstract Integer eval(Environment e);
    public abstract void print();
    public abstract Integer getDirection();
    public abstract void setDirection(Integer dir);
}

