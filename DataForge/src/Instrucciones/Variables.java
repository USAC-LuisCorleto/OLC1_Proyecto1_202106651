package Instrucciones;

import java.util.HashMap;

public class Variables {

    private static final HashMap<String, String> variables = new HashMap<>();

    public static void asignarVariable(String nombre, String valor) {
        variables.put(nombre, valor);
    }

    public static String obtenerVariable(String nombre) {
        return variables.getOrDefault(nombre, "");
    }

    public static boolean existeVariable(String nombre) {
        return variables.containsKey(nombre);
    }
}
