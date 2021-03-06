/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.INICIO;

import controlador.ControladorEmpleado;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import logica.Empleado;

/**
 *
 * @author natha9404
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
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

        jPanel1 = new javax.swing.JPanel();
        jtext_user = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campo_user = new javax.swing.JTextField();
        boton_ingresar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 215, 255), 3));

        jtext_user.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtext_user.setText("Usuario:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bienvenido, por favor autentiquese.");

        campo_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_userActionPerformed(evt);
            }
        });

        boton_ingresar.setText("Ingresar");
        boton_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ingresarActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 204, 255));
        jLabel19.setText("SISTEMA MASIVO");
        jLabel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel19.setName("Registrar Usuario"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtext_user)
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campo_user, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_ingresar))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtext_user)
                    .addComponent(campo_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton_ingresar))
        );

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

    private void campo_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_userActionPerformed

    private void boton_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ingresarActionPerformed
        // TODO add your handling code here:

        if(campo_user.getText().length() != 0)
        {

            /**
            * - usuario : Almacena el nombre de usuario ingresado - contasena :
            * Almacena la contraseña ingresada por el usuario - defecto : Almacena
            * el usuario por defecto admin que realiza cualquier cambio
            * -ArrayList<String> ingreso : Almacena el nombre y usuario buscado en
            * la base de datos. -obj_primer_ventana : Objeto para acceder a la
            * clase ventana. - user,contra,rol : almacena lo extraido de la base de
            * datos.
            */
            String usuario = campo_user.getText();
            String defecto = "admin";
            String defecto2 = "user";
            Empleado empleado;
            String user, rol;
            I_inicio objeto = new I_inicio();

            try {
                //si la contraseña y el usuario extraido de la bases de datos
                //son iguales a los ingresados por el usuario se hace el llamado
                // a la siguiente ventana, y se cierra la actual.
                if ((defecto.equals(usuario))) {

                    objeto.setVisible(true);
                    objeto.rol("admin");
                    this.dispose();
                } else if(defecto2.equals(usuario)){
                    
                    objeto.setVisible(true);
                    objeto.rol("user");
                    this.dispose();
                    
                }  else {
                    /**
                    * objeto_bd : objeto para conectar a la base de datos
                    * ArrayList<String>ingreso : se busca en la base de datos lo
                    * ingresado por el usuario y se almacena en este array. user,
                    * contra, rol : almacena lo extraido de la bd
                    *
                    */
                    
                    empleado = new Empleado();
                    ControladorEmpleado controlador = new ControladorEmpleado();
                    empleado = controlador.consultarEmpleado(usuario);
                    rol = empleado.getCargo();
                

                        objeto.setVisible(true);
                        objeto.rol(rol);
                        this.dispose();

                  

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El usuario no existe");
                campo_user.setText("");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Hay Campos vacios");
        }
    }//GEN-LAST:event_boton_ingresarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_ingresar;
    private javax.swing.JTextField campo_user;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jtext_user;
    // End of variables declaration//GEN-END:variables
}
