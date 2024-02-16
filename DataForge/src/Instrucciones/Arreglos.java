package Instrucciones;

import Reportes.ReporteSímbolos;
import Reportes.SímbolosA;
import java.util.ArrayList;
import java.util.HashMap;

public class Arreglos {

    private static final HashMap<String, ArrayList<String>> arreglos = new HashMap<>();

    public static void asignarArray(String nombre, ArrayList<String> valores) {
        arreglos.put(nombre, valores);
        ReporteSímbolos.TablaSímbolosArreglos.add(new SímbolosA(nombre, valores));
    }

    public static ArrayList<String> obtenerArray(String nombre) {
        return arreglos.getOrDefault(nombre, new ArrayList<>());
    }

    public static boolean existeArray(String nombre) {
        return arreglos.containsKey(nombre);
    }
}
