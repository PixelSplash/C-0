/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c0;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;

/**
 *
 * @author bryam
 */
public class Global {
    private static final String FILENAME = "/home/sescalo/NetBeansProjects/C-0/IntermediateCode.txt";
    
    public static ArrayList<String> tokenPool = new ArrayList<String>();
    public static ArrayList<String> outputs = new ArrayList<String>();
    public static FileWriter file;
    public static BufferedWriter  buffer;
    public static void openFile() throws IOException{ 
        file = new FileWriter(FILENAME);
        buffer = new BufferedWriter(file);}
    public static void writeLine(String str) throws IOException{ buffer.write(str);}
    public static void closeFile() throws IOException{ buffer.close();
    file.close();
    }
}
