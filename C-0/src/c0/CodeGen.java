/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c0;

import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author sescalo
 */
public class CodeGen {
    
    public void writeToFile(){
        try{
            PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
            writer.println("The first line");
            writer.println("The second line");
            writer.close();
        } catch (IOException e) {
            // do something
    }
    }
}
