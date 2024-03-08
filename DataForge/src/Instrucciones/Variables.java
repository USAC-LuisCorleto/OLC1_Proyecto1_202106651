package Instrucciones;

import Reportes.ReporteSímbolos;
import Reportes.SímbolosV;
import java.util.HashMap;

public class Variables {

    public static final HashMap<String, String> variables = new HashMap<>();

    public static void asignarVariable(String nombre, String valor) {
        variables.put(nombre, valor);
    }

    public static String obtenerVariable(String nombre) {
        return variables.getOrDefault(nombre, "");
    }

    public static boolean existeVariable(String nombre) {
        return variables.containsKey(nombre);
    }

    public static HashMap<String, String> obtenerVariables() {
        return variables;
    }
    
    public static void datosReporteVariables(String nombre, String tipo, String valor, String columna, String linea){
        ReporteSímbolos.TablaSímbolosVariables.add(new SímbolosV(nombre, tipo, valor, columna, linea));
    }
}
