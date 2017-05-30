package tree;

public class SymbolEnv {
    
    private int cod;
    private String id;
    private int direccion;
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public SymbolEnv( int pcod, String pid, int type) {
        this.cod = pcod;
        this.id = pid;
        this.type = type;
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

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }
    
    
    
    
}