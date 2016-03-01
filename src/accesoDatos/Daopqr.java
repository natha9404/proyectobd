/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Pqr;

/**
 *
 * @author natha9404
 */
public class Daopqr {

    FachadaBD fachada;
    
    public Daopqr(){
        
        fachada = new FachadaBD();
        
    }
    
    
    public int insertar_pqr(Pqr p) {
        
       String sql_guardar;
        int numFilas=0;
        
        sql_guardar= "INSERT INTO SQR VALUES (NEXTVAL('sqr_id'),'" + p.getTipo_pqr() + "','" + p.getDetalle() + "','" + p.getNombre() + "','" + p.getTarjeta() + "','" + p.getEstacion() + "','" + p.getFecha() + "','" + p.getEstado() + "','" + p.getRespuesta() + "')";
        
        try{
            Connection conn= fachada.getConnetion();
            System.out.println("Se conecto a la bd");
            Statement sentencia = conn.createStatement();

            numFilas = sentencia.executeUpdate(sql_guardar);            
            System.out.println("up " + numFilas);
            return numFilas;
            
        }
        catch(SQLException e){
            System.out.println(e); 
            }
        catch(Exception e){ 
            System.out.println(e);
        }
        return -1;
        
        
    }

    public int consultar_secuencia() {
        
        String sql_select;
        sql_select="SELECT NEXTVAL('sqr_id')";
        int secuencia = 0;
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando secuencia en la base de datos");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                
                secuencia = Integer.parseInt(tabla.getString(1));
                
                
            }
           
            return secuencia;
         }
         catch(SQLException | NumberFormatException e){ System.out.println(e); }
        return 0;
        
    }

    public Pqr consultar_pqr(int secuencia) {
        
     Pqr p= new Pqr();
        String sql_select;
        sql_select="SELECT * FROM SQR WHERE numero_ticket=" + secuencia;
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando pqr en la base de datos");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                
                
                p.setTipo_pqr(tabla.getString(2));
                p.setDetalle(tabla.getString(3));
                p.setNombre(tabla.getString(4));
                p.setTarjeta(tabla.getString(5));
                p.setEstacion(tabla.getString(6));
                p.setFecha(tabla.getString(7));
                p.setEstado(tabla.getString(8));
                p.setRespuesta(tabla.getString(9));
                
            }
           
            return p;
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
        return null;
    
    }

    public int contestar_pqr(Pqr p) {
        
    
        int numFilas=0;
        
        String sql_contestar = "update SQR set estado ='" + p.getEstado() + "', respuesta = '"
                 + p.getRespuesta() + "' where numero_ticket =" + p.getSecuencia_2() + ";";
        
        try{
            Connection conn= fachada.getConnetion();
            System.out.println("Se conecto a la bd");
            Statement sentencia = conn.createStatement();

            numFilas = sentencia.executeUpdate(sql_contestar);            
            System.out.println("up " + numFilas);
            return numFilas;
            
        }
        catch(SQLException e){
            System.out.println(e); 
            }
        catch(Exception e){ 
            System.out.println(e);
        }
        return -1;
    
    
    }
    
    public DefaultTableModel listarPqr(int tarjeta) {
        DefaultTableModel modelo;
        
     

        String[] encabezado = {"No SQR", "Tipo SQR", "Fecha", "Estado", "Estacion"};
        String[] datos = new String[5];
        modelo = new DefaultTableModel(null, encabezado);

        String sql_select;

        sql_select = "SELECT num_ticket,tipo_pqr,fecha,estado,nombre_estacion FROM  SQR WHERE tarjeta="+tarjeta;

        try {
            //
            Connection conn = fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            while (tabla.next()) {

                datos[0] = tabla.getString(1);
                datos[1] = tabla.getString(2);
                datos[2] = tabla.getString(3);
                datos[3] = tabla.getString(4);
                datos[4] = tabla.getString(5);
                modelo.addRow(datos);

                
                
                
//                System.out.println(tabla);
//                Pasajero pas = new Pasajero();
//                pas.setCedula(tabla.getString("cedula_pasajero"));
//                pas.setNombre(tabla.getString("nombre"));
//                pas.setTelefono(tabla.getString("telefono"));
//               // pas.getTarjeta().setId_tarjeta(Integer.parseInt(tabla.getString("id_tarjeta")));
//                listadoPasajeros.add(pas);
            }
            System.out.println("ok");
            return modelo;

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al conectar a la BD: DatosPasajero L.123");

            return modelo;
        }
    }
    
    public ArrayList<ArrayList> listarPqr_pdf(int tarjeta) {
        
          ArrayList<ArrayList> pqr = new ArrayList<>();
        ArrayList<String> num_ticket = new ArrayList<>();
        ArrayList<String> tipo_pqr = new ArrayList<>();
        ArrayList<String> fecha =new ArrayList<>();
        ArrayList<String> estado = new ArrayList<>();
        ArrayList<String> nombre_estacion =new ArrayList<>();

        System.out.println("inicia dao");
        String sql_select;
        ArrayList<ArrayList> pasajeros = new ArrayList<>();
        sql_select = "SELECT num_ticket,tipo_pqr,fecha,estado,nombre_estacion FROM  SQR WHERE tarjeta="+tarjeta;

        try {
            //
            Connection conn = fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            
            
            System.out.println("Se hizo consulta");

            while (tabla.next()) {

                System.out.println("Se guarda en array");
                System.out.println(tabla);
                num_ticket.add(tabla.getString(1));
                tipo_pqr.add(tabla.getString(2));
                fecha.add(tabla.getString(3));
                estado.add(tabla.getString(4));
                nombre_estacion.add(tabla.getString(5));
                
                System.out.println(tabla.getString(1)+tabla.getString(2)+tabla.getString(3)+tabla.getString(4));
                
            }
            System.out.println("ok");
            
            pasajeros.add(num_ticket);
            pasajeros.add(tipo_pqr);
            pasajeros.add(fecha);
            pasajeros.add(estado);
            pasajeros.add(nombre_estacion);
            
            return pasajeros;

        } catch (SQLException | NumberFormatException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al conectar a la BD: DatosPasajero L.123");

            return pasajeros;
        }
    }

    
    
}
