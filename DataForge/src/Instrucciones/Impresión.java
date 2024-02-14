package Instrucciones;

import static Analizadores.Parser.resultado;
import java.util.ArrayList;

public class Impresión {

    public static String instrucciónPrint(ArrayList<String> valores) {
        StringBuilder consola = new StringBuilder();

        for (int i = 0; i < valores.size(); i++) {
            String valor = valores.get(i);

            if (valor.startsWith("\"") && valor.endsWith("\"")) {
                consola.append(valor.substring(1, valor.length() - 1));
            } else {
                if (Variables.existeVariable(valor)) {
                    consola.append(Variables.obtenerVariable(valor));
                } else {
                    try {
                        consola.append(Double.parseDouble(valor));
                    } catch (NumberFormatException e) {
                        System.out.println("Error: El valor " + valor + " no es numérico ni una variable existente.");
                        return null;
                    }
                }
            }

            if (i < valores.size() - 1) {
                consola.append(", ");
            }
        }
        consola.append(System.lineSeparator());
        resultado += consola.toString();
        return resultado;
    }
}
