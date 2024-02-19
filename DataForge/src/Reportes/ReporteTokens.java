package Reportes;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.nio.charset.StandardCharsets;

public class ReporteTokens {

    public static ArrayList<Token> TablaTokens = new ArrayList();

    public static void generarReporteTokens() throws FileNotFoundException, IOException {
        String nombreArchivo = "Reporte de Tokens.html";

        try (FileOutputStream archivoStream = new FileOutputStream(nombreArchivo); OutputStreamWriter escritorStream = new OutputStreamWriter(archivoStream, StandardCharsets.UTF_8); BufferedWriter archivo = new BufferedWriter(escritorStream)) {

            archivo.write("<!DOCTYPE html>\n");
            archivo.write("<html>\n");
            archivo.write("<head>\n");
            archivo.write("<meta charset=\"UTF-8\">\n");
            archivo.write("<title>Reporte de Tokens</title>\n");
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
            archivo.write("<tr><th>#</th><th>Tipo</th><th>Lexema</th><th>Línea</th><th>Columna</th></tr>\n");
            
            int numeral = 1;
            for (Token símbolo : TablaTokens) {
                archivo.write("<tr>");
                archivo.write("<td>" + numeral++ + "</td>");
                archivo.write("<td>" + símbolo.getToken() + "</td>");
                archivo.write("<td>" + símbolo.getLexema() + "</td>");
                archivo.write("<td>" + símbolo.getLínea() + "</td>");
                archivo.write("<td>" + símbolo.getColumna() + "</td>");
                archivo.write("</tr>\n");
            }

            archivo.write("</table>\n");
            archivo.write("</body>\n");
            archivo.write("</html>\n");
        }
        System.out.println("El reporte de tokens se ha generado correctamente en " + nombreArchivo);
    }
}
