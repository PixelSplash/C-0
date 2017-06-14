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
        _symbolTable.get(0).add(new SymbolEnv(0,"break", 0, 9999));
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
    public Integer lookupDir(String var) {
        for(int i = _symbolTable.size()-1; i >= 0; i--){
            ArrayList<SymbolEnv> x = _symbolTable.get(i);
            for(SymbolEnv y : x){
                if(y.getId().equals(var))return y.getDirection();
            }
        }
        return null;
    }

    public void add(String var, Integer val, int type, int dir) {
        if(lookup(var) != null){
            System.out.println("Error sobrescribir variable " + var);
        }else{
            _symbolTable.get(_symbolTable.size()-1).add(new SymbolEnv( val, var, type, dir));
        }
    }
    public void set(String var, Integer val) {
        boolean exist = false;
        for(int i = _symbolTable.size()-1; i >= 0; i--){
            ArrayList<SymbolEnv> x = _symbolTable.get(i);
            for(SymbolEnv y : x){
                if(y.getId().equals(var)){
                    y.setCod(val);
                    exist = true;
                    break;
                }
                
            }
            if(exist){
                break;
            }
        }
        if(!exist){
            System.out.println("Error no existe variable " + var);
        }
    }
    public void deleteLastScopeTable(){
        _symbolTable.remove(_symbolTable.size()-1);
    }
    
    public void newScopeTable(){
        _symbolTable.add(new ArrayList<SymbolEnv>());
    }
}
