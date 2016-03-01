package GUI.BUS;

import controlador.ControladorBus;
import controlador.ControladorRutas;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Bus;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author natha
 */
public class Consulta_bus extends javax.swing.JFrame {
    ControladorBus controladorBus;
    DefaultTableModel modelo;
    ArrayList<String> rutas = new ArrayList();
    String rol_user;
    /**
     * Creates new form Consulta_bus
     */
    
    
    
    public Consulta_bus() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
        setResizable(false);initComponents();
        controladorBus=new ControladorBus();
        campo_tipo_bus.setEnabled(false);
        campo_ruta_bus.setEnabled(false);
        
        //Tabla listar Buses:
        modelo=new DefaultTableModel();
        modelo.addColumn("Placa");
        modelo.addColumn("Tipo");
        modelo.addColumn("Ruta");
        
        modelo=controladorBus.listarBuses();
        this.tabla_buses.setModel(modelo);
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
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        campo_tipo_bus = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        campo_placa_bus = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        boton_eliminar_bus = new javax.swing.JButton();
        boton_modificar_bus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_buses = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        boton_consultar_bus = new javax.swing.JButton();
        boton_volver = new javax.swing.JButton();
        campo_ruta_bus = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setText("Tipo:");

        jLabel10.setText("Ruta:");

        campo_tipo_bus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Articulado", "Padron", "Alimentador" }));

        jLabel13.setText("Placa:");

        campo_placa_bus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_placa_busActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("CONSULTA DE BUSES");

        boton_eliminar_bus.setText("Eliminar");
        boton_eliminar_bus.setEnabled(false);
        boton_eliminar_bus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminar_busActionPerformed(evt);
            }
        });

        boton_modificar_bus.setText("Modificar");
        boton_modificar_bus.setEnabled(false);
        boton_modificar_bus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_modificar_busActionPerformed(evt);
            }
        });

        tabla_buses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_buses);

        jLabel2.setText("Listado de buses:");

        boton_consultar_bus.setText("Consultar");
        boton_consultar_bus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_consultar_busActionPerformed(evt);
            }
        });

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(113, 113, 113))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel13)
                        .addGap(27, 27, 27)
                        .addComponent(campo_placa_bus, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(boton_consultar_bus))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campo_ruta_bus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campo_tipo_bus, 0, 197, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(boton_modificar_bus)
                                .addGap(18, 18, 18)
                                .addComponent(boton_eliminar_bus)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel14))
                    .addComponent(boton_volver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boton_consultar_bus)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(campo_placa_bus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_tipo_bus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campo_ruta_bus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_modificar_bus)
                    .addComponent(boton_eliminar_bus))
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/metrocali11.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

    private void campo_placa_busActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_placa_busActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_placa_busActionPerformed

    private void boton_eliminar_busActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminar_busActionPerformed
        String placa;
        placa=campo_placa_bus.getText();
        //confirmacion=JOptionPane.showMessageDialog(null, "Esta seguro que desea eleminar el bus "+placa+"");
        int confirmacion=JOptionPane.showConfirmDialog(this, "Esta seguro que desea eleminar el bus "+placa+"");
        if(confirmacion==0){
            controladorBus.eliminarBus(placa);
            campo_placa_bus.setText("");
            
            modelo=controladorBus.listarBuses();
            this.tabla_buses.setModel(modelo);
            JOptionPane.showMessageDialog(null, "Se ha eliminado el bus "+placa+" exitosamente.");
        }
        
    }//GEN-LAST:event_boton_eliminar_busActionPerformed

    private void boton_modificar_busActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_modificar_busActionPerformed
        if(boton_modificar_bus.getText()=="Modificar"){
            campo_tipo_bus.setEnabled(true);
            campo_ruta_bus.setEnabled(true);
            boton_modificar_bus.setText("Guardar Cambios");
        }else if(boton_modificar_bus.getText()=="Guardar Cambios"){
            String placa,tipo,ruta;
            placa=campo_placa_bus.getText();
            tipo=(String)campo_tipo_bus.getSelectedItem();
            ruta=campo_ruta_bus.getSelectedItem().toString();
        
            Bus b=new Bus(placa,tipo,ruta);
        
            int numFilas = controladorBus.modificarBus(b);
        
            System.out.println ("Filas "+ numFilas);
            if (numFilas == 1){
            
                JOptionPane.showMessageDialog(null, "Bus modificado exitosamente");
            }
            else {
                JOptionPane.showMessageDialog(null, "Ocurrio un problema al modificar el Bus");
            }
            modelo=controladorBus.listarBuses();
            this.tabla_buses.setModel(modelo);
            
            boton_modificar_bus.setText("Modificar");
            campo_tipo_bus.setEnabled(false);
            campo_ruta_bus.setEnabled(false);
        }
    }//GEN-LAST:event_boton_modificar_busActionPerformed

    private void boton_consultar_busActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_consultar_busActionPerformed
        String placa;
        placa= campo_placa_bus.getText();
        //limpiarComponentes();

        Bus b;

        b=controladorBus.consultarBus(placa);
        listar_rutas();
        

        campo_tipo_bus.setSelectedItem(b.getTipo());
        
        campo_ruta_bus.setSelectedItem(b.getNombre_ruta());
        
        campo_tipo_bus.setEnabled(true);
        campo_ruta_bus.setEnabled(true);
        boton_eliminar_bus.setEnabled(true);
        boton_modificar_bus.setEnabled(true);
        
    }//GEN-LAST:event_boton_consultar_busActionPerformed

    private void boton_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_volverActionPerformed
        Venta_Buses ventana_buses= new Venta_Buses();
        ventana_buses.toFront();
        ventana_buses.setVisible(true);
        ventana_buses.rol(rol_user);
        this.dispose();
    }//GEN-LAST:event_boton_volverActionPerformed

    private void listar_rutas() {
    
            
            
            ControladorRutas controlador = new ControladorRutas();
            
            rutas = controlador.listarRutas();
            
            for (int i =0; i<rutas.size(); i++){
                
                campo_ruta_bus.addItem(rutas.get(i));
            }
            
            
    
    }
    
    
    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta_bus().setVisible(true);
            }
        });
    }*/


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_consultar_bus;
    private javax.swing.JButton boton_eliminar_bus;
    private javax.swing.JButton boton_modificar_bus;
    private javax.swing.JButton boton_volver;
    private javax.swing.JTextField campo_placa_bus;
    private javax.swing.JComboBox<String> campo_ruta_bus;
    private javax.swing.JComboBox campo_tipo_bus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_buses;
    // End of variables declaration//GEN-END:variables

    void rol(String rol) {
        rol_user = rol;
        if(rol_user.equals("Director Estación")){
            boton_consultar_bus.setEnabled(true);
            boton_eliminar_bus.setEnabled(true);
            boton_modificar_bus.setEnabled(true);
        }else{
            if(rol_user.equals("Conductor")){
                boton_consultar_bus.setEnabled(true);
            }
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
