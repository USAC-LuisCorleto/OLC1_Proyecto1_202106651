package Interfaz;

import Analizadores.Parser;
import Instrucciones.GráficaBarras;
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

public class Interfaz extends javax.swing.JFrame {

    java.util.HashMap<JScrollPane, File> archivosAbiertos = new java.util.HashMap<>();
    private ArrayList<JFreeChart> listaGráficas;
    private int gráficaActualIndex;

    public Interfaz() {
        initComponents();
        gráficaActualIndex = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelGráficas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botónAnterior = new javax.swing.JButton();
        botónSiguiente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        consolaArchivo = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        panelArchivos = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        itemBarArchivo = new javax.swing.JMenu();
        menúAbrir = new javax.swing.JMenuItem();
        menúNuevo = new javax.swing.JMenuItem();
        menúGuardar = new javax.swing.JMenuItem();
        menúEliminar = new javax.swing.JMenuItem();
        itemBarPestañas = new javax.swing.JMenu();
        itemBarEjecutar = new javax.swing.JMenu();
        itemBarReportes = new javax.swing.JMenu();
        reporteTokens = new javax.swing.JMenuItem();
        reporteErrores = new javax.swing.JMenuItem();
        reporteSímbolos = new javax.swing.JMenuItem();
        itemBarLimpiar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DataForge");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Entrada");

        javax.swing.GroupLayout panelGráficasLayout = new javax.swing.GroupLayout(panelGráficas);
        panelGráficas.setLayout(panelGráficasLayout);
        panelGráficasLayout.setHorizontalGroup(
            panelGráficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelGráficasLayout.setVerticalGroup(
            panelGráficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Gráficas");

        botónAnterior.setText("Anterior");
        botónAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botónAnteriorActionPerformed(evt);
            }
        });

        botónSiguiente.setText("Siguiente");
        botónSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botónSiguienteActionPerformed(evt);
            }
        });

        consolaArchivo.setEditable(false);
        consolaArchivo.setColumns(20);
        consolaArchivo.setRows(5);
        jScrollPane2.setViewportView(consolaArchivo);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Consola");

        panelArchivos.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(panelArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelGráficas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botónAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addComponent(botónSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelGráficas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelArchivos, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botónAnterior)
                        .addComponent(botónSiguiente))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelArchivos.getAccessibleContext().setAccessibleName("Archivo 1");

        itemBarArchivo.setText("Archivo");

        menúAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Images/carpeta-abierta.png"))); // NOI18N
        menúAbrir.setText("Abrir archivo");
        menúAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menúAbrirActionPerformed(evt);
            }
        });
        itemBarArchivo.add(menúAbrir);

        menúNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Images/agregar-documento.png"))); // NOI18N
        menúNuevo.setText("Nuevo Archivo");
        menúNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menúNuevoActionPerformed(evt);
            }
        });
        itemBarArchivo.add(menúNuevo);

        menúGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Images/subir-archivo.png"))); // NOI18N
        menúGuardar.setText("Guardar Archivo");
        menúGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menúGuardarActionPerformed(evt);
            }
        });
        itemBarArchivo.add(menúGuardar);

        menúEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Images/eliminar-documento.png"))); // NOI18N
        menúEliminar.setText("Eliminar Archivo");
        menúEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menúEliminarActionPerformed(evt);
            }
        });
        itemBarArchivo.add(menúEliminar);

        jMenuBar1.add(itemBarArchivo);

        itemBarPestañas.setText("Pestañas");
        jMenuBar1.add(itemBarPestañas);

        itemBarEjecutar.setText("Ejecutar");
        itemBarEjecutar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemBarEjecutarMouseClicked(evt);
            }
        });
        jMenuBar1.add(itemBarEjecutar);

        itemBarReportes.setText("Reportes");

        reporteTokens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Images/cheque-de-boleta.png"))); // NOI18N
        reporteTokens.setText("Reporte de Tokens");
        reporteTokens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteTokensActionPerformed(evt);
            }
        });
        itemBarReportes.add(reporteTokens);

        reporteErrores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Images/hexagono-de-tiempos.png"))); // NOI18N
        reporteErrores.setText("Reporte de Errores");
        reporteErrores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteErroresActionPerformed(evt);
            }
        });
        itemBarReportes.add(reporteErrores);

        reporteSímbolos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Images/comprobacion-de-insignias.png"))); // NOI18N
        reporteSímbolos.setText("Reporte de Tabla de Símbolos");
        reporteSímbolos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteSímbolosActionPerformed(evt);
            }
        });
        itemBarReportes.add(reporteSímbolos);

        jMenuBar1.add(itemBarReportes);

        itemBarLimpiar.setText("Limpiar");
        itemBarLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemBarLimpiarMouseClicked(evt);
            }
        });
        jMenuBar1.add(itemBarLimpiar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menúAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menúAbrirActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos DataForge (*.df)", "df");
        fileChooser.setFileFilter(filter);

        int resultado = fileChooser.showOpenDialog(this);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            java.io.File archivoSeleccionado = fileChooser.getSelectedFile();
            try {
                StringBuilder contenidoArchivo = new StringBuilder();
                try (BufferedReader reader = new BufferedReader(new FileReader(archivoSeleccionado))) {
                    String línea;
                    while ((línea = reader.readLine()) != null) {
                        contenidoArchivo.append(línea).append("\n");
                    }
                    JTextArea nuevoTextArea = new JTextArea(contenidoArchivo.toString());
                    String nombreArchivo = archivoSeleccionado.getName();
                    panelArchivos.addTab(nombreArchivo, new JScrollPane(nuevoTextArea));
                    panelArchivos.setSelectedIndex(panelArchivos.getTabCount() - 1);
                    archivosAbiertos.put((JScrollPane) panelArchivos.getSelectedComponent(), archivoSeleccionado);
                }
            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_menúAbrirActionPerformed

    private void menúNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menúNuevoActionPerformed
        JTextArea nuevoTextArea = new JTextArea();
        String nombreArchivo = "NuevoArchivo" + (panelArchivos.getTabCount() + 1);
        panelArchivos.addTab(nombreArchivo, new JScrollPane(nuevoTextArea));
        panelArchivos.setSelectedIndex(panelArchivos.getTabCount() - 1);
    }//GEN-LAST:event_menúNuevoActionPerformed

    private void menúGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menúGuardarActionPerformed
        JScrollPane pestañaSeleccionada = (JScrollPane) panelArchivos.getSelectedComponent();
        JTextArea textArea = (JTextArea) pestañaSeleccionada.getViewport().getView();

        if (archivosAbiertos.containsKey(pestañaSeleccionada)) {
            File archivo = archivosAbiertos.get(pestañaSeleccionada);
            try {
                try (FileWriter writer = new FileWriter(archivo)) {
                    writer.write(textArea.getText());
                }
                panelArchivos.setTitleAt(panelArchivos.getSelectedIndex(), archivo.getName());
            } catch (IOException ex) {
            }
        } else {
            JFileChooser fileChooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos DataForge (*.df)", "df");
            fileChooser.setFileFilter(filter);

            int resultado = fileChooser.showSaveDialog(this);
            if (resultado == JFileChooser.APPROVE_OPTION) {
                java.io.File selectedFile = fileChooser.getSelectedFile();

                String nombreArchivo = selectedFile.getName();
                if (!nombreArchivo.endsWith(".df")) {
                    nombreArchivo += ".df";
                    selectedFile = new java.io.File(selectedFile.getParent(), nombreArchivo);
                }

                try {
                    try (java.io.FileWriter writer = new java.io.FileWriter(selectedFile)) {
                        writer.write(textArea.getText());
                    }
                    panelArchivos.setTitleAt(panelArchivos.getSelectedIndex(), nombreArchivo);
                    archivosAbiertos.put(pestañaSeleccionada, selectedFile);
                } catch (IOException ex) {
                }
            }
        }
    }//GEN-LAST:event_menúGuardarActionPerformed

    public static void analizar(String entrada) {
        try {
            Analizadores.Lexer lexer = new Analizadores.Lexer(new StringReader(entrada));
            Analizadores.Parser parser = new Parser(lexer);
            parser.parse();
        } catch (Exception e) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println(e);
        }
    }

    private void menúEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menúEliminarActionPerformed
        int tabIndex = panelArchivos.getSelectedIndex();

        if (tabIndex != -1) {
            JScrollPane selectedTab = (JScrollPane) panelArchivos.getComponentAt(tabIndex);
            JTextArea textArea = (JTextArea) selectedTab.getViewport().getView();

            if (verificarCambiosNoGuardados(textArea)) {
                int option = javax.swing.JOptionPane.showConfirmDialog(
                        this, "¿Desea guardar los cambios antes de cerrar la pestaña?",
                        "Guardar cambios", javax.swing.JOptionPane.YES_NO_CANCEL_OPTION);
                if (option == javax.swing.JOptionPane.YES_OPTION) {
                    menúGuardarActionPerformed(evt);
                } else if (option == javax.swing.JOptionPane.CANCEL_OPTION) {
                    return;
                }
            }
            panelArchivos.remove(tabIndex);
        }
    }//GEN-LAST:event_menúEliminarActionPerformed

    private void itemBarEjecutarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemBarEjecutarMouseClicked
        int tabIndex = panelArchivos.getSelectedIndex();

        if (tabIndex != -1) {
            JScrollPane selectedTab = (JScrollPane) panelArchivos.getComponentAt(tabIndex);
            JTextArea textArea = (JTextArea) selectedTab.getViewport().getView();

            String textoArchivo = textArea.getText();
            analizar(textoArchivo);
            String textoSalida = Analizadores.Parser.resultado;
            consolaArchivo.setText(textoSalida);
            mostrarGráficaActual();
            try {
                Reportes.ReporteTokens.generarReporteTokens();
                Reportes.ReporteErrores.generarReporteErrores();
                Reportes.ReporteSímbolos.generarReporteErrores();
            } catch (IOException ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_itemBarEjecutarMouseClicked

    private void reporteTokensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteTokensActionPerformed
        abrirArchivoHTML("Reporte de Tokens.html");
    }//GEN-LAST:event_reporteTokensActionPerformed

    private void reporteErroresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteErroresActionPerformed
        abrirArchivoHTML("Reporte de Errores.html");
    }//GEN-LAST:event_reporteErroresActionPerformed

    private void itemBarLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemBarLimpiarMouseClicked
        consolaArchivo.setText("");
        Analizadores.Parser.resultado = "";
    }//GEN-LAST:event_itemBarLimpiarMouseClicked

    private void reporteSímbolosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteSímbolosActionPerformed
        abrirArchivoHTML("Reporte de Símbolos.html");
    }//GEN-LAST:event_reporteSímbolosActionPerformed

    private void abrirArchivoHTML(String nombreArchivo) {
        try {
            File archivoHTML = new File(nombreArchivo);
            if (archivoHTML.exists()) {
                Desktop.getDesktop().browse(archivoHTML.toURI());
            } else {
                System.err.println("El archivo no existe: " + nombreArchivo);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void mostrarGráficaActual() {
        listaGráficas = GráficaBarras.getListaGráficas();

        panelGráficas.removeAll();
        if (!listaGráficas.isEmpty()) {
            JFreeChart chart = listaGráficas.get(gráficaActualIndex);
            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(panelGráficas.getSize());
            panelGráficas.setLayout(new BorderLayout());
            panelGráficas.add(chartPanel);
        }
        panelGráficas.revalidate();
        panelGráficas.repaint();
    }

    private void botónSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botónSiguienteActionPerformed
        if (!listaGráficas.isEmpty()) {
            gráficaActualIndex = (gráficaActualIndex - 1 + listaGráficas.size()) % listaGráficas.size();
            mostrarGráficaActual();
        }
    }//GEN-LAST:event_botónSiguienteActionPerformed

    private void botónAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botónAnteriorActionPerformed
        if (!listaGráficas.isEmpty()) {
            gráficaActualIndex = (gráficaActualIndex + 1) % listaGráficas.size();
            mostrarGráficaActual();
        }
    }//GEN-LAST:event_botónAnteriorActionPerformed

    private boolean verificarCambiosNoGuardados(JTextArea textArea) {
        return textArea.getDocument().getLength() != 0;
    }

    /**
     * @param args the command línea arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botónAnterior;
    private javax.swing.JButton botónSiguiente;
    private javax.swing.JTextArea consolaArchivo;
    private javax.swing.JMenu itemBarArchivo;
    private javax.swing.JMenu itemBarEjecutar;
    private javax.swing.JMenu itemBarLimpiar;
    private javax.swing.JMenu itemBarPestañas;
    private javax.swing.JMenu itemBarReportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem menúAbrir;
    private javax.swing.JMenuItem menúEliminar;
    private javax.swing.JMenuItem menúGuardar;
    private javax.swing.JMenuItem menúNuevo;
    private javax.swing.JTabbedPane panelArchivos;
    private javax.swing.JPanel panelGráficas;
    private javax.swing.JMenuItem reporteErrores;
    private javax.swing.JMenuItem reporteSímbolos;
    private javax.swing.JMenuItem reporteTokens;
    // End of variables declaration//GEN-END:variables
}
