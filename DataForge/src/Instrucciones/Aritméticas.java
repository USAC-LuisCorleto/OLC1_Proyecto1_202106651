package Instrucciones;

public class Aritméticas {

    public static String realizarOperación(String operacion, String izq, String der) {
        double valIzq, valDer;
        try {
            valIzq = Double.parseDouble(izq);
            valDer = Double.parseDouble(der);
        } catch (NumberFormatException e) {
            return "Error: Entrada no válida";
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
