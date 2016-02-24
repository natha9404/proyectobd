/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.PQR;

import controlador.Controlador_pqr;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import logica.Pqr;

/**
 *
 * @author natha
 */
public class Consulta_pqr extends javax.swing.JFrame {

    /**
     * Creates new form consulta_pqr
     */
    public Consulta_pqr() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        
       
    }

    ArrayList<String> datos = new ArrayList<>();
    String rol_user="Gerente";

    public void rol(String rol) {

        //De acuerdo al rol del usuario se habilitan los botones
        //correspondientes a la seguridad.
        rol_user = "Gerente";
        campo_respuesta.setEditable(true);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        campo_pqr_nombre = new javax.swing.JTextField();
        campo_pqr_tarjeta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto_pqr = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        enviar_pqr = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        campo_respuesta = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        campo_tipo = new javax.swing.JTextField();
        campo_estado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        num_pqr = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        campo_estacion = new javax.swing.JTextField();
        combo_lista = new javax.swing.JComboBox();
        listar_pqr = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campo_fecha = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SISTEMA FLASH");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 215, 255), 3));

        jLabel8.setText("* Nombre:");

        jLabel10.setText("* Tarjeta No:");

        campo_pqr_nombre.setEditable(false);
        campo_pqr_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_pqr_nombreActionPerformed(evt);
            }
        });

        campo_pqr_tarjeta.setEditable(false);
        campo_pqr_tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_pqr_tarjetaActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo de PQR:");

        jLabel2.setText("Detalle del PQR:");

        texto_pqr.setEditable(false);
        texto_pqr.setColumns(20);
        texto_pqr.setRows(5);
        jScrollPane1.setViewportView(texto_pqr);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("DATOS PERSONALES (* Son obligatorios)");

        jLabel4.setText("Estación:");

        enviar_pqr.setText("Aceptar");
        enviar_pqr.setEnabled(false);
        enviar_pqr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar_pqrActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("RESPUESTA:");

        campo_respuesta.setEditable(false);
        campo_respuesta.setColumns(20);
        campo_respuesta.setRows(5);
        jScrollPane2.setViewportView(campo_respuesta);

        jLabel11.setText("Estado:");

        campo_tipo.setEditable(false);

        campo_estado.setEditable(false);

        jLabel12.setText("Numero de PQR:");

        num_pqr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_pqrActionPerformed(evt);
            }
        });
        num_pqr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num_pqrKeyTyped(evt);
            }
        });

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        campo_estacion.setEditable(false);
        campo_estacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_estacionActionPerformed(evt);
            }
        });

        combo_lista.setEnabled(false);
        combo_lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_listaActionPerformed(evt);
            }
        });

        listar_pqr.setText("Listar PQR");
        listar_pqr.setEnabled(false);
        listar_pqr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listar_pqrActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 204, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/FlashLogo.png"))); // NOI18N
        jLabel13.setText("CONSULTAR PQR");
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel13.setName("Registrar Usuario"); // NOI18N

        jLabel5.setText("Fecha:");

        campo_fecha.setEditable(false);

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campo_pqr_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(campo_pqr_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(campo_estacion, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addComponent(enviar_pqr)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton2))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel1)
                                                    .addComponent(jLabel5))
                                                .addGap(22, 22, 22)))
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                                        .addComponent(campo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(27, 27, 27)
                                                        .addComponent(jLabel11))
                                                    .addComponent(num_pqr, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(campo_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addComponent(combo_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1)
                                    .addComponent(listar_pqr))))
                        .addGap(19, 19, 19))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listar_pqr))
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num_pqr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(campo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(campo_pqr_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campo_pqr_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(campo_estacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enviar_pqr)
                    .addComponent(jButton2))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 683, Short.MAX_VALUE)
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

    private void enviar_pqrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar_pqrActionPerformed
        // TODO add your handling code here:

        SimpleDateFormat sdf = new SimpleDateFormat("mm-dd-yyyy");
        String dateInString = campo_fecha.getText();
        Date date = null;
        try {
            date = sdf.parse(dateInString);

            if (campo_respuesta.getText().trim().length() != 0) {

                int secuencia = Integer.parseInt(num_pqr.getText());
                String tipo_pqr = campo_tipo.getText();
                String detalle = texto_pqr.getText();
                String nombre = campo_pqr_nombre.getText();
                String tarjeta = campo_pqr_tarjeta.getText();
                String estacion = campo_estacion.getText();
                String estado = "Finalizado";
                String respuesta = campo_respuesta.getText();

                Controlador_pqr controlador = new Controlador_pqr();
                int n = controlador.modificar_pqr(secuencia, tipo_pqr, detalle, nombre, tarjeta, estacion, dateInString, estado, respuesta);

                if (n == 1) {
                    JOptionPane.showMessageDialog(null, "SQR se ha contestado correctamente");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Ocurrio un problema al guardar el Bus");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Hay Campos Vacios");
            }

        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Formato de fecha incompatible");
        }
        System.out.println(dateInString);
    }//GEN-LAST:event_enviar_pqrActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        Pqr p = new Pqr();
        Controlador_pqr controlador = new Controlador_pqr();

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

            if (combo_lista.isEnabled() == true) {
                // datos=obj_consultarbd.consultar_pqr(Integer.parseInt((String) combo_lista.getSelectedItem()));
            } else {
                p = controlador.consultar_pqr(Integer.parseInt(num_pqr.getText()));
            }
            //System.out.println("boton"+user+nom+ape+rol_+dir+tel+em);

            campo_tipo.setText(p.getTipo_pqr());
            texto_pqr.setText(p.getDetalle());
            campo_pqr_nombre.setText(p.getNombre());
            campo_pqr_tarjeta.setText(p.getTarjeta());
            campo_estacion.setText(p.getEstacion());
            campo_fecha.setText(p.getFecha());
            campo_estado.setText(p.getEstado());
            campo_respuesta.setText(p.getRespuesta());

            num_pqr.setEditable(false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El pqr que intenta consultar no existe");

        }

        if (rol_user.equals("Gerente")) {
            campo_respuesta.setEditable(true);
            enviar_pqr.setEnabled(true);
        } else {

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void campo_estacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_estacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_estacionActionPerformed

    private void listar_pqrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listar_pqrActionPerformed
        // TODO add your handling code here:
        ArrayList<String> lista_pqr = new ArrayList<>();

        // Bd_pqr obj_pqr_listar = new Bd_pqr();
        //lista_pqr = obj_pqr_listar.listar_pqr();
        System.out.println("METODO" + lista_pqr);

        String[] pqr_combo = new String[lista_pqr.size()];

        for (int i = 0; i < lista_pqr.size(); i++) {

            pqr_combo[i] = lista_pqr.get(i);
            System.out.println(pqr_combo[i]);

        }
        combo_lista.setModel(new javax.swing.DefaultComboBoxModel(pqr_combo));

    }//GEN-LAST:event_listar_pqrActionPerformed

    private void combo_listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_listaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_listaActionPerformed

    private void num_pqrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_pqrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_pqrActionPerformed

    private void num_pqrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num_pqrKeyTyped
        // TODO add your handling code here:

        if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_num_pqrKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campo_estacion;
    private javax.swing.JTextField campo_estado;
    private javax.swing.JTextField campo_fecha;
    private javax.swing.JTextField campo_pqr_nombre;
    private javax.swing.JTextField campo_pqr_tarjeta;
    private javax.swing.JTextArea campo_respuesta;
    private javax.swing.JTextField campo_tipo;
    private javax.swing.JComboBox combo_lista;
    private javax.swing.JButton enviar_pqr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton listar_pqr;
    private javax.swing.JTextField num_pqr;
    private javax.swing.JTextArea texto_pqr;
    // End of variables declaration//GEN-END:variables

}
