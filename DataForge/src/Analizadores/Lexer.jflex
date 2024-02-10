// ------------  Paquete e importaciones ------------
package Analizadores; 

import java_cup.runtime.*;

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
%} 

// ------> Expresiones Regulares 
/*-----PALABRAS RESERVADAS-----*/
INICIO_CODIGO = "PROGRAM"
FIN_CODIGO = "END PROGRAM"
FIN_DECLARACION = "end"
VAR = "var"
DOUBLE = "double"
CHAR = "char[]"

/*-----PRÍNCIPAL-----*/
ENTERO = [0-9]+
DECIMAL = [0-9]+(\.[0-9]+)?
LETRA = [a-zA-ZÑñ]
ID_VAR = {LETRA}({LETRA}|{ENTERO}|"_")*
CADENA = [\"][^\"\n]+[\"]

/*-----SÍMBOLOS-----*/
DOS_PUNTOS = ":"
PUNTO_COMA = ";"
MENORQUE = "<"
MAYORQUE = ">"
GUION = "-"



%%
// ------------  Reglas Lexicas -------------------
/*-----PALABRAS RESERVADAS-----*/
{INICIO_CODIGO}  { return new Symbol(sym.INICIO_CODIGO, yycolumn, yyline, yytext()); }
{FIN_CODIGO}  { return new Symbol(sym.FIN_CODIGO, yycolumn, yyline, yytext()); }
{FIN_DECLARACION}  { return new Symbol(sym.FIN_DECLARACION, yycolumn, yyline, yytext()); }
{VAR}  { return new Symbol(sym.VAR, yycolumn, yyline, yytext()); }
{DOUBLE}  { return new Symbol(sym.DOUBLE, yycolumn, yyline, yytext()); }
{CHAR}  { return new Symbol(sym.CHAR, yycolumn, yyline, yytext()); }

/*-----PRÍNCIPAL-----*/
{ENTERO}  { return new Symbol(sym.ENTERO, yycolumn, yyline, yytext()); }
{DECIMAL}  { return new Symbol(sym.DECIMAL, yycolumn, yyline, yytext()); }
{LETRA}  { return new Symbol(sym.LETRA, yycolumn, yyline, yytext()); }
{ID_VAR}  { return new Symbol(sym.ID_VAR, yycolumn, yyline, yytext()); }
{CADENA}  { return new Symbol(sym.CADENA, yycolumn, yyline, yytext()); }

/*-----SÍMBOLOS-----*/
{DOS_PUNTOS}  { return new Symbol(sym.DOS_PUNTOS, yycolumn, yyline, yytext()); }
{PUNTO_COMA}  { return new Symbol(sym.PUNTO_COMA, yycolumn, yyline, yytext()); }
{MENORQUE}  { return new Symbol(sym.MENORQUE, yycolumn, yyline, yytext()); }
{MAYORQUE}  { return new Symbol(sym.MAYORQUE, yycolumn, yyline, yytext()); }
{GUION}  { return new Symbol(sym.GUION, yycolumn, yyline, yytext()); }

//------> Ingorados 
[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}

//------> Errores Léxicos 
.           	{ System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn); }
