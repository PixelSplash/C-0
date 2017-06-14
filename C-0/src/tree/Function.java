/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import java.util.ArrayList;
import tree.Tree;

/**
 *
 * @author bryam
 */
public class Function {
    private String id;
    private Tree expresion;
    private Tree ret;

    public Tree getRet() {
        return ret;
    }

    public void setRet(Tree ret) {
        this.ret = ret;
    }
    private ArrayList<String> parameters = new ArrayList<String>();

    public ArrayList<String> getParameters() {
        return parameters;
    }

    public void setParameters(ArrayList<String> parameters) {
        this.parameters = parameters;
    }
    
    public void addParameter(String p){
        parameters.add(p);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Tree getExpresion() {
        return expresion;
    }

    public void setExpresion(Tree expresion) {
        this.expresion = expresion;
    }

    public Function(String id, Tree exp, Tree r) {
        this.id = id;
        expresion = exp;
        ret = r;
    }
    
}
