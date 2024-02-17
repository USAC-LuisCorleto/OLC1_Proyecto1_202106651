// ------------  Paquete e importaciones ------------
package Analizadores; 

import java_cup.runtime.*;
import Reportes.ReporteTokens;
import Reportes.Token;
import Reportes.ReporteErrores;
import Reportes.ErrorObj;

%%	
//-------> Directivas (No tocar)

%public 
%class Lexer
%cup
%char
%column
%line
%unicode
%ignorecase

%{ 
    ReporteTokens reporte = new ReporteTokens();
    ReporteErrores reporteE = new ReporteErrores();
%} 

// ------> Expresiones Regulares 
/*-----PALABRAS RESERVADAS-----*/
INICIO_CODIGO = "PROGRAM"
FIN_CODIGO = "END PROGRAM"
FIN_DECLARACION = "end"
VAR = "var"
DOUBLE = "double"
CHAR = "char[]"
ARRAY = "arr"
SUMA = "SUM"
RESTA = "RES"
MULTIPLICACION = "MUL"
DIVISION = "DIV"
MODULO = "MOD"
CONSOLE = "console"
IMPRIMIR = "print"
MEDIA = "Media"
MEDIANA = "Mediana"
MODA = "Moda"
VARIANZA = "Varianza"
MAX = "Max"
MIN = "Min"
COLUMN = "column"

/*-----PRÍNCIPAL-----*/
ENTERO = [0-9]+
DECIMAL = [0-9]+(\.[0-9]+)?
LETRA = [a-zA-ZÑñ]
ID_VAR = {LETRA}({LETRA}|{ENTERO}|"_")*
ID_ARRAY = @{LETRA}({LETRA}|{ENTERO}|"_")*
CADENA = \"[^\"]*\"

/*-----CONCATENADORES-----*/
CORCHETE_APERTURA = "["
CORCHETE_CIERRE = "]"
PARENTESIS_APERTURA = "("
PARENTESIS_CIERRE = ")"


/*-----SÍMBOLOS-----*/
DOS_PUNTOS = ":"
PUNTO_COMA = ";"
MENORQUE = "<"
MAYORQUE = ">"
GUION = "-"
COMA = ","
IGUAL = "="


%%
// ------------  Reglas Lexicas -------------------
/*-----PALABRAS RESERVADAS-----*/
{INICIO_CODIGO}  { 
    reporte.TablaTokens.add(new Token("INICIO_CODIGO", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.INICIO_CODIGO, yycolumn, yyline, yytext()); 
}
{FIN_CODIGO}  { 
    reporte.TablaTokens.add(new Token("FIN_CODIGO", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.FIN_CODIGO, yycolumn, yyline, yytext()); 
}
{FIN_DECLARACION}  { 
    reporte.TablaTokens.add(new Token("FIN_DECLARACION", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.FIN_DECLARACION, yycolumn, yyline, yytext()); 
}
{VAR}  { 
    reporte.TablaTokens.add(new Token("VAR", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.VAR, yycolumn, yyline, yytext()); 
}
{DOUBLE}  { 
    reporte.TablaTokens.add(new Token("DOUBLE", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.DOUBLE, yycolumn, yyline, yytext()); 
}
{CHAR}  { 
    reporte.TablaTokens.add(new Token("CHAR", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.CHAR, yycolumn, yyline, yytext()); 
}
{ARRAY}  { 
    reporte.TablaTokens.add(new Token("ARRAY", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.ARRAY, yycolumn, yyline, yytext()); 
}
{SUMA}  { 
    reporte.TablaTokens.add(new Token("SUMA", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.SUMA, yycolumn, yyline, yytext()); 
}
{RESTA}  { 
    reporte.TablaTokens.add(new Token("RESTA", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.RESTA, yycolumn, yyline, yytext()); 
}
{MULTIPLICACION}  { 
    reporte.TablaTokens.add(new Token("MULTIPLICACION", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.MULTIPLICACION, yycolumn, yyline, yytext()); 
}
{DIVISION}  { 
    reporte.TablaTokens.add(new Token("DIVISION", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.DIVISION, yycolumn, yyline, yytext()); 
}
{MODULO}  { 
    reporte.TablaTokens.add(new Token("MODULO", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.MODULO, yycolumn, yyline, yytext()); 
}
{CONSOLE}  { 
    reporte.TablaTokens.add(new Token("CONSOLE", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.CONSOLE, yycolumn, yyline, yytext()); 
}
{IMPRIMIR}  { 
    reporte.TablaTokens.add(new Token("IMPRIMIR", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.IMPRIMIR, yycolumn, yyline, yytext()); 
}
{MEDIA}  { 
    reporte.TablaTokens.add(new Token("MEDIA", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.MEDIA, yycolumn, yyline, yytext()); 
}
{MEDIANA}  { 
    reporte.TablaTokens.add(new Token("MEDIANA", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.MEDIANA, yycolumn, yyline, yytext()); 
}
{MODA}  { 
    reporte.TablaTokens.add(new Token("MODA", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.MODA, yycolumn, yyline, yytext()); 
}
{VARIANZA}  { 
    reporte.TablaTokens.add(new Token("VARIANZA", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.VARIANZA, yycolumn, yyline, yytext()); 
}
{MAX}  { 
    reporte.TablaTokens.add(new Token("MAX", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.MAX, yycolumn, yyline, yytext()); 
}
{MIN}  { 
    reporte.TablaTokens.add(new Token("MIN", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.MIN, yycolumn, yyline, yytext()); 
}
{COLUMN}  { 
    reporte.TablaTokens.add(new Token("COLUMN", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.COLUMN, yycolumn, yyline, yytext()); 
}

/*-----PRÍNCIPAL-----*/
{ENTERO}  { 
    reporte.TablaTokens.add(new Token("ENTERO", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.ENTERO, yycolumn, yyline, yytext()); 
}
{DECIMAL}  { 
    reporte.TablaTokens.add(new Token("DECIMAL", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.DECIMAL, yycolumn, yyline, yytext()); 
}
{LETRA}  { 
    reporte.TablaTokens.add(new Token("LETRA", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.LETRA, yycolumn, yyline, yytext()); 
}
{ID_VAR}  { 
    reporte.TablaTokens.add(new Token("ID_VAR", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.ID_VAR, yycolumn, yyline, yytext()); 
}
{ID_ARRAY}  { 
    reporte.TablaTokens.add(new Token("ID_ARRAY", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.ID_ARRAY, yycolumn, yyline, yytext()); 
}
{CADENA}  { 
    reporte.TablaTokens.add(new Token("CADENA", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.CADENA, yycolumn, yyline, yytext()); 
}

/*-----CONCATENADORES-----*/
{CORCHETE_APERTURA}  { 
    reporte.TablaTokens.add(new Token("CORCHETE_APERTURA", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.CORCHETE_APERTURA, yycolumn, yyline, yytext()); 
}
{CORCHETE_CIERRE}  { 
    reporte.TablaTokens.add(new Token("CORCHETE_CIERRE", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.CORCHETE_CIERRE, yycolumn, yyline, yytext()); 
}
{PARENTESIS_APERTURA}  { 
    reporte.TablaTokens.add(new Token("PARENTESIS_APERTURA", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.PARENTESIS_APERTURA, yycolumn, yyline, yytext()); 
}
{PARENTESIS_CIERRE}  { 
    reporte.TablaTokens.add(new Token("PARENTESIS_CIERRE", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.PARENTESIS_CIERRE, yycolumn, yyline, yytext()); 
}

/*-----SÍMBOLOS-----*/
{DOS_PUNTOS}  { 
    reporte.TablaTokens.add(new Token("DOS_PUNTOS", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.DOS_PUNTOS, yycolumn, yyline, yytext()); 
}
{PUNTO_COMA}  { 
    reporte.TablaTokens.add(new Token("PUNTO_COMA", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.PUNTO_COMA, yycolumn, yyline, yytext()); 
}
{MENORQUE}  { 
    reporte.TablaTokens.add(new Token("MENORQUE", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.MENORQUE, yycolumn, yyline, yytext()); 
}
{MAYORQUE}  { 
    reporte.TablaTokens.add(new Token("MAYORQUE", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.MAYORQUE, yycolumn, yyline, yytext()); 
}
{GUION}  { 
    reporte.TablaTokens.add(new Token("GUION", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.GUION, yycolumn, yyline, yytext()); 
}
{COMA}  { 
    reporte.TablaTokens.add(new Token("COMA", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.COMA, yycolumn, yyline, yytext()); 
}
{IGUAL}  { 
    reporte.TablaTokens.add(new Token("IGUAL", yytext(), Integer.toString(yyline), Integer.toString(yycolumn))); 
    return new Symbol(sym.IGUAL, yycolumn, yyline, yytext()); 
}


//------> Ingorados 
[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}

//------> Errores Léxicos 
.           	{ 
    reporteE.TablaErroresLéxicos.add(new ErrorObj("Léxico", "El caracter " + yytext() + " no pertenece al lenguaje.", Integer.toString(yyline), Integer.toString(yycolumn))); 
    System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn); }
