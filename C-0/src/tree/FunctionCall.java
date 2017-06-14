/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import c0.Global;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sescalo
 */
public class FunctionCall extends Tree{
    String id;
    Integer direction;    
    Tree parameters;
    public FunctionCall(String s, Tree p){
        //System.out.println(s);
        id = s;
        parameters = p;
    }
    
    public Integer eval(Environment e) {
        e.newScopeTable();
        int ret = 0;
        parameters.eval(e);

        Function func = Global.getFunction(id);
        
        ArrayList<Integer> parameterArray = Global.getParameterArray();
        ArrayList<String> parameters = func.getParameters();
        //System.out.println(parameterArray.size() +" " +parameters.size() );
        if(parameterArray.size() == parameters.size()){
            for(int i = 0; i < parameterArray.size(); i++){
               
                e.add(parameters.get(i), parameterArray.get(i),0,Global.directionCount++);
            }
            func.getExpresion().eval(e);
            ret = func.getRet().eval(e);
        }else{System.out.println("Error de cantidad de parametros");}
        
        e.deleteLastScopeTable();
        return ret;
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
