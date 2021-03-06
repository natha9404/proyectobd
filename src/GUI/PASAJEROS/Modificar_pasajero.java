/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.PASAJEROS;

import logica.Pasajero;
import controlador.ControladorPasajero;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class Modificar_pasajero extends javax.swing.JFrame {

    /**
     * Creates new form modificar_pasajero
     */
    public Modificar_pasajero() {
        initComponents();
         this.setLocationRelativeTo(null);
         this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
         setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        campo_registro_nombre5 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        campo_registro_cedula5 = new javax.swing.JTextField();
        campo_registro_telefono5 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        boton_registrar_usuarios5 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        boton_volver2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/metrocali11.jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setText("MODIFICAR PASAJERO");

        campo_registro_nombre5.setEnabled(false);
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

        campo_registro_telefono5.setEnabled(false);
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
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        boton_volver2.setText("Volver");
        boton_volver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_volver2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_volver2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel43)
                .addGap(135, 135, 135))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel39))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel38))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campo_registro_nombre5, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(campo_registro_cedula5)
                            .addComponent(campo_registro_telefono5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(boton_registrar_usuarios5))))
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel43))
                    .addComponent(boton_volver2))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(campo_registro_cedula5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(campo_registro_nombre5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(campo_registro_telefono5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(boton_registrar_usuarios5)
                .addContainerGap(15, Short.MAX_VALUE))
        );

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
if ((campo_registro_nombre5.getText().trim().length() != 0) && (campo_registro_cedula5.getText().trim().length() != 0) && (campo_registro_telefono5.getText().trim().length() != 0)) {

            /**
             * Se guarda en las variables cada uno de los campos de la ventana.
             */
            String cedula = campo_registro_cedula5.getText();
            String nombre = campo_registro_nombre5.getText();
            String telefono = campo_registro_telefono5.getText();

            /**
             * Se realiza la conexion a la base de datos Y se hace el llamado a
             * registrar usuario con los campos llenos el cual devuelve un
             * entero donde si es 1, es porque el usuario se registro
             * correctamente de lo contrario el usuario ya existia y se le
             * informa al usuario
             */
            ControladorPasajero controlador = new ControladorPasajero();
            int n = controlador.modificar_pasajero(cedula, nombre, telefono);
            
            System.out.println(cedula+nombre+telefono);
            

            if (n == 1) {
                JOptionPane.showMessageDialog(null, "Se modifico el pasajero");
                this.dispose();
                
            } else {

                campo_registro_cedula5.setText("");
                campo_registro_nombre5.setText("");
                campo_registro_telefono5.setText("");

            }
        } else {
            JOptionPane.showMessageDialog(this, "Hay campos vacios, por favor completelos");
        }

    
    }//GEN-LAST:event_boton_registrar_usuarios5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        Pasajero pas = new Pasajero();
        ControladorPasajero controlador = new ControladorPasajero();
        
        try {

            /**
             * obj_consultar : objeto para acceder a la interfaz buscar_usuario
             * datos : se realiza el llamado al metodo consultar_usuario el cual
             * recibe un entero cedula, con dicha cedula realiza la busqueda en
             * la base de datos y retorna en el ArrayList<String>
             * cada uno de los datos del usuario solicitado, y se imprimen en
             * los campos.
             */
            // Bd_pqr obj_consultarbd = new Bd_pqr();
            System.out.println("Conecto el objeto");

           if(campo_registro_cedula5.getText().trim().length() != 0){
                pas = controlador.consultar_pasajero(campo_registro_cedula5.getText());
            
           
            campo_registro_cedula5.setEditable(false);
           
            campo_registro_nombre5.setText(pas.getNombre());
            campo_registro_telefono5.setText(pas.getTelefono());
            
            campo_registro_nombre5.setEnabled(true);
            campo_registro_telefono5.setEnabled(true);
            campo_registro_cedula5.setEnabled(true);
            
            
            
           }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El usuario que intenta consultar no existe");

        }

        /*if (rol_user.equals("Gerente")) {
            campo_respuesta.setEditable(true);
            
        } else {

        }*/
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void boton_volver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_volver2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_boton_volver2ActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton boton_registrar_usuarios5;
    private javax.swing.JButton boton_volver2;
    private javax.swing.JTextField campo_registro_cedula5;
    private javax.swing.JTextField campo_registro_nombre5;
    private javax.swing.JTextField campo_registro_telefono5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
