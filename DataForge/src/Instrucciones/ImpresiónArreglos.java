package Instrucciones;

import static Analizadores.Parser.resultado;
import java.util.ArrayList;

public class ImpresiónArreglos {

    public static String imprimirArreglo(String titulo, ArrayList<String> arreglo) {
        StringBuilder consola = new StringBuilder();

        if (Variables.existeVariable(titulo)) {
            titulo = Variables.obtenerVariable(titulo);
        }

        consola.append("--------------").append(System.lineSeparator());
        consola.append(titulo).append(System.lineSeparator());
        consola.append("--------------").append(System.lineSeparator());

        for (String elemento : arreglo) {
            consola.append(elemento).append(System.lineSeparator());
        }

        resultado += consola.toString();
        return resultado;
    }

    public static String imprimirArregloPorNombre(String titulo, String nombreArreglo) {
        StringBuilder consola = new StringBuilder();

        if (Variables.existeVariable(titulo)) {
            titulo = Variables.obtenerVariable(titulo);
        }

        ArrayList<String> arreglo = Arreglos.obtenerArray(nombreArreglo);

        consola.append("--------------").append(System.lineSeparator());
        consola.append(titulo).append(System.lineSeparator());
        consola.append("--------------").append(System.lineSeparator());

        for (String elemento : arreglo) {
            consola.append(elemento).append(System.lineSeparator());
        }

        resultado += consola.toString();
        return resultado;
    }
}
