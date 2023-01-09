/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package practicafinal;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thera
 */
public final class Comparacion extends javax.swing.JFrame {
    Resultados resultados;
    Comparacion comparacion;
    String valoraciones[][];
    ArrayList<String> listaHistorias = new ArrayList<>();
    ArrayList<String> listaUsuarios = new ArrayList<>();
    String[] listaDispersion;
    int j = 0;
    int i=0;

    int []numRepeticiones;
    
    /**
     * Creates new form Comparacion
     *
     * @param valoraciones
     * @param listaHistorias
     * @param listaUsuarios
     */
    public Comparacion(String valoraciones[][], ArrayList<String> listaHistorias, ArrayList<String> listaUsuarios) {
        initComponents();
        rellenarTablaUsuarios(listaUsuarios);
        rellenarTablaNotas(valoraciones, listaUsuarios);
        this.valoraciones = valoraciones;
        this.listaHistorias = listaHistorias;
        this.listaUsuarios = listaUsuarios;
        jLabelHistoria.setText(listaHistorias.get(j));
        
        jLabelVarianza.setText(String.valueOf(calcularVarianza()));
        jLabelDesviacion.setText(String.valueOf(calcularDesviacion()));
        
        numRepeticiones = new int[listaHistorias.size()];
        for (int y = 0; y < listaHistorias.size(); y++) {
            numRepeticiones[y] = 0;
            
        }
        
        jLabelRepeticiones.setText(String.valueOf(numRepeticiones[j]));
        listaDispersion= new String[listaHistorias.size()];
    }
    
    public Comparacion(String valoraciones[][], ArrayList<String> listaHistorias, ArrayList<String> listaUsuarios, int[]numRepeticiones) {
        initComponents();
        rellenarTablaUsuarios(listaUsuarios);
        rellenarTablaNotas(valoraciones, listaUsuarios);
        this.valoraciones = valoraciones;
        this.listaHistorias = listaHistorias;
        this.listaUsuarios = listaUsuarios;
        jLabelHistoria.setText(listaHistorias.get(j));
        
        jLabelVarianza.setText(String.valueOf(calcularVarianza()));
        jLabelDesviacion.setText(String.valueOf(calcularDesviacion()));
        
        this.numRepeticiones = numRepeticiones;
        
        jLabelRepeticiones.setText(String.valueOf(numRepeticiones[j]));
        
    }

    public DefaultTableModel modeloTablaUsuario = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    public void asignarModelo(Comparacion comparacion) {
        comparacion.jTableUsuarios.setModel(modeloTablaUsuario);
    }

    public void vaciarTablaUsuarios() {
        while (modeloTablaUsuario.getRowCount() > 0) {
            modeloTablaUsuario.removeRow(0);
        }
    }

    public void dibujarTablaUsuarios(Comparacion comparacion) {

        comparacion.jTableUsuarios.setModel(modeloTablaUsuario);
        System.out.println("FUNCIONA");
        String[] columnasTabla = {"Nombre"};

        modeloTablaUsuario.setColumnIdentifiers(columnasTabla);

        comparacion.jTableUsuarios.getTableHeader().setResizingAllowed(false);
        comparacion.jTableUsuarios.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);

        comparacion.jTableUsuarios.getColumnModel().getColumn(0).setPreferredWidth(90);
    }

    public void rellenarTablaUsuarios(ArrayList<String> listaUsuarios) {
        String[] fila = new String[1];
        int numUsuarios = listaUsuarios.size();
        for (int i = 0; i < numUsuarios; i++) {
            fila[0] = listaUsuarios.get(i);
            modeloTablaUsuario.addRow(fila);
        }
    }
    
    public DefaultTableModel modeloTablaNotas = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    
    public void asignarModeloNotas(Comparacion comparacion) {
        comparacion.jTableNotas.setModel(modeloTablaNotas);
    }
    
    public void vaciarTablaNotas() {
        while (modeloTablaNotas.getRowCount() > 0) {
            modeloTablaNotas.removeRow(0);
        }
    }
    
    public void dibujarTablaNotas(Comparacion comparacion) {

        comparacion.jTableNotas.setModel(modeloTablaNotas);
        System.out.println("FUNCIONA");
        String[] columnasTabla = {"Notas"};

        modeloTablaNotas.setColumnIdentifiers(columnasTabla);

        comparacion.jTableNotas.getTableHeader().setResizingAllowed(false);
        comparacion.jTableNotas.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);

        comparacion.jTableNotas.getColumnModel().getColumn(0).setPreferredWidth(90);
    }

    public void rellenarTablaNotas(String[][] valoraciones, ArrayList<String> listaUsuarios) {
        String[] fila = new String[1];
        int numUsuarios = listaUsuarios.size();
        for (int k = 0; k < numUsuarios; k++) {
            fila[0] = valoraciones[i][k];
            modeloTablaNotas.addRow(fila);
        }
    }
    
    public double calcularVarianza(){
        float media = 0;
        int sumatorio = 0;
        int nUsuarios = listaUsuarios.size();
        double varianza = 0;
        
        for (int y = 0; y < nUsuarios; y++) {
            sumatorio = sumatorio + Integer.parseInt(valoraciones[i][y]);
        }
        media = sumatorio/nUsuarios;
        
        for (int y = 0; y < nUsuarios; y++) {
           double rango; 
           rango = Math.pow(Integer.parseInt(valoraciones[i][y]) - media, 2);
           varianza = varianza + rango;
        }
        varianza = varianza/nUsuarios;
        
        return varianza;
    }
    
    public float calcularDesviacion(){
        return (float) Math.sqrt(calcularVarianza());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelHistoria = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableNotas = new javax.swing.JTable();
        jButtonSiguienteHistoria = new javax.swing.JButton();
        jButtonRepetir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelVarianza = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelDesviacion = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelRepeticiones = new javax.swing.JLabel();
        jButtonFinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Valoracion de la historia:");

        jLabelHistoria.setText("jLabel2");

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Usuarios"
            }
        ));
        jScrollPane1.setViewportView(jTableUsuarios);

        jTableNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Notas"
            }
        ));
        jScrollPane2.setViewportView(jTableNotas);

        jButtonSiguienteHistoria.setText("Siguiente Historia");
        jButtonSiguienteHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteHistoriaActionPerformed(evt);
            }
        });

        jButtonRepetir.setText("Repeticion");
        jButtonRepetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRepetirActionPerformed(evt);
            }
        });

        jLabel2.setText("Varianza:");

        jLabelVarianza.setText("jLabel3");

        jLabel3.setText("Desviacion Media:");

        jLabelDesviacion.setText("jLabel4");

        jLabel4.setText("Repeticiones:");

        jLabelRepeticiones.setText("jLabel5");

        jButtonFinalizar.setText("Finalizar");
        jButtonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelVarianza))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelDesviacion))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonSiguienteHistoria)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelRepeticiones)))
                                .addGap(26, 26, 26)
                                .addComponent(jButtonRepetir)
                                .addGap(30, 30, 30)
                                .addComponent(jButtonFinalizar)))
                        .addGap(88, 88, 88))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50)
                        .addComponent(jLabelHistoria)
                        .addGap(80, 80, 80))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelHistoria))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabelVarianza))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabelDesviacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabelRepeticiones))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSiguienteHistoria)
                            .addComponent(jButtonRepetir)
                            .addComponent(jButtonFinalizar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSiguienteHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteHistoriaActionPerformed
        listaDispersion[j]=jLabelDesviacion.getText();
        i++;
        j++;
        jLabelHistoria.setText(listaHistorias.get(j));
        jLabelRepeticiones.setText(String.valueOf(numRepeticiones[j]));
        vaciarTablaNotas();
        rellenarTablaNotas(valoraciones, listaUsuarios);
        jLabelVarianza.setText(String.valueOf(calcularVarianza()));
        jLabelDesviacion.setText(String.valueOf(calcularDesviacion()));
    }//GEN-LAST:event_jButtonSiguienteHistoriaActionPerformed

    private void jButtonRepetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRepetirActionPerformed
        numRepeticiones[j]++;
        RepetirHistoria repetirHistoria = new RepetirHistoria(listaHistorias, listaUsuarios, j, valoraciones, numRepeticiones);
        this.setVisible(false);
        repetirHistoria.setVisible(true);
    }//GEN-LAST:event_jButtonRepetirActionPerformed

    private void jButtonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarActionPerformed
        resultados = new Resultados(listaHistorias, listaDispersion);
        resultados.dibujarTablaHistorias(resultados);
        resultados.dibujarTablaDispersion(resultados);
        resultados.rellenarTablaHistorias(listaHistorias);
        resultados.rellenarTablaDispersion(listaDispersion);
        this.setVisible(false);
        resultados.setVisible(true);
    }//GEN-LAST:event_jButtonFinalizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonFinalizar;
    public javax.swing.JButton jButtonRepetir;
    public javax.swing.JButton jButtonSiguienteHistoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabelDesviacion;
    public javax.swing.JLabel jLabelHistoria;
    public javax.swing.JLabel jLabelRepeticiones;
    public javax.swing.JLabel jLabelVarianza;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTableNotas;
    public javax.swing.JTable jTableUsuarios;
    // End of variables declaration//GEN-END:variables

}
