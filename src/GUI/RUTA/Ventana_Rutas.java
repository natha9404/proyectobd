/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.RUTA;

import GUI.INICIO.I_inicio;
import GUI.TURNO.AsignarTurno;
import GUI.TURNO.CrearTurno;

/**
 *
 * @author natha9404
 */
public class Ventana_Rutas extends javax.swing.JFrame {

    String rol_user;
    /**
     * Creates new form Ventana_Rutas
     */
    public Ventana_Rutas() {
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
        crear_ruta = new javax.swing.JButton();
        anadir_estaciones = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        modificar_ruta1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        anadir_estaciones1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        volver_principal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        consultar_ruta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/metrocali11.jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        crear_ruta.setBackground(new java.awt.Color(255, 255, 255));
        crear_ruta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ruta_1.png"))); // NOI18N
        crear_ruta.setEnabled(false);
        crear_ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_rutaActionPerformed(evt);
            }
        });

        anadir_estaciones.setBackground(new java.awt.Color(255, 255, 255));
        anadir_estaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/editar_estacion.png"))); // NOI18N
        anadir_estaciones.setEnabled(false);
        anadir_estaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadir_estacionesActionPerformed(evt);
            }
        });

        jLabel1.setText("Crear Ruta");

        jLabel2.setText("Modificar Ruta");

        modificar_ruta1.setBackground(new java.awt.Color(255, 255, 255));
        modificar_ruta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ruta_modificar.png"))); // NOI18N
        modificar_ruta1.setEnabled(false);
        modificar_ruta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_ruta1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Añadir Estaciones a Ruta");

        anadir_estaciones1.setBackground(new java.awt.Color(255, 255, 255));
        anadir_estaciones1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/agregar_estacion.png"))); // NOI18N
        anadir_estaciones1.setEnabled(false);
        anadir_estaciones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadir_estaciones1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Eliminar Estaciones a Ruta");

        volver_principal.setText("Volver a ventana principal");
        volver_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver_principalActionPerformed(evt);
            }
        });

        jLabel6.setText("Consultar Ruta");

        consultar_ruta.setBackground(new java.awt.Color(255, 255, 255));
        consultar_ruta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ruta_consulta.png"))); // NOI18N
        consultar_ruta.setEnabled(false);
        consultar_ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_rutaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(anadir_estaciones1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(anadir_estaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(119, 119, 119))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(volver_principal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(crear_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1)))
                .addGap(129, 129, 129)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(modificar_ruta1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(consultar_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(consultar_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(modificar_ruta1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(crear_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel1))))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(anadir_estaciones1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anadir_estaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(volver_principal)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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

    private void crear_rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_rutaActionPerformed
        Ventana_insertar_rutas asignar= new Ventana_insertar_rutas();
        asignar.toFront();
        asignar.setVisible(true);
        asignar.setTitle("Crear Ruta");
    }//GEN-LAST:event_crear_rutaActionPerformed

    private void anadir_estacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadir_estacionesActionPerformed
        Rutas_eliminarEstaciones crear= new Rutas_eliminarEstaciones();
        crear.toFront();
        crear.setVisible(true);
        crear.setTitle("Añadir Estaciones");
    }//GEN-LAST:event_anadir_estacionesActionPerformed

    private void modificar_ruta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_ruta1ActionPerformed
        // TODO add your handling code here:
        Ventana_modificar_rutas crear = new Ventana_modificar_rutas();
        crear.toFront();
        crear.setVisible(true);
        crear.setTitle("Modificar Ruta");
    }//GEN-LAST:event_modificar_ruta1ActionPerformed

    private void anadir_estaciones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadir_estaciones1ActionPerformed
        // TODO add your handling code here:
         Rutas_adicionarEstaciones crear= new Rutas_adicionarEstaciones();
        crear.toFront();
        crear.setVisible(true);
        crear.setTitle("Añadir Estaciones");
    }//GEN-LAST:event_anadir_estaciones1ActionPerformed

    private void volver_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver_principalActionPerformed
        // TODO add your handling code here:
        // se devuelve a la ventana anterior
        I_inicio obj_ventana_principal = new I_inicio();
        obj_ventana_principal.setVisible(true);
        obj_ventana_principal.rol(rol_user);
    }//GEN-LAST:event_volver_principalActionPerformed

    private void consultar_rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_rutaActionPerformed
        // TODO add your handling code here:
        Ventana_consultar_ruta crear = new Ventana_consultar_ruta();
        crear.toFront();
        crear.setVisible(true);
        crear.setTitle("Añadir Estaciones");
    }//GEN-LAST:event_consultar_rutaActionPerformed

    /**
     * @param args the commananadir_estacionests
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anadir_estaciones;
    private javax.swing.JButton anadir_estaciones1;
    private javax.swing.JButton consultar_ruta;
    private javax.swing.JButton crear_ruta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modificar_ruta1;
    private javax.swing.JButton volver_principal;
    // End of variables declaration//GEN-END:variables

    public void rol(String rol) {
       
    rol_user = rol;
    
        
        if( (rol.equals("admin")) || (rol.equals("Servicio al Cliente")) || (rol.equals("Conductor")) || (rol.equals("user"))) {
            
                    consultar_ruta.setEnabled(true);
            
        }
        else{
        
            crear_ruta.setEnabled(true);
            modificar_ruta1.setEnabled(true);
            consultar_ruta.setEnabled(true);
            anadir_estaciones.setEnabled(true);
            anadir_estaciones1.setEnabled(true);
            
            
    }
    }
}
