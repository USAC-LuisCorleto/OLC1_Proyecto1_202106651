package Instrucciones;

public class Aritméticas {

    private static boolean esNumero(String str) {
        try {
            Double.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String realizarOperación(String operacion, String izq, String der) {
        double valIzq, valDer;
        try {
            if (esNumero(izq)) {
                valIzq = Double.parseDouble(izq);
            } else {
                if (Variables.existeVariable(izq)) {
                    valIzq = Double.parseDouble(Instrucciones.Variables.obtenerVariable(izq));
                } else {
                    return "Error: Variable " + izq + " no encontrada";
                }
            }
            if (esNumero(der)) {
                valDer = Double.parseDouble(der);
            } else {
                if (Variables.existeVariable(der)) {
                    valDer = Double.parseDouble(Instrucciones.Variables.obtenerVariable(der));
                } else {
                    return "Error: Variable " + der + " no encontrada";
                }
            }
        } catch (NumberFormatException e) {
            return "Error: El valor no es numérico";
        }

        switch (operacion) {
            case "SUM" -> {
                return String.valueOf(valIzq + valDer);
            }
            case "RES" -> {
                return String.valueOf(valIzq - valDer);
            }
            case "MUL" -> {
                return String.valueOf(valIzq * valDer);
            }
            case "DIV" -> {
                if (valDer != 0) {
                    return String.valueOf(valIzq / valDer);
                } else {
                    return "Error: División por cero";
                }
            }
            case "MOD" -> {
                return String.valueOf(valIzq % valDer);
            }
            default -> {
                return "Error: Operación no válida";
            }
        }
    }
}
