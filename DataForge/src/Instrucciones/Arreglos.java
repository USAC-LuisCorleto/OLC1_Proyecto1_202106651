package Instrucciones;

import Reportes.ReporteSímbolos;
import Reportes.SímbolosA;
import java.util.ArrayList;
import java.util.HashMap;

public class Arreglos {

    public static final HashMap<String, ArrayList<String>> arreglos = new HashMap<>();

    public static void asignarArray(String nombre, ArrayList<String> valores) {
        ArrayList<String> valoresAsignados = new ArrayList<>();
        for (String valor : valores) {
            valoresAsignados.add(valor);
        }
        arreglos.put(nombre, valoresAsignados);

    }

    public static ArrayList<String> obtenerArray(String nombre) {
        return arreglos.getOrDefault(nombre, new ArrayList<>());
    }

    public static boolean existeArray(String nombre) {
        return arreglos.containsKey(nombre);
    }

    public static void datosReporteArreglo(String nombre, String tipo, ArrayList<String> valores, String columna, String fila) {
        ReporteSímbolos.TablaSímbolosArreglos.add(new SímbolosA(nombre, tipo, valores, columna, fila));
    }
}
