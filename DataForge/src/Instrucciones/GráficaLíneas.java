package Instrucciones;

import static Instrucciones.GráficaBarras.listaGráficas;
import java.util.ArrayList;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.data.category.DefaultCategoryDataset;

public class GráficaLíneas {

    public static JFreeChart generarGráfica(String tipo, String titulo, ArrayList<String> valoresEjeX, ArrayList<String> valoresEjeY, String tituloX, String tituloY) {
        String tipoLowerCase = tipo.toLowerCase();
        switch (tipoLowerCase) {
            case "graphline" -> {
                JFreeChart chart = generarGráficaLíneas(titulo, valoresEjeX, valoresEjeY, tituloX, tituloY);
                listaGráficas.add(chart);
                return chart;
            }
            default -> {
                return null;
            }
        }
    }

    public static JFreeChart generarGráficaLíneas(String titulo, ArrayList<String> valoresEjeX, ArrayList<String> valoresEjeY, String tituloX, String tituloY) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        titulo = titulo.replace("\"", "");

        for (int i = 0; i < valoresEjeX.size(); i++) {
            String valorX = valoresEjeX.get(i).replace("\"", "");
            String valorY = valoresEjeY.get(i).replace("\"", "");
            dataset.addValue(Double.parseDouble(valorY), tituloY, valorX);
        }

        tituloX = tituloX.replace("\"", "");
        tituloY = tituloY.replace("\"", "");

        return ChartFactory.createLineChart(
                titulo,
                tituloX,
                tituloY,
                dataset
        );
    }

}
