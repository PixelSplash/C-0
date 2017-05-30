package tree;
import java.util.ArrayList;
public class Environment {

    private ArrayList<ArrayList<SymbolEnv>> _symbolTable;
    private ArrayList<TypeEnv> _typeTable;

    public Environment() {
        _symbolTable = new ArrayList<ArrayList<SymbolEnv>>();
        _typeTable = new ArrayList<TypeEnv>();
        _typeTable.add(new TypeEnv(0,"int"));
        _symbolTable.add(new ArrayList<SymbolEnv>());
        _symbolTable.get(0).add(new SymbolEnv(0,"brake", 0));
    }

    public Integer lookup(String var) {
        for(int i = _symbolTable.size()-1; i >= 0; i--){
            ArrayList<SymbolEnv> x = _symbolTable.get(i);
            for(SymbolEnv y : x){
                if(y.getId().equals(var))return y.getCod();
            }
        }
        return null;
    }
    

    public void set(String var, Integer val, int type) {
        _symbolTable.get(_symbolTable.size()-1).add(new SymbolEnv( val, var, type));
    }

    public void deleteLastScopeTable(){
        _symbolTable.remove(_symbolTable.size()-1);
    }
    
    public void newScopeTable(){
        _symbolTable.add(new ArrayList<SymbolEnv>());
    }
}
