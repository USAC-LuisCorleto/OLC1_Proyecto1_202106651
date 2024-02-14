package Instrucciones;

import java.util.HashMap;

public class Variables {

    private static final HashMap<String, Double> Variables = new HashMap<>();

    public static void asignarVariable(String nombre, String valor) {
        try {
            double valorNumerico = Double.parseDouble(valor);
            Variables.put(nombre, valorNumerico);
        } catch (NumberFormatException e) {
            System.out.println("Error: el valor no es numérico para la variable " + nombre);
        }
    }

    public static double obtenerVariable(String nombre) {
        return Variables.getOrDefault(nombre, 0.0);
    }

    public static boolean existeVariable(String nombre) {
        return Variables.containsKey(nombre);
    }
}
