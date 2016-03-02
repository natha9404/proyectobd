/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.REPORTES;

import GUI.INICIO.I_inicio;
import GUI.PASAJEROS.Listar_pasajeros;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author natha9404
 */
public class Ventana_reportes extends javax.swing.JFrame {

    String rol_user;
    
    /**
     * Creates new form Ventana_reportes
     */
    public Ventana_reportes() {
        initComponents();
        totalPasajeros.setText("<html><p ALIGN=center>Pasajeros Movilizados</p><p ALIGN=center>Por Fecha y Ruta</p></html>");
        rutas_demanda.setText("<html><p ALIGN=center>Ruta que</p><p ALIGN=center>mas demanda de</p><p ALIGN=center> pasajeros tiene</p></html>");
        pqr.setText("<html><p ALIGN=center>SQR realizados</p><p ALIGN=center>por un id de</p><p ALIGN=center> Tarjetas </p></html>");
        listado_rutas_estaciones.setText("<html><p ALIGN=center>Listado de rutas</p><p ALIGN=center>y estaciones que</p><p ALIGN=center> conforman el sistema</p></html>");
        listado_articulados_conductores.setText("<html><p ALIGN=center>Listado buses del sistema</p><p ALIGN=center>y conductores asociados</p></html>");
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
        totalPasajeros = new javax.swing.JButton();
        listado_articulados_conductores = new javax.swing.JButton();
        listado_rutas_estaciones = new javax.swing.JButton();
        rutas_demanda = new javax.swing.JButton();
        pqr = new javax.swing.JButton();
        volver_principal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/metrocali11.jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        totalPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPasajerosActionPerformed(evt);
            }
        });

        listado_articulados_conductores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listado_articulados_conductoresActionPerformed(evt);
            }
        });

        listado_rutas_estaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listado_rutas_estacionesActionPerformed(evt);
            }
        });

        rutas_demanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutas_demandaActionPerformed(evt);
            }
        });

        pqr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pqrActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(listado_rutas_estaciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(rutas_demanda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(listado_articulados_conductores, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(pqr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(71, 71, 71))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(volver_principal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(totalPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(totalPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rutas_demanda, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(pqr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listado_articulados_conductores, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(listado_rutas_estaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(volver_principal)
                .addContainerGap(69, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void totalPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPasajerosActionPerformed
        // TODO add your handling code here:
        
        TotalPasajeros obj = new TotalPasajeros();
        obj.setVisible(true);
               
        
    }//GEN-LAST:event_totalPasajerosActionPerformed

    private void rutas_demandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutas_demandaActionPerformed
        // TODO add your handling code here:
        
        ReporteMayorDemanda  obj = new ReporteMayorDemanda();
        obj.setVisible(true);
    }//GEN-LAST:event_rutas_demandaActionPerformed

    private void pqrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pqrActionPerformed
        // TODO add your handling code here:
        Reporte_pqr obj = new Reporte_pqr();
        obj.setVisible(true);
                
        
    }//GEN-LAST:event_pqrActionPerformed

    private void listado_rutas_estacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listado_rutas_estacionesActionPerformed

        Reporte_estacionesRutas obj = new Reporte_estacionesRutas();
        obj.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_listado_rutas_estacionesActionPerformed

    private void listado_articulados_conductoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listado_articulados_conductoresActionPerformed
        // TODO add your handling code here:
        ReporteBusesArticulados obj;
        try {
            obj = new ReporteBusesArticulados();
            obj.setVisible(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ventana_reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_listado_articulados_conductoresActionPerformed

    private void volver_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver_principalActionPerformed
        // TODO add your handling code here:
        // se devuelve a la ventana anterior
        I_inicio obj_ventana_principal = new I_inicio();
        obj_ventana_principal.setVisible(true);
        obj_ventana_principal.rol(rol_user);
        //obj_ventana_principal.rol(rol_user);
        this.dispose();
    }//GEN-LAST:event_volver_principalActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    
    public void rol(String rol){
        rol_user = rol;
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listado_articulados_conductores;
    private javax.swing.JButton listado_rutas_estaciones;
    private javax.swing.JButton pqr;
    private javax.swing.JButton rutas_demanda;
    private javax.swing.JButton totalPasajeros;
    private javax.swing.JButton volver_principal;
    // End of variables declaration//GEN-END:variables
}
