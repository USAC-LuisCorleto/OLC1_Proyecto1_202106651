package Instrucciones;

import Reportes.ReporteSímbolos;
import Reportes.SímbolosV;
import java.util.HashMap;

public class Variables {

    private static final HashMap<String, String> variables = new HashMap<>();

    public static void asignarVariable(String nombre, String valor) {
        if (existeVariable(valor)) {
            String nuevoValor = obtenerVariable(valor);
            variables.put(nombre, nuevoValor);
            ReporteSímbolos.TablaSímbolosVariables.add(new SímbolosV(nombre, nuevoValor));
        } else {
            variables.put(nombre, valor);
            ReporteSímbolos.TablaSímbolosVariables.add(new SímbolosV(nombre, valor));
        }
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
}
