/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.PQR;

import controlador.ControladorEstacion;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import controlador.Controlador_pqr;

/**
 *
 * @author natha
 */
public class Pqr_Ventana extends javax.swing.JFrame {

    /**
     * Creates new form pqr
     * 
     */
    public Pqr_Ventana() {
       initComponents();
         this.setLocationRelativeTo(null);
         this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
         setResizable(false);
    }

    ArrayList<String> datos = new ArrayList<>();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        campo_pqr_nombre = new javax.swing.JTextField();
        campo_pqr_tarjeta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ComboBox_tipopqr = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto_pqr = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        combo_estacion = new javax.swing.JComboBox();
        enviar_pqr = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campo_fecha = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        boton_volver = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA FLASH");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 215, 255), 3));

        jLabel8.setText("* Nombre Completo:");

        jLabel10.setText("* No. de Tarjeta:");

        campo_pqr_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_pqr_nombreActionPerformed(evt);
            }
        });

        campo_pqr_tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_pqr_tarjetaActionPerformed(evt);
            }
        });
        campo_pqr_tarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_pqr_tarjetaKeyTyped(evt);
            }
        });

        jLabel1.setText("Tipo de PQR:");

        ComboBox_tipopqr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Solicitud", "Reclamo" }));
        ComboBox_tipopqr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_tipopqrActionPerformed(evt);
            }
        });

        jLabel2.setText("Detalle del PQR:");

        texto_pqr.setColumns(20);
        texto_pqr.setRows(5);
        jScrollPane1.setViewportView(texto_pqr);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("DATOS PERSONALES (* Son obligatorios)");

        jLabel4.setText("Estación");

        combo_estacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "oese", "norte" }));
        combo_estacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_estacionActionPerformed(evt);
            }
        });

        enviar_pqr.setText("Enviar");
        enviar_pqr.setEnabled(false);
        enviar_pqr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar_pqrActionPerformed(evt);
            }
        });

        jButton1.setText("Cargar Estaciones");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 204, 255));
        jLabel11.setText("REGISTRAR PQR");
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel11.setName(""); // NOI18N

        jLabel5.setText("Fecha (MM-DD-YYYY):");

        jButton2.setText("Verificar Pasajero");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        boton_volver.setText("Volver");
        boton_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(147, 147, 147)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(enviar_pqr)
                            .addComponent(jButton1)
                            .addComponent(combo_estacion, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campo_pqr_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(47, Short.MAX_VALUE))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel10))
                                    .addGap(31, 31, 31))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel5))
                                    .addGap(7, 7, 7)))
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campo_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addComponent(campo_pqr_tarjeta)
                                .addComponent(ComboBox_tipopqr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton2)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)))
                    .addComponent(boton_volver))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton_volver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_pqr_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(14, 14, 14)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox_tipopqr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_pqr_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(4, 4, 4)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(combo_estacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enviar_pqr)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_pqr_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_pqr_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_pqr_nombreActionPerformed

    private void campo_pqr_tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_pqr_tarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_pqr_tarjetaActionPerformed

    private void ComboBox_tipopqrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_tipopqrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_tipopqrActionPerformed

    private void enviar_pqrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar_pqrActionPerformed
        // TODO add your handling code here:

        SimpleDateFormat sdf = new SimpleDateFormat("mm-dd-yyyy");
	String dateInString = campo_fecha.getText();
	Date date = null;
        try {
            date = sdf.parse(dateInString);
            
            
if ((texto_pqr.getText().trim().length() != 0) && (campo_pqr_nombre.getText().trim().length() != 0) && (campo_pqr_tarjeta.getText().trim().length() != 0) && (campo_fecha.getText().trim().length() != 0) ) {
        
        String tipo_pqr = (String) ComboBox_tipopqr.getSelectedItem();
        String detalle = texto_pqr.getText();
        String nombre = campo_pqr_nombre.getText();
        String tarjeta = campo_pqr_tarjeta.getText();
        String estacion = (String) combo_estacion.getSelectedItem();
        String estado = "Iniciado";
        String respuesta  = "";
        
        Controlador_pqr controlador = new Controlador_pqr();
        int secuencia = controlador.secuencia();
        int n = controlador.insertar_pqr(tipo_pqr, detalle, nombre, tarjeta, estacion,dateInString, estado, respuesta);
        
        if(n==1){
            JOptionPane.showMessageDialog(null, "Su pqr se ha enviado correctamente. Su id es :"+ secuencia);
            this.dispose();
        }else {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al guardar el Bus");
        }
        
        }
        else{
            JOptionPane.showMessageDialog(this, "Hay Campos Vacios");
        }
            
            
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Formato de fecha incompatible");
        }
	System.out.println(dateInString);
        
        
        
        
        
    }//GEN-LAST:event_enviar_pqrActionPerformed

    private void combo_estacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_estacionActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_combo_estacionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        ArrayList<String> estaciones = new ArrayList();
            
            ControladorEstacion controlador = new ControladorEstacion();
            
            estaciones = controlador.listar_estaciones2();
            
            for (int i =0; i<estaciones.size(); i++){
                
                combo_estacion.addItem(estaciones.get(i));
            
    }
        
        enviar_pqr.setEnabled(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void campo_pqr_tarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_pqr_tarjetaKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_campo_pqr_tarjetaKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        
        
        jButton1.setEnabled(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void boton_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_volverActionPerformed

        this.dispose();
    }//GEN-LAST:event_boton_volverActionPerformed

    
   
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBox_tipopqr;
    private javax.swing.JButton boton_volver;
    private javax.swing.JTextField campo_fecha;
    private javax.swing.JTextField campo_pqr_nombre;
    private javax.swing.JTextField campo_pqr_tarjeta;
    private javax.swing.JComboBox combo_estacion;
    private javax.swing.JButton enviar_pqr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea texto_pqr;
    // End of variables declaration//GEN-END:variables

    void rol(String rol_user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
