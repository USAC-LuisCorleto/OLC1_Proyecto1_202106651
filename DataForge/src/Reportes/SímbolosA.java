package Reportes;

import java.util.ArrayList;

public class SímbolosA {

    String nombre, tipo, columna, fila;
    ArrayList<String> valores;

    public SímbolosA(String nombre, String tipo, ArrayList<String> valores, String columna, String fila) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valores = valores;
        this.columna = columna;
        this.fila = fila;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<String> getValores() {
        return valores;
    }

    public void setValores(ArrayList<String> valores) {
        this.valores = valores;
    }

}
