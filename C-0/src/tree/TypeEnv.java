package tree;

public class TypeEnv {
    private int cod;
    private String id;

    public TypeEnv(int cod, String id) {
        this.cod = cod;
        this.id = id;
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
    
    
}