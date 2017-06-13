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
    public static int directionCount = 10000;
    public static final String FILENAME = "IntermediateCode.txt";
    public static final String FILENAMEFINAL = "FinalCode.txt";
    private static int whileCounter = 1;
    private static int ifCounter = 1;
    public static ArrayList<String> tokenPool = new ArrayList<String>();
    public static ArrayList<String> outputs = new ArrayList<String>();
    public static ArrayList<String> ICStrings = new ArrayList<String>();
    public static FileWriter file;
    public static BufferedWriter  buffer;
    public static void openFile(String filename) throws IOException{ 
        file = new FileWriter(filename);
        buffer = new BufferedWriter(file);}
    public static void writeLine(String str) throws IOException{ buffer.write(str);}
    public static void closeFile() throws IOException{ buffer.close();
    file.close();
    }
    public static void writeICStrings() throws IOException{
        String res = "";
        int i = 1;
        for(String x: ICStrings){
            res += ("PONER_CADENA CADENA_" + i + " null " + x + "\n");
            i++;
        }
        writeLine(res);
    }
    public static int addICString(String str){
        ICStrings.add(str);
        return (ICStrings.size());
    }

    public static int getWhileCounter() {
        
        return whileCounter++;
    }

    public static int getIfCounter() {
        return ifCounter++;
    }
    
    public static void clear(){
        directionCount = 10000;
        whileCounter = 1;
        ifCounter = 1;
        tokenPool.clear();
        outputs.clear();
        ICStrings.clear();
    }
}
