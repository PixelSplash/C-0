package c0;

import java_cup.runtime.*;
import java.util.ArrayList;

%%

%class Lexer
%unicode
%cup
%line
%column

%{
    ArrayList<String> tokenPool = new ArrayList<String>();
    ArrayList<String> putsOutput = new ArrayList<String>();

    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }

    public ArrayList<String> getTokenPool(){
        return this.tokenPool;
    }

    public ArrayList<String> getPutsOutput(){
        return this.putsOutput;
    }

    Global global = new Global();
%}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace    = {LineTerminator} | [ \t\f]

Digit          = [0-9]
Number         = {Digit} {Digit}*
Letter         = [a-zA-Z]
Identifier     = {Letter} ({Letter}|{Digit})* 
String         = \"([\x20-\x21\x23-\xFE])*\" 

%%

<YYINITIAL> { 
    "break"         { 
                        global.tokenPool.add("BREAK");
                        return symbol(sym.BREAK); 
                    }
    "return"         { 
                        global.tokenPool.add("RETURN");
                        return symbol(sym.RETURN); 
                    }
    "main"          { 
                        global.tokenPool.add("MAIN");
                        return symbol(sym.MAIN); 
                    }
    "if"            { 
                        global.tokenPool.add("IF");
                        return symbol(sym.IF); 
                    }
    "while"         { 
                        global.tokenPool.add("WHILE");
                        return symbol(sym.WHILE); 
                    }
    "else"          { 
                        global.tokenPool.add("ELSE");
                        return symbol(sym.ELSE); 
                    }
    "putw"          { 
                        global.tokenPool.add("PUTW");
                        return symbol(sym.PUTW); 
                    }
    "puts"          { 
                        global.tokenPool.add("PUTS");
                        return symbol(sym.PUTS); 
                    }
    "int"           {
                        global.tokenPool.add("INTT");
                        return symbol(sym.INTT);
                    }
    {String}        { 
                        String temp = yytext();
                        global.tokenPool.add("STRING, " + temp);
                        return symbol(sym.STRING, temp); 
                    } 
    {Number}        { 
                        String temp = yytext();
                        global.tokenPool.add("NUMBER, " + temp);
                        return symbol(sym.INT, new Integer(Integer.parseInt(temp))); }
    {Identifier}    { 
                        String temp = yytext();
                        global.tokenPool.add("IDENT, " + temp);
                        return symbol(sym.IDENT, temp); 
                    }   
    "+"             { 
                        global.tokenPool.add("PLUS");
                        return symbol(sym.PLUS); 
                    }
    "-"             { 
                        global.tokenPool.add("MINUS");
                        return symbol(sym.MINUS); 
                    }
    "*"             { 
                        global.tokenPool.add("MUL");
                        return symbol(sym.MUL); 
                    }
    "/"             { 
                        global.tokenPool.add("DIV");
                        return symbol(sym.DIV); 
                    }
    "("             { 
                        global.tokenPool.add("LPAREN");
                        return symbol(sym.LPAREN); 
                    }
    ")"             { 
                        global.tokenPool.add("RPAREN");
                        return symbol(sym.RPAREN); 
                    }
    "="             { 
                        global.tokenPool.add("ASSIGN");
                        return symbol(sym.ASSIGN); 
                    }
    "<"             { 
                        global.tokenPool.add("MINOR");
                        return symbol(sym.MINOR); 
                    }
    ">"             { 
                        global.tokenPool.add("MAYOR");
                        return symbol(sym.MAYOR); 
                    }
    "=="            { 
                        global.tokenPool.add("EQUAL");
                        return symbol(sym.EQUAL); 
                    }
    "!="            { 
                        global.tokenPool.add("NOTEQUAL");
                        return symbol(sym.NOTEQUAL); 
                    }
    "||"            { 
                        global.tokenPool.add("OR");
                        return symbol(sym.OR); 
                    }
    "&&"            { 
                        global.tokenPool.add("AND");
                        return symbol(sym.AND); 
                    }
    ";"             { 
                        global.tokenPool.add("SEMICOLON");
                        return symbol(sym.SEMICOLON); 
                    }
    "{"             { 
                        global.tokenPool.add("LBRACKET");
                        return symbol(sym.LBRACKET); 
                    }
    "}"             { 
                        global.tokenPool.add("RBRACKET");
                        return symbol(sym.RBRACKET); 
                    }
    "\""            { 
                        global.tokenPool.add("QUOTE");
                        return symbol(sym.QUOTE); 
                    }
    ","            { 
                        global.tokenPool.add("COMA");
                        return symbol(sym.COMA); 
                    }

    {WhiteSpace} {}
}

.|\n            { throw new Error("Illegal character <" + yytext() + ">");}

