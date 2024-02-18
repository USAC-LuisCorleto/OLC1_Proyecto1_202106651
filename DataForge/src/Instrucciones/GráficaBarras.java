package Instrucciones;

import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class GráficaBarras {

    private static ArrayList<JFreeChart> listaGráficas = new ArrayList<>();

    public static JFreeChart generarGráfica(String tipo, String titulo, ArrayList<String> valoresEjeX, ArrayList<String> valoresEjeY, String tituloX, String tituloY) {
        switch (tipo) {
            case "graphBar" -> {
                JFreeChart chart = generarGráficaBarras(titulo, valoresEjeX, valoresEjeY, tituloX, tituloY);
                listaGráficas.add(chart);
                return chart;
            }
            default -> {
                return null;
            }
        }
    }

    public static JFreeChart generarGráficaBarras(String titulo, ArrayList<String> valoresEjeX, ArrayList<String> valoresEjeY, String tituloX, String tituloY) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        titulo = titulo.replaceAll("\"", "");
        tituloX = tituloX.replaceAll("\"", "");
        tituloY = tituloY.replaceAll("\"", "");

        for (int i = 0; i < valoresEjeX.size(); i++) {
            valoresEjeX.set(i, valoresEjeX.get(i).replaceAll("\"", ""));
        }

        for (int i = 0; i < valoresEjeY.size(); i++) {
            valoresEjeY.set(i, valoresEjeY.get(i).replaceAll("\"", ""));
        }

        double[] valoresY = new double[valoresEjeY.size()];
        for (int i = 0; i < valoresEjeY.size(); i++) {
            valoresY[i] = Double.parseDouble(valoresEjeY.get(i));
        }

        for (int i = 0; i < valoresEjeX.size(); i++) {
            dataset.addValue(valoresY[i], tituloY, valoresEjeX.get(i));
        }

        JFreeChart chart = ChartFactory.createBarChart(
                titulo,
                tituloX,
                tituloY,
                dataset
        );

        return chart;
    }

    public static ArrayList<JFreeChart> getListaGráficas() {
        return listaGráficas;
    }
}
