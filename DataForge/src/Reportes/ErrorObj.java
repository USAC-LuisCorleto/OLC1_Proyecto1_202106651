package Reportes;

public class ErrorObj {

    String tipo, lexema, fila, columna;

    public ErrorObj(String tipo, String lexema, String línea, String columna) {
        this.tipo = tipo;
        this.lexema = lexema;
        this.fila = línea;
        this.columna = columna;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public String getLínea() {
        return fila;
    }

    public void setLínea(String fila) {
        this.fila = fila;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

}
