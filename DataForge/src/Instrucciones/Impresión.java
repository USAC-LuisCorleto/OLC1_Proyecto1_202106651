package Instrucciones;

import static Analizadores.Parser.resultado;
import java.util.ArrayList;

public class Impresión {

    public static String instrucciónPrint(ArrayList<String> valores) {
        StringBuilder consola = new StringBuilder();

        for (int i = 0; i < valores.size(); i++) {
            String valor = valores.get(i);
            consola.append(valor);

            if (i < valores.size() - 1) {
                consola.append(", ");
            }
        }
        consola.append(System.lineSeparator());
        resultado += consola.toString();
        return resultado;
    }
}
