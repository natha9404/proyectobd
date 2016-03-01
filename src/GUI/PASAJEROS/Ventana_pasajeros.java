/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.PASAJEROS;

import GUI.INICIO.*;
import controlador.ControladorPasajero;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author natha
 */
public class Ventana_pasajeros extends javax.swing.JFrame {
    
    /**
     * Creates new form ventana_pasajeros
     */
    public Ventana_pasajeros() {
        initComponents();
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
        jPanel1 = new javax.swing.JPanel();
        registrar_pasajero = new javax.swing.JButton();
        modificar_pasajero = new javax.swing.JButton();
        listar_pasajero = new javax.swing.JButton();
        consultar_pasajero = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        volver_principal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/metrocali11.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        registrar_pasajero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/add_user.png"))); // NOI18N
        registrar_pasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_pasajeroActionPerformed(evt);
            }
        });

        modificar_pasajero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/modificar_usuario.png"))); // NOI18N
        modificar_pasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_pasajeroActionPerformed(evt);
            }
        });

        listar_pasajero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/listar_usuario.jpg"))); // NOI18N
        listar_pasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listar_pasajeroActionPerformed(evt);
            }
        });

        consultar_pasajero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/buscar_usuario.png"))); // NOI18N
        consultar_pasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_pasajeroActionPerformed(evt);
            }
        });

        jLabel2.setText("Registrar Pasajero");

        jLabel3.setText("Modificar Pasajero");

        jLabel4.setText("Consultar Pasajero");

        jLabel5.setText("Listar Pasajeros");

        volver_principal.setText("Volver a ventana principal");
        volver_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver_principalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(consultar_pasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrar_pasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listar_pasajero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modificar_pasajero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(2, 2, 2)))
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(volver_principal)
                .addGap(108, 108, 108))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modificar_pasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrar_pasajero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(listar_pasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultar_pasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(volver_principal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrar_pasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_pasajeroActionPerformed
        // TODO add your handling code here:

        //Abre la ventana registrar usuarios
        Registrar_pasajero obj_registrar_pasajero = new Registrar_pasajero();
        obj_registrar_pasajero.setVisible(true);
    }//GEN-LAST:event_registrar_pasajeroActionPerformed

    private void modificar_pasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_pasajeroActionPerformed
        // TODO add your handling code here:
        //Abre la ventana modificar usuario
        Modificar_pasajero obj_mod_pasajero = new Modificar_pasajero();
        obj_mod_pasajero.setVisible(true);
    }//GEN-LAST:event_modificar_pasajeroActionPerformed

    private void listar_pasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listar_pasajeroActionPerformed
        // TODO add your handling code here:
        //abre la ventana para consultar usuarios
        Listar_pasajeros obj_listar_pasajeros = new Listar_pasajeros();
        ControladorPasajero controlador = new ControladorPasajero();
        
        DefaultTableModel modelo;
        
        modelo = controlador.listarPasajero();
        
        obj_listar_pasajeros.imprimir(modelo);
        
        obj_listar_pasajeros.setVisible(true);
    }//GEN-LAST:event_listar_pasajeroActionPerformed

    private void consultar_pasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_pasajeroActionPerformed
        // TODO add your handling code here:

        //abre al ventana actualizar usuario
        Buscar_pasajero obj_buscar_pasajero = new Buscar_pasajero();
        obj_buscar_pasajero.setVisible(true);
    }//GEN-LAST:event_consultar_pasajeroActionPerformed

    private void volver_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver_principalActionPerformed
        // TODO add your handling code here:
        // se devuelve a la ventana anterior
        I_inicio obj_ventana_principal = new I_inicio();
        obj_ventana_principal.setVisible(true);
        //obj_ventana_principal.rol(rol_user);
        this.dispose();
    }//GEN-LAST:event_volver_principalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultar_pasajero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listar_pasajero;
    private javax.swing.JButton modificar_pasajero;
    private javax.swing.JButton registrar_pasajero;
    private javax.swing.JButton volver_principal;
    // End of variables declaration//GEN-END:variables

    public void rol(String rol) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
