package Instrucciones;

import static Analizadores.Parser.resultado;
import static Instrucciones.GráficaBarras.listaGráficas;
import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class Histograma {

    public static JFreeChart generarGráfica(String tipo, String titulo, ArrayList<String> valores) {
        switch (tipo) {
            case "Histogram" -> {
                JFreeChart chart = generarHistograma(titulo, valores);
                listaGráficas.add(chart);
                return chart;
            }
            default -> {
                return null;
            }
        }
    }

    public static JFreeChart generarHistograma(String titulo, ArrayList<String> values) {
        StringBuilder consola = new StringBuilder();
        ArrayList<Double> valores = new ArrayList<>();
        Set<Double> valoresUnicos = new HashSet<>();

        for (String str : values) {
            double valor = Double.valueOf(str);
            valores.add(valor);
            valoresUnicos.add(valor); // Añadir a un conjunto para eliminar duplicados
        }

        // Ordenar valores únicos de menor a mayor
        ArrayList<Double> valoresOrdenados = new ArrayList<>(valoresUnicos);
        Collections.sort(valoresOrdenados);

        Map<Double, Integer> frecuencias = calcularFrecuencias(valores);

        consola.append(titulo.replaceAll("\"", "")).append("\n");
        consola.append("═══════════════════════\n");
        consola.append(" Valor   Fb  Fa  Fr\n");
        consola.append("═══════════════════════\n");

        int faAcumulada = 0;
        for (Double valor : valoresOrdenados) {
            int frecuencia = frecuencias.get(valor);
            faAcumulada += frecuencia;

            double fr = (double) frecuencia / valores.size() * 100;

            consola.append(String.format("  %.0f      %d   %d   %.2f%%\n", valor, frecuencia, faAcumulada, fr));
        }

        consola.append("═══════════════════════\n");
        consola.append(String.format("Totales: %d   %d   100%%\n", valores.size(), valores.size()));

        JFreeChart chart = crearGraficoBarras(titulo, frecuencias);

        resultado += consola.toString();

        return chart;
    }

    private static Map<Double, Integer> calcularFrecuencias(ArrayList<Double> values) {
        Map<Double, Integer> frecuencias = new HashMap<>();

        for (double valor : values) {
            frecuencias.put(valor, frecuencias.getOrDefault(valor, 0) + 1);
        }

        return frecuencias;
    }

    private static JFreeChart crearGraficoBarras(String titulo, Map<Double, Integer> frecuencias) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        ArrayList<Double> valoresOrdenados = new ArrayList<>(frecuencias.keySet());
        Collections.sort(valoresOrdenados);
        titulo = titulo.replaceAll("\"", "");
        
        for (Double valor : valoresOrdenados) {
            int frecuencia = frecuencias.get(valor);
            dataset.addValue(frecuencia, "Frecuencia", Double.toString(valor));
        }

        return ChartFactory.createBarChart(
                titulo,
                "Valor",
                "Frecuencia",
                dataset);
    }
}
