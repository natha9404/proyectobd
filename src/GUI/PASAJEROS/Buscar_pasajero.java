/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.PASAJEROS;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class Buscar_pasajero extends javax.swing.JFrame {

    /**
     * Creates new form buscar_pasajero
     */
    public Buscar_pasajero() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        campo_registro_nombre5 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        campo_registro_cedula5 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        campo_registro_direccion5 = new javax.swing.JTextField();
        campo_registro_telefono5 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        boton_registrar_usuarios5 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        boton_volver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setText("CONSULTAR PASAJERO");

        campo_registro_nombre5.setEditable(false);
        campo_registro_nombre5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_registro_nombre5ActionPerformed(evt);
            }
        });

        jLabel38.setText("* Nombre Completo:");

        jLabel39.setText("* Cedula de Ciudadanía:");

        campo_registro_cedula5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_registro_cedula5ActionPerformed(evt);
            }
        });
        campo_registro_cedula5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_registro_cedula5KeyTyped(evt);
            }
        });

        jLabel41.setText(" Dirección:");

        campo_registro_direccion5.setEditable(false);
        campo_registro_direccion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_registro_direccion5ActionPerformed(evt);
            }
        });

        campo_registro_telefono5.setEditable(false);
        campo_registro_telefono5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_registro_telefono5ActionPerformed(evt);
            }
        });
        campo_registro_telefono5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_registro_telefono5KeyTyped(evt);
            }
        });

        jLabel42.setText(" Teléfono:");

        boton_registrar_usuarios5.setText("Modificar");
        boton_registrar_usuarios5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registrar_usuarios5ActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");

        boton_volver.setText("Volver");
        boton_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(boton_volver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel43)
                .addGap(135, 135, 135))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(jLabel41))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campo_registro_direccion5, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(campo_registro_telefono5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel38))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel39)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campo_registro_nombre5, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(campo_registro_cedula5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boton_registrar_usuarios5)
                            .addComponent(jButton1))))
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel43))
                    .addComponent(boton_volver))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(campo_registro_cedula5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(campo_registro_nombre5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_registro_direccion5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_registro_telefono5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addGap(18, 18, 18)
                .addComponent(boton_registrar_usuarios5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/metrocali11.jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_registro_nombre5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_registro_nombre5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_registro_nombre5ActionPerformed

    private void campo_registro_cedula5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_registro_cedula5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_registro_cedula5ActionPerformed

    private void campo_registro_cedula5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_registro_cedula5KeyTyped
        // TODO add your handling code here:

        if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_campo_registro_cedula5KeyTyped

    private void campo_registro_direccion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_registro_direccion5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_registro_direccion5ActionPerformed

    private void campo_registro_telefono5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_registro_telefono5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_registro_telefono5ActionPerformed

    private void campo_registro_telefono5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_registro_telefono5KeyTyped
        // TODO add your handling code here:

        if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_campo_registro_telefono5KeyTyped

    private void boton_registrar_usuarios5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_registrar_usuarios5ActionPerformed
        // TODO add your handling code here:

        //Verificar campos vaicos
        if ((campo_registro_nombre5.getText().trim().length() != 0) && (campo_registro_cedula5.getText().trim().length() != 0) && (campo_registro_direccion5.getText().trim().length() != 0) && (campo_registro_telefono5.getText().trim().length() != 0)) {

            /**
            * Se guarda en las variables cada uno de los campos de la ventana.
            */
            String cedula = campo_registro_cedula5.getText();
            String nombre = campo_registro_nombre5.getText();
            String direccion = campo_registro_direccion5.getText();
            String telefono = campo_registro_telefono5.getText();

            /**
            * Se realiza la conexion a la base de datos Y se hace el llamado a
            * registrar usuario con los campos llenos el cual devuelve un
            * entero donde si es 1, es porque el usuario se registro
            * correctamente de lo contrario el usuario ya existia y se le
            * informa al usuario
            */
            // conexion_bd obj_conectarbd = new conexion_bd();
            int n = 0;
            //  n = obj_conectarbd.registrar_usuario(cedula, nombre, cargo, direccion, telefono);

            if (n == 1) {
                this.dispose();
            } else {

                campo_registro_cedula5.setText("");
                campo_registro_nombre5.setText("");
                campo_registro_direccion5.setText("");
                campo_registro_telefono5.setText("");

            }
        } else {
            JOptionPane.showMessageDialog(this, "Hay campos vacios, por favor completelos");
        }
    }//GEN-LAST:event_boton_registrar_usuarios5ActionPerformed

    private void boton_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_volverActionPerformed
        Ventana_pasajeros ventana_pasajeros= new Ventana_pasajeros();
        ventana_pasajeros.toFront();
        ventana_pasajeros.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boton_volverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton boton_registrar_usuarios5;
    private javax.swing.JButton boton_volver;
    private javax.swing.JTextField campo_registro_cedula5;
    private javax.swing.JTextField campo_registro_direccion5;
    private javax.swing.JTextField campo_registro_nombre5;
    private javax.swing.JTextField campo_registro_telefono5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
