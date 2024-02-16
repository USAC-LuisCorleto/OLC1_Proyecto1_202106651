package Reportes;

import java.util.ArrayList;

public class SímbolosA {

    String nombre;
    ArrayList<String> valores;

    public SímbolosA(String nombre, ArrayList<String> valores) {
        this.nombre = nombre;
        this.valores = valores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getValores() {
        return valores;
    }

    public void setValores(ArrayList<String> valores) {
        this.valores = valores;
    }

}
