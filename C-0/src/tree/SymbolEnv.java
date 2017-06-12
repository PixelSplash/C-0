package tree;

public class SymbolEnv {
    
    private int cod;
    private String id;
    private int direction;
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public SymbolEnv( int pcod, String pid, int type, int dir) {
        this.cod = pcod;
        this.id = pid;
        this.type = type;
        this.direction = dir;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
    
    
    
    
}