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
 * @author manuc
 */
public final class Resultados extends javax.swing.JFrame {
    ArrayList<String> listaHistorias = new ArrayList<>();
    String[] listaDispersion;
    ArrayList<String> listaRepetir = new ArrayList<>();
    /**
     * Creates new form Resultados
     * @param listaHistorias
     * @param listaDispersion
     */
    public Resultados(ArrayList<String> listaHistorias,String[] listaDispersion /*ArrayList<String> listaRepetir*/) {
        initComponents();
        vaciarTablaDispersion();
        vaciarTablaHistorias();
        rellenarTablaHistorias(listaHistorias);
        this.listaDispersion=listaDispersion;
        this.listaHistorias=listaHistorias;
//        this.listaRepetir=listaRepetir;
    }

    public DefaultTableModel modeloTablaHistorias = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    
    public void asignarModeloHistorias(Resultados resultados) {
        resultados.jTableHistorias.setModel(modeloTablaHistorias);
    }
    
    public void vaciarTablaHistorias() {
        while (modeloTablaHistorias.getRowCount() > 0) {
            modeloTablaHistorias.removeRow(0);
        }
    }
    
    public void dibujarTablaHistorias(Resultados resultados) {

        resultados.jTableHistorias.setModel(modeloTablaHistorias);
        System.out.println("FUNCIONA");
        String[] columnasTabla = {"Historias"};

        modeloTablaHistorias.setColumnIdentifiers(columnasTabla);

        resultados.jTableHistorias.getTableHeader().setResizingAllowed(false);
        resultados.jTableHistorias.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);

        resultados.jTableHistorias.getColumnModel().getColumn(0).setPreferredWidth(90);
    }

    public void rellenarTablaHistorias(ArrayList<String> listaHistorias) {
        String[] fila = new String[1];
        int numHistorias = listaHistorias.size();
        for (int i = 0; i < numHistorias; i++) {
            fila[0] = listaHistorias.get(i);
            modeloTablaHistorias.addRow(fila);
        }
    }
    
    public DefaultTableModel modeloTablaDispersiones = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    
    public void asignarModeloDispersion(Resultados resultados) {
        resultados.jTableDispersion.setModel(modeloTablaDispersiones);
    }
    
    public void vaciarTablaDispersion() {
        while (modeloTablaDispersiones.getRowCount() > 0) {
            modeloTablaDispersiones.removeRow(0);
        }
    }
    
    public void dibujarTablaDispersion(Resultados resultados) {

        resultados.jTableDispersion.setModel(modeloTablaDispersiones);
        System.out.println("FUNCIONA");
        String[] columnasTabla = {"Dispersion"};

        modeloTablaDispersiones.setColumnIdentifiers(columnasTabla);

        resultados.jTableDispersion.getTableHeader().setResizingAllowed(false);
        resultados.jTableDispersion.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);

        resultados.jTableDispersion.getColumnModel().getColumn(0).setPreferredWidth(90);
    }

    public void rellenarTablaDispersion(String[] listaDispersiones) {
        String[] fila = new String[1];
        int numDispersiones = listaDispersiones.length;
        for (int i = 0; i < numDispersiones; i++) {
            fila[0] = listaDispersiones[i];
            modeloTablaDispersiones.addRow(fila);
        }
    }
    
    public DefaultTableModel modeloTablaRepeticion = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    
    public void asignarModeloRepeticion(Resultados resultados) {
        resultados.jTableRepeticion.setModel(modeloTablaRepeticion);
    }
    
    public void vaciarTablaRepeticion() {
        while (modeloTablaRepeticion.getRowCount() > 0) {
            modeloTablaRepeticion.removeRow(0);
        }
    }
    
    public void dibujarTablaRepeticion(Resultados resultados) {

        resultados.jTableRepeticion.setModel(modeloTablaRepeticion);
        System.out.println("FUNCIONA");
        String[] columnasTabla = {"Repeticion"};

        modeloTablaRepeticion.setColumnIdentifiers(columnasTabla);

        resultados.jTableRepeticion.getTableHeader().setResizingAllowed(false);
        resultados.jTableRepeticion.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);

        resultados.jTableRepeticion.getColumnModel().getColumn(0).setPreferredWidth(90);
    }

    public void rellenarTablaRepeticion(ArrayList<String> listaDispersiones) {
        String[] fila = new String[1];
        int numHistorias = listaDispersiones.size();
        for (int i = 0; i < numHistorias; i++) {
            fila[0] = listaDispersiones.get(i);
            modeloTablaRepeticion.addRow(fila);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHistorias = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDispersion = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableRepeticion = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableHistorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Historia"
            }
        ));
        jScrollPane1.setViewportView(jTableHistorias);

        jTableDispersion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dispersion"
            }
        ));
        jScrollPane2.setViewportView(jTableDispersion);

        jTableRepeticion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Repeticion"
            }
        ));
        jScrollPane3.setViewportView(jTableRepeticion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTable jTableDispersion;
    public javax.swing.JTable jTableHistorias;
    public javax.swing.JTable jTableRepeticion;
    // End of variables declaration//GEN-END:variables
}
