package Reportes;

public class Token {

    String token, lexema, línea, columna;

    public Token(String nombre, String lexema, String línea, String columna) {
        this.token = nombre;
        this.lexema = lexema;
        this.línea = línea;
        this.columna = columna;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String nombre) {
        this.token = nombre;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public String getLínea() {
        return línea;
    }

    public void setLínea(String línea) {
        this.línea = línea;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

}
