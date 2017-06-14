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
        Function func = Global.getFunction(id);

        ArrayList<Integer> parameterArray = Global.getParameterArray();
        ArrayList<String> parametersAux = func.getParameters();
        parameterArray.clear();
        parameters.eval(e);

        
        
        
        //System.out.println(parameterArray.size() +" " +parametersAux.size() );
        if(parameterArray.size() == parametersAux.size()){
            int aux = parameterArray.size()-1;
            for(int i = 0; i < parameterArray.size(); i++){
               
                e.add(parametersAux.get(i), parameterArray.get(aux-i),0,Global.directionCount++);
            }
            func.getExpresion().eval(e);
            Tree retexp = func.getRet();
            ret = (retexp!=null)?retexp.eval(e):null;
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
        try {
            //int funcCounter = Global.getFuncCounter();
            parameters.writeIC(e);
            Global.writeLine("LLAMAR_FUNCION null null FUNCION_" + id + "\n");
        } catch (IOException ex) {
            Logger.getLogger(Or.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
