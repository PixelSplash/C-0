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
public class ParametersDef extends Tree{
    String id;
    Tree next;
    Integer direction;    
    public ParametersDef(String l, Tree r){
        id = l;
        next = r;
    }
    
    public Integer eval(Environment e) {
        Global.addParameterDef(id);
        if(next!=null)next.eval(e);
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