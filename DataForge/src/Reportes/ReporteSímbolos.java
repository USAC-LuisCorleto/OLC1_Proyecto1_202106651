package Reportes;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.nio.charset.StandardCharsets;

public class ReporteSímbolos {

    public static ArrayList<SímbolosV> TablaSímbolosVariables = new ArrayList();
    public static ArrayList<SímbolosA> TablaSímbolosArreglos = new ArrayList();

    public static void generarReporteErrores() throws FileNotFoundException, IOException {
        String nombreArchivo = "Reporte de Símbolos.html";
        int contador = 1;

        try (FileOutputStream archivoStream = new FileOutputStream(nombreArchivo); OutputStreamWriter escritorStream = new OutputStreamWriter(archivoStream, StandardCharsets.UTF_8); BufferedWriter archivo = new BufferedWriter(escritorStream)) {

            archivo.write("<!DOCTYPE html>\n");
            archivo.write("<html>\n");
            archivo.write("<head>\n");
            archivo.write("<meta charset=\"UTF-8\">\n");
            archivo.write("<title>Reporte de símbolos</title>\n");
            archivo.write("""
                          <style>
                                                  body {
                                                      margin: 0;
                                                      padding: 0;
                                                      font-family: Arial, sans-serif;
                                                      background-color: #f2f2f2;
                                                  }
                          
                                                  header {
                                                      background-color: #333;
                                                      color: #fff;
                                                      text-align: center;
                                                      padding: 20px;
                                                  }
                          
                                                  h1 {
                                                      font-size: 24px;
                                                  }
                          
                                                  table {
                                                      width: 80%;
                                                      margin: 20px auto;
                                                      background-color: #fff;
                                                      border-collapse: collapse;
                                                      box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
                                                  }
                          
                                                  th, td {
                                                      text-align: center;
                                                      padding: 12px;
                                                      border: 1px solid #ddd;
                                                  }
                          
                                                  th {
                                                      background-color: #333;
                                                      color: #fff;
                                                  }
                          
                                                  tr:nth-child(even) {
                                                      background-color: #f2f2f2;
                                                  }
                                              </style>""");
            archivo.write("</head>\n");
            archivo.write("<body>\n");

            archivo.write("<table border=\"1\">\n");
            archivo.write("<tr><th>#</th><th>Nombre</th><th>Tipo</th><th>Valor</th></tr>\n");

            for (SímbolosV variables : TablaSímbolosVariables) {
                archivo.write("<tr>");
                archivo.write("<td>" + contador + "</td>");
                archivo.write("<td>" + variables.getNombre() + "</td>");
                archivo.write("<td>" + variables.getTipo() + "</td>");
                archivo.write("<td>" + variables.getValor() + "</td>");
                archivo.write("</tr>\n");
                contador++;
            }

            for (SímbolosA arreglos : TablaSímbolosArreglos) {
                archivo.write("<tr>");
                archivo.write("<td>" + contador + "</td>");
                archivo.write("<td>" + arreglos.getNombre() + "</td>");
                archivo.write("<td>" + arreglos.getTipo() + "</td>");
                archivo.write("<td>" + arreglos.getValores() + "</td>");
                archivo.write("</tr>\n");
                contador++;
            }

            archivo.write("</table>\n");
            archivo.write("</body>\n");
            archivo.write("</html>\n");
        }
        System.out.println("El reporte de errores se ha generado correctamente en " + nombreArchivo);
    }
}
