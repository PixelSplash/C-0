/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c0;

import java.io.IOException;

/**
 *
 * @author sescalo
 */
public class GenFinalCode {
    
    public void writeFinalCode(String ICode) throws IOException{
        String[] newICode = ICode.split(System.getProperty("line.separator"));
        String spaceLine = 
                "                                        ";
        for (String x : newICode) {
            String[] line = x.split("\\s+");
            String instruction = line[0];
            String op1 = line[1];
            String op2 = line[2];
            String res = x.substring(instruction.length()+op1.length()+op2.length()+3);
            switch(instruction) {
                case "CARGAR_DIRECCION":
                    Global.writeLine(spaceLine+"MOVE /"+op1+" , /"+res+"\n");
                    break;
                case "CARGAR_VALOR":
                    Global.writeLine(spaceLine+"MOVE #"+op1+" , /"+res+"\n");
                    break;
                case "SUMAR": 
                    Global.writeLine(spaceLine+"ADD /"+op1+" , /"+op2+"\n");
                    Global.writeLine(spaceLine+"MOVE .A , /"+res+"\n");
                    break;
                case "RESTAR":
                    Global.writeLine(spaceLine+"SUB /"+op1+" , /"+op2+"\n");
                    Global.writeLine(spaceLine+"MOVE .A , /"+res+"\n");
                    break;
                case "MULTIPLICAR":
                    Global.writeLine(spaceLine+"MUL /"+op1+" , /"+op2+"\n");
                    Global.writeLine(spaceLine+"MOVE .A , /"+res+"\n");
                    break;
                case "DIVIDIR":
                    Global.writeLine(spaceLine+"DIV /"+op1+" , /"+op2+"\n");
                    Global.writeLine(spaceLine+"MOVE .A , /"+res+"\n");
                    break;
                case "OR":
                    Global.writeLine(spaceLine+"OR /"+op1+" , /"+op2+"\n");
                    Global.writeLine(spaceLine+"MOVE .A , /"+res+"\n");
                    break;
                case "AND":
                    Global.writeLine(spaceLine+"AND /"+op1+" , /"+op2+"\n");
                    Global.writeLine(spaceLine+"MOVE .A , /"+res+"\n");
                    break;
                case "MAYOR":
                    Global.writeLine(spaceLine+"CMP /"+op2+" , /"+op1+"\n");
                    Global.writeLine(spaceLine+"BN $5\n");
                    Global.writeLine(spaceLine+"MOVE #0 , /"+res+"\n");
                    Global.writeLine(spaceLine+"BR $3\n");
                    Global.writeLine(spaceLine+"MOVE #1 , /"+res+"\n");
                    break;
                case "MENOR":
                    Global.writeLine(spaceLine+"CMP /"+op1+" , /"+op2+"\n");
                    Global.writeLine(spaceLine+"BN $5\n");
                    Global.writeLine(spaceLine+"MOVE #0 , /"+res+"\n");
                    Global.writeLine(spaceLine+"BR $3\n");
                    Global.writeLine(spaceLine+"MOVE #1 , /"+res+"\n");
                    break;
                case "IGUAL":
                    Global.writeLine(spaceLine+"CMP /"+op1+" , /"+op2+"\n");
                    Global.writeLine(spaceLine+"BZ $5\n");
                    Global.writeLine(spaceLine+"MOVE #0 , /"+res+"\n");
                    Global.writeLine(spaceLine+"BR $3\n");
                    Global.writeLine(spaceLine+"MOVE #1 , /"+res+"\n");
                    break;
                case "DISTINTO":
                    Global.writeLine(spaceLine+"CMP /"+op2+" , /"+op1+"\n");
                    Global.writeLine(spaceLine+"BZ $5\n");
                    Global.writeLine(spaceLine+"MOVE #1 , /"+res+"\n");
                    Global.writeLine(spaceLine+"BR $3\n");
                    Global.writeLine(spaceLine+"MOVE #0 , /"+res+"\n");
                    break;
                case "ETIQUETA":
                    String tmp = res+":"+spaceLine;
                    Global.writeLine(tmp.substring(0, spaceLine.length())+"NOP\n");
                    break;
                case "SALTAR_CONDICION":
                    Global.writeLine(spaceLine+"CMP #0 , /"+op1+"\n");
                    Global.writeLine(spaceLine+"BZ /"+res+"\n");
                    break;
                case "SALTAR_ETIQUETA":
                    Global.writeLine(spaceLine+"BR /"+res+"\n");
                    break;
                case "IMPRIMIR_ENTERO":
                    Global.writeLine(spaceLine+"WRINT /"+op1+"\n");
                    break;
                case "IMPRIMIR_CADENA":
                    Global.writeLine(spaceLine+"WRSTR /"+op1+"\n");
                    break;
                case "PONER_CADENA":
                    tmp = op1+": DATA"+spaceLine;
                    Global.writeLine(tmp.substring(0, spaceLine.length())+res+"\n");
                    break;
                case "LLAMAR_FUNCION":
                    Global.writeLine(spaceLine+"CALL /"+res+"\n");
                    break;
                case "METER_A_PILA":
                    Global.writeLine(spaceLine+"PUSH /"+res+"\n");
                    break;
                case "SACAR_DE_PILA":
                    Global.writeLine(spaceLine+"POP /"+res+"\n");
                    break;
                case "RETORNO":
                    Global.writeLine(spaceLine+"RET\n");
                    break;
                case "FIN":
                    break;
            }
        }
    }
    
}
