package calculatorcup;

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
%}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace    = {LineTerminator} | [ \t\f]

Digit          = [0-9]
Number         = {Digit} {Digit}*
Letter         = [a-zA-Z]
Identifier     = {Letter} ({Letter}|{Digit})* 
String         = \".*\" 

%%

<YYINITIAL> { 
    "break"         { 
                        tokenPool.add("BREAK");
                        return symbol(sym.BREAK); 
                    }
    "main"          { 
                        tokenPool.add("MAIN");
                        return symbol(sym.MAIN); 
                    }
    "if"            { 
                        tokenPool.add("IF");
                        return symbol(sym.IF); 
                    }
    "while"         { 
                        tokenPool.add("WHILE");
                        return symbol(sym.WHILE); 
                    }
    "else"          { 
                        tokenPool.add("ELSE");
                        return symbol(sym.ELSE); 
                    }
    "putw"          { 
                        tokenPool.add("PUTW");
                        return symbol(sym.PUTW); 
                    }
    "puts"          { 
                        tokenPool.add("PUTS");
                        return symbol(sym.PUTS); 
                    }
    {String}        { 
                        String temp = yytext();
                        tokenPool.add("STRING, " + temp);
                        return symbol(sym.STRING, temp); 
                    } 
    {Number}        { 
                        String temp = yytext();
                        tokenPool.add("NUMBER, " + temp);
                        return symbol(sym.INT, new Integer(Integer.parseInt(temp))); }
    {Identifier}    { 
                        String temp = yytext();
                        tokenPool.add("INDENT, " + temp);
                        return symbol(sym.IDENT, temp); 
                    }   
    "+"             { 
                        tokenPool.add("PLUS");
                        return symbol(sym.PLUS); 
                    }
    "-"             { 
                        tokenPool.add("MINUS");
                        return symbol(sym.MINUS); 
                    }
    "*"             { 
                        tokenPool.add("MUL");
                        return symbol(sym.MUL); 
                    }
    "/"             { 
                        tokenPool.add("DIV");
                        return symbol(sym.DIV); 
                    }
    "("             { 
                        tokenPool.add("LPAREN");
                        return symbol(sym.LPAREN); 
                    }
    ")"             { 
                        tokenPool.add("RPAREN");
                        return symbol(sym.RPAREN); 
                    }
    "="             { 
                        tokenPool.add("ASSIGN");
                        return symbol(sym.ASSIGN); 
                    }
    "<"             { 
                        tokenPool.add("MINOR");
                        return symbol(sym.MINOR); 
                    }
    ">"             { 
                        tokenPool.add("MAYOR");
                        return symbol(sym.MAYOR); 
                    }
    "=="            { 
                        tokenPool.add("EQUAL");
                        return symbol(sym.EQUAL); 
                    }
    "!="            { 
                        tokenPool.add("NOTEQUAL");
                        return symbol(sym.NOTEQUAL); 
                    }
    "||"            { 
                        tokenPool.add("OR");
                        return symbol(sym.OR); 
                    }
    "&&"            { 
                        tokenPool.add("AND");
                        return symbol(sym.AND); 
                    }
    ";"             { 
                        tokenPool.add("SEMICOLON");
                        return symbol(sym.SEMICOLON); 
                    }
    "{"             { 
                        tokenPool.add("LBRACKET");
                        return symbol(sym.LBRACKET); 
                    }
    "}"             { 
                        tokenPool.add("RBRACKET");
                        return symbol(sym.RBRACKET); 
                    }
    "\""            { 
                        tokenPool.add("QUOTE");
                        return symbol(sym.QUOTE); 
                    }

    {WhiteSpace} {}
}

.|\n            { throw new Error("Illegal character <" + yytext() + ">");}

