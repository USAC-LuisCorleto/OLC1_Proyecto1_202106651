package Instrucciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Estadísticas {

    public static String realizarOperaciónEstadística(String operacion, ArrayList<String> valores) {
        String operacionLowerCase = operacion.toLowerCase();
        switch (operacionLowerCase) {
            case "media" -> {
                return calcularMedia(valores);
            }
            case "mediana" -> {
                return calcularMediana(valores);
            }
            case "moda" -> {
                return calcularModa(valores);
            }
            case "varianza" -> {
                return calcularVarianza(valores);
            }
            case "max" -> {
                return calcularMaximo(valores);
            }
            case "min" -> {
                return calcularMinimo(valores);
            }
            default -> {
                return "Error: Operación no válida";
            }
        }
    }

    private static String calcularMedia(ArrayList<String> valores) {
        double suma = 0;
        for (String valor : valores) {
            suma += Double.parseDouble(valor);
        }
        double media = suma / valores.size();
        return String.valueOf(media);
    }

    private static String calcularMediana(ArrayList<String> valores) {
        ArrayList<Double> numeros = new ArrayList<>();
        for (String valor : valores) {
            numeros.add(Double.valueOf(valor));
        }
        Collections.sort(numeros);
        int n = numeros.size();
        if (n % 2 == 0) {
            double mediana = (numeros.get(n / 2 - 1) + numeros.get(n / 2)) / 2.0;
            return String.valueOf(mediana);
        } else {
            double mediana = numeros.get(n / 2);
            return String.valueOf(mediana);
        }
    }

    private static String calcularModa(ArrayList<String> valores) {
        Map<String, Integer> frecuencia = new HashMap<>();
        for (String valor : valores) {
            frecuencia.put(valor, frecuencia.getOrDefault(valor, 0) + 1);
        }
        int maxFrecuencia = 0;
        String moda = null;
        for (Map.Entry<String, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                moda = entry.getKey();
                maxFrecuencia = entry.getValue();
            }
        }
        return moda;
    }

    private static String calcularVarianza(ArrayList<String> valores) {
        double media = Double.parseDouble(calcularMedia(valores));
        double sumaDiferenciasCuadradas = 0;
        for (String valor : valores) {
            double diferencia = Double.parseDouble(valor) - media;
            sumaDiferenciasCuadradas += diferencia * diferencia;
        }
        double varianza = sumaDiferenciasCuadradas / valores.size();
        return String.valueOf(varianza);
    }

    private static String calcularMaximo(ArrayList<String> valores) {
        double max = Double.MIN_VALUE;
        for (String valor : valores) {
            double num = Double.parseDouble(valor);
            if (num > max) {
                max = num;
            }
        }
        return String.valueOf(max);
    }

    private static String calcularMinimo(ArrayList<String> valores) {
        double min = Double.MAX_VALUE;
        for (String valor : valores) {
            double num = Double.parseDouble(valor);
            if (num < min) {
                min = num;
            }
        }
        return String.valueOf(min);
    }
}
