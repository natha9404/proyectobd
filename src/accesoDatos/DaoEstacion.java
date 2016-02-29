/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package accesoDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Estacion;

/**
 *
 * @author Edison Mamian cod. 1224279
 */
public class DaoEstacion {
    
    private ResultSet rs = null;
    private Statement st = null;
    
    FachadaBD fachada;
    Connection conexion;
    
    public DaoEstacion(){
        fachada = new FachadaBD ();
    }
    
    public Estacion consultar (String nombre){
        Estacion respuesta = new Estacion();
        
        try{
            conexion = fachada.getConnetion();
            
            st = conexion.createStatement();
            rs = st.executeQuery("SELECT nombre_estacion, ubicacion, nombre FROM Estacion INNER JOIN Empleado ON Estacion.cedula_empleado = Empleado.cedula_empleado WHERE nombre_estacion = '" + nombre +"';");
            
            while(rs.next()){
                String est = rs.getString(1);
                String ubicacion = rs.getString(2);
                String empleado = rs.getString(3);
                
                respuesta.setNombreEstacion(est);
                respuesta.setUbicacion(ubicacion);
                respuesta.setEmpleado(empleado);
            }
            
            return respuesta;
        }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "error al conectar a la base de datos");
        }
        
        
        return null;
    }
    
    public ArrayList<String> estaciones(){
        
        ArrayList<String> esta =  new ArrayList<>();
        
        
         try{
            conexion = fachada.getConnetion();
            st = conexion.createStatement();
            
            rs = st.executeQuery("SELECT DISTINCT nombre_estacion FROM Estacion");
        
            while (rs.next()){
                
                String obj = rs.getString(1);
               esta.add(obj);
                
            }
        }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "error al conectar a la base de datos");
        }
        
        return esta;
    }
    
    public DefaultTableModel listar (){
        DefaultTableModel modelo;
        
        String [] encabezado = {"nombre", "ubicacion", "encargado"};
        String [] datos = new String [3];
        
        modelo = new DefaultTableModel(null, encabezado);
        
        try{
            conexion = fachada.getConnetion();
            st = conexion.createStatement();
            
            rs = st.executeQuery("SELECT nombre_estacion, ubicacion, nombre FROM Estacion INNER JOIN Empleado ON Estacion.cedula_empleado = Empleado.cedula_empleado;");
        
            while (rs.next()){
                datos [0]=rs.getString(1);
                datos [1]=rs.getString(2);
                datos [2]=rs.getString(3);
                
                modelo.addRow(datos);
            }
        }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "error al conectar a la base de datos");
        }
        
        return modelo;
    }
    
    public int modificar (Estacion es){
        String query;
        
        query = "UPDATE Estacion SET nombre_estacion = '" + es.getNombreEstacion() + "', ubicacion = '" + es.getUbicacion() + "', cedula_empleado = '" + es.getEmpleado() + "' WHERE nombre_estacion = '" + es.getNombreEstacion() +"';";
        
        try{
            conexion = fachada.getConnetion();
            st = conexion.createStatement();
            
            int n = st.executeUpdate(query);
            
            return n;
            
        }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "error al conectar a la base de datos");
        }
        
        return -1;
    }
    
    public int crear (Estacion es){
        String query;
        
        query = "INSERT INTO Estacion VALUES ('" + es.getNombreEstacion() + "', '" + es.getUbicacion() + "', '" + es.getEmpleado() + "');";
        
        try{
            conexion = fachada.getConnetion();
            st = conexion.createStatement();
            
            int n = st.executeUpdate(query);
            
            return n;
            
        }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "error al conectar a la base de datos");
        }
        
        return -1;
    }
    
    public int eliminar (String nombre){
        int filas;
        
        try{
            conexion = fachada.getConnetion();
            st = conexion.createStatement();
            
            filas = st.executeUpdate("DELETE FROM Estacion WHERE nombre_estacion = '" + nombre + "';");
            
            return filas;
        }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "error al conectar a la base de datos");   
        }
        
        return -1;
    }
    
    public ArrayList encargados (){
        ArrayList <String> lista = new ArrayList<>();
        String query;
        
        query = "SELECT nombre FROM Empleado WHERE cargo = 'Director de Estación' AND cedula_empleado NOT IN (SELECT cedula_empleado FROM Estacion);";
       
        try{
            conexion = fachada.getConnetion();
            st = conexion.createStatement();
            
            rs = st.executeQuery(query);
            
            while (rs.next()){
                lista.add(rs.getString(1));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return lista;
    }
    
    public String id_encargado (String nombre){
        String id = "";
        
        String query;
        
        query = "SELECT cedula_empleado FROM Empleado WHERE cargo = 'Director de Estacion' AND nombre = '" + nombre +"';";
        
        try{
            conexion = fachada.getConnetion();
            st = conexion.createStatement();
            
            rs = st.executeQuery(query);
                        
            while(rs.next()){
                id = rs.getString(1);
            }
            
            return id;
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return id;
    }
}
