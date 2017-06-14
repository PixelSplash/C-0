/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import c0.Global;
import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sescalo
 */
public class FunctionDef extends Tree{
    String id;
    Tree exp;
    Tree ret;
    Integer direction;    
    Tree parameters;
    public FunctionDef(String s, Tree p, Tree e, Tree r){
        id = s;
        exp = e;
        parameters = p;
        ret = r;
    }
    
    public Integer eval(Environment e) {
        Global.addFunction(new Function(id, exp, ret));
        parameters.eval(e);
        return 0;
    }
    
    public void print() {
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
    }
}
