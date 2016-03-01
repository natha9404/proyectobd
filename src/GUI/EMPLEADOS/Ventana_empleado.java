/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.EMPLEADOS;


import GUI.INICIO.*;
import controlador.ControladorEmpleado;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author natha
 */
public class Ventana_empleado extends javax.swing.JFrame {

    /**
     * Creates new form ventana_empleado
     */
    public Ventana_empleado() {
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

        boton_adduser = new javax.swing.JButton();
        boton_modificarusuario = new javax.swing.JButton();
        boton_actualizarusuario = new javax.swing.JButton();
        boton_buscarusuario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        volver_principal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        boton_adduser1 = new javax.swing.JButton();
        boton_modificarusuario1 = new javax.swing.JButton();
        listar_empleados = new javax.swing.JButton();
        boton_buscarempleado = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        volver_principal1 = new javax.swing.JButton();

        boton_adduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_adduserActionPerformed(evt);
            }
        });

        boton_modificarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_modificarusuarioActionPerformed(evt);
            }
        });

        boton_actualizarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_actualizarusuarioActionPerformed(evt);
            }
        });

        boton_buscarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_buscarusuarioActionPerformed(evt);
            }
        });

        jLabel2.setText("Registrar Usuario");

        jLabel3.setText("Modificar Usuario");

        jLabel4.setText("Actualizar Usuario");

        jLabel5.setText("Buscar Usuario");

        volver_principal.setText("Volver a ventana principal");
        volver_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver_principalActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto Sistema de Transporte Masivo - Gestión de Empleados");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/metrocali11.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        boton_adduser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/add_user.png"))); // NOI18N
        boton_adduser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_adduser1ActionPerformed(evt);
            }
        });

        boton_modificarusuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/modificar_usuario.png"))); // NOI18N
        boton_modificarusuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_modificarusuario1ActionPerformed(evt);
            }
        });

        listar_empleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/listar_usuario.jpg"))); // NOI18N
        listar_empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listar_empleadosActionPerformed(evt);
            }
        });

        boton_buscarempleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/buscar_usuario.png"))); // NOI18N
        boton_buscarempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_buscarempleadoActionPerformed(evt);
            }
        });

        jLabel6.setText("Registrar Empleado");

        jLabel7.setText("Modificar Empleado");

        jLabel8.setText("Consultar Empleado");

        jLabel9.setText("Listar Empleados");

        volver_principal1.setText("Volver a ventana principal");
        volver_principal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver_principal1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boton_buscarempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_adduser1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listar_empleados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_modificarusuario1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(64, 64, 64))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(volver_principal1)
                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_adduser1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_modificarusuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(listar_empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_buscarempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(volver_principal1)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_adduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_adduserActionPerformed
        // TODO add your handling code here:

        //Abre la ventana registrar usuarios
        Registrar_empleado obj_registrar_user = new Registrar_empleado();
        obj_registrar_user.setVisible(true);

    }//GEN-LAST:event_boton_adduserActionPerformed

    private void boton_modificarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_modificarusuarioActionPerformed
        // TODO add your handling code here:
        //Abre la ventana modificar usuario
        Modificar_empleado obj_mod_user = new Modificar_empleado();
        obj_mod_user.setVisible(true);
    }//GEN-LAST:event_boton_modificarusuarioActionPerformed

    private void boton_actualizarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_actualizarusuarioActionPerformed
        // TODO add your handling code here:

        //abre al ventana actualizar usuario
        Buscar_empleado obj_actua_user = new Buscar_empleado();
        obj_actua_user.setVisible(true);

    }//GEN-LAST:event_boton_actualizarusuarioActionPerformed

    private void boton_buscarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_buscarusuarioActionPerformed
        // TODO add your handling code here:
        //abre la ventana para consultar usuarios
 
    }//GEN-LAST:event_boton_buscarusuarioActionPerformed

    private void volver_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver_principalActionPerformed
        // TODO add your handling code here:
        // se devuelve a la ventana anterior
  
    }//GEN-LAST:event_volver_principalActionPerformed

    private void boton_adduser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_adduser1ActionPerformed
        // TODO add your handling code here:

        //Abre la ventana registrar usuarios
        Registrar_empleado obj_registrar_user = new Registrar_empleado();
        obj_registrar_user.setVisible(true);

    }//GEN-LAST:event_boton_adduser1ActionPerformed

    private void boton_modificarusuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_modificarusuario1ActionPerformed
        // TODO add your handling code here:
        //Abre la ventana modificar usuario
        Modificar_empleado obj_mod_user = new Modificar_empleado();
        obj_mod_user.setVisible(true);
    }//GEN-LAST:event_boton_modificarusuario1ActionPerformed

    private void listar_empleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listar_empleadosActionPerformed
        // TODO add your handling code here:
        //abre la ventana para consultar usuarios
       /* listar_empleados obj_buscar_user = new listar_empleados();
        obj_buscar_user.setVisible(true); */
        Listar_empleados listar = new Listar_empleados();
        ControladorEmpleado controlador = new ControladorEmpleado ();
        
        DefaultTableModel modelo;
        
        modelo = controlador.listar();
        listar.imprimir(modelo);
        
        listar.setVisible(true); 
    }//GEN-LAST:event_listar_empleadosActionPerformed

    private void boton_buscarempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_buscarempleadoActionPerformed
        // TODO add your handling code here:

        //abre al ventana actualizar usuario
        Buscar_empleado obj_actua_user = new Buscar_empleado();
        obj_actua_user.setVisible(true);

    }//GEN-LAST:event_boton_buscarempleadoActionPerformed

    private void volver_principal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver_principal1ActionPerformed
        // TODO add your handling code here:
        // se devuelve a la ventana anterior
        I_inicio obj_ventana_principal = new I_inicio();
        obj_ventana_principal.setVisible(true);
        //obj_ventana_principal.rol(rol_user);
        this.dispose();
    }//GEN-LAST:event_volver_principal1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_actualizarusuario;
    private javax.swing.JButton boton_adduser;
    private javax.swing.JButton boton_adduser1;
    private javax.swing.JButton boton_buscarempleado;
    private javax.swing.JButton boton_buscarusuario;
    private javax.swing.JButton boton_modificarusuario;
    private javax.swing.JButton boton_modificarusuario1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listar_empleados;
    private javax.swing.JButton volver_principal;
    private javax.swing.JButton volver_principal1;
    // End of variables declaration//GEN-END:variables

    public void rol(String rol) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
