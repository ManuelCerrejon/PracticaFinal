/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package practicafinal;

import java.util.ArrayList;

/**
 *
 * @author thera
 */
public class NombreUsuarios extends javax.swing.JFrame {
    int i = 1;
    HistoriaUsuario historiaUsuario;
    int num;
    String nombre="";
    ArrayList<String> listaUsuarios = new ArrayList<>();
    /**
     * Creates new form NombreUsuarios
     */
    public NombreUsuarios() {
        initComponents();
    }

    NombreUsuarios(int numU) {
        initComponents();
        num = numU;
        jLabelNumUsuarios.setText(String.valueOf(num));        
        this.jButtonContinuar.setVisible(false);
        jLabelIntUsuario.setText((i)+":");
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
        jLabelNumUsuarios = new javax.swing.JLabel();
        jButtonIntroducir = new javax.swing.JButton();
        jLabelTextoNombredeUsuario = new javax.swing.JLabel();
        jLabelIntUsuario = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jButtonContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Número de Usuarios:");

        jLabelNumUsuarios.setText("jLabel2");

        jButtonIntroducir.setText("Introducir");
        jButtonIntroducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIntroducirActionPerformed(evt);
            }
        });

        jLabelTextoNombredeUsuario.setText("Nombre de Usuario");

        jLabelIntUsuario.setText(":");

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jButtonContinuar.setText("Continuar");
        jButtonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabelTextoNombredeUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelIntUsuario)
                        .addGap(54, 54, 54)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonContinuar)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel1)
                                .addGap(29, 29, 29)
                                .addComponent(jLabelNumUsuarios))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonIntroducir)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelNumUsuarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTextoNombredeUsuario)
                    .addComponent(jLabelIntUsuario)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jButtonIntroducir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonContinuar)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIntroducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIntroducirActionPerformed

        nombre = jTextFieldNombre.getText();
        listaUsuarios.add(nombre);
        historiaUsuario = new HistoriaUsuario();
        
        
        if(i==num){
            this.jButtonIntroducir.setVisible(false);
            this.jButtonContinuar.setVisible(true);
            jTextFieldNombre.setVisible(false);
            jLabelTextoNombredeUsuario.setVisible(false);
            jLabelIntUsuario.setVisible(false);
        }
        else
            i++;
            jLabelIntUsuario.setText((i)+":");
            jTextFieldNombre.setText("");
        
    }//GEN-LAST:event_jButtonIntroducirActionPerformed

    
    
    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jButtonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContinuarActionPerformed
       historiaUsuario.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButtonContinuarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonContinuar;
    public javax.swing.JButton jButtonIntroducir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelIntUsuario;
    private javax.swing.JLabel jLabelNumUsuarios;
    private javax.swing.JLabel jLabelTextoNombredeUsuario;
    public javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
