package Instrucciones;

import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class GráficaPie {

    public static JFreeChart generarGráfica(String tipo, ArrayList<String> labels, ArrayList<String> values, String title) {
        switch (tipo) {
            case "graphPie" -> {
                JFreeChart chart = generarGráficaPie(labels, values, title);
                GráficaBarras.listaGráficas.add(chart);
                return chart;
            }
            default -> {
                return null;
            }
        }
    }

    public static JFreeChart generarGráficaPie(ArrayList<String> labels, ArrayList<String> values, String title) {
        DefaultPieDataset dataset = new DefaultPieDataset();

        for (int i = 0; i < labels.size(); i++) {
            try {
                double value = Double.parseDouble(values.get(i).replaceAll("\"", ""));
                dataset.setValue(labels.get(i).replaceAll("\"", ""), value);
            } catch (NumberFormatException e) {
                System.out.println("Error al convertir el valor '" + values.get(i) + "' a double. Se omitirá este valor.");
            }
        }

        return ChartFactory.createPieChart(
                title.replaceAll("\"", ""),
                dataset,
                true,
                true,
                false
        );
    }
}
