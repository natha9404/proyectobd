/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import logica.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author win 7
 */
public class DatosPasajero {
    
    
FachadaBD fachada;
    
    public DatosPasajero(){
        
        fachada = new FachadaBD();
    
    }

     public int guardarPasajero(Pasajero pas){
        String sql_guardar;
        sql_guardar="INSERT INTO Pasajero(cedula_pasajero, nombre, telefono) VALUES ('" +
                pas.getCedula() + "', '" + 
                pas.getNombre() +  "', '" +
                pas.getTelefono() + "')";
        try{
            Connection conn= fachada.conectar();
            Statement sentencia = conn.createStatement();
            int numFilas = sentencia.executeUpdate(sql_guardar);
            conn.close();
            return numFilas;
        }
        catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e); }
        return -1;
    }//fin guardar

    public Pasajero consultarPasajero(String cedula){
       
        Pasajero pas = new Pasajero();
        
        String sql_select;
        sql_select="SELECT * FROM Pasajero WHERE cedula_pasajero='" + cedula +  "'";
         try{
            Connection conn= fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            System.out.println("cedula_pasajero\tNombre");
            //
            while(tabla.next()){
               
                pas.setNombre(tabla.getString(2));
                pas.setTelefono(tabla.getString(3));

            }
            conn.close();
             System.out.println("Conexion cerrada");

         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
         
         return pas;
         
    }
    
    public int modificarPasajero(Pasajero pas){
        String sql_modificar;
        int numFilas=0;
        
        System.out.println(pas+"modificar");
        
        sql_modificar= "UPDATE Pasajero SET nombre='"+pas.getNombre()+"', telefono='"+pas.getTelefono()+"' WHERE cedula_pasajero='"+pas.getCedula()+"'";
        
        try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();

            numFilas = sentencia.executeUpdate(sql_modificar);            
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
    
    public ArrayList<Pasajero> listarPasajero(){
        ArrayList<Pasajero> listadoPasajeros = new ArrayList<>();
        String sql_select;
        
        sql_select="SELECT * FROM  Pasajero";
        
         try {
             //
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                System.out.println(tabla);
                Pasajero pas = new Pasajero();
                pas.setCedula(tabla.getString("cedula_pasajero"));
                pas.setNombre(tabla.getString("nombre"));
                pas.setTelefono(tabla.getString("telefono"));
               // pas.getTarjeta().setId_tarjeta(Integer.parseInt(tabla.getString("id_tarjeta")));
                listadoPasajeros.add(pas);
                               
            }
            System.out.println("ok");
            return listadoPasajeros;
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al conectar a la BD: DatosPasajero L.123");
            
            return listadoPasajeros;
        }
    }

}// Fin Clase
