/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author sescalo
 */
public class Main extends Tree{
    Tree expression;
    
    public Main(Tree exp){
        expression = exp;
    }
    
    public Integer eval(Environment e) {
        /*addToken(Main)
      addToken(LPPAREN)

*/
        Integer ret = expression.eval(e);
        
        //addToken(RPAREN)
        return ret;
    }
    
    public void print() {
        System.out.print("(MAIN ");
        expression.print();
        System.out.print(")");
    }
    
}
