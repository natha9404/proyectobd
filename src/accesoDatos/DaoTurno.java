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
import logica.Turno;

/**
 *
 * @author Edison Mamian cod. 1224279
 */
public class DaoTurno {
    private ResultSet rs = null;
    private Statement st = null;
    
    FachadaBD fachada;
    Connection conexion;
    
    public DaoTurno(){
        fachada = new FachadaBD ();
    }
    
    public void crearTurno (Turno turno){
        String sql = "INSERT INTO Turno (fecha, hora_inicio, hora_termina) VALUES ( '" + turno.getFecha() +"', '" + turno.getHoraInicio()+"', '" + turno.getHoraFinal() +"')";
        
        try{
            conexion = fachada.getConnetion();
            
            st = conexion.createStatement();
            st.executeUpdate(sql);
        }catch(SQLException e){
            System.out.println("error al conectar a la base de datos " + e);
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos");
        }
    }
    
    public DefaultTableModel listar (String cedula){
        
        DefaultTableModel modelo;
        
        String [] encabezado = {"id", "fecha", "hora inicio", "hora termina"};
        String [] datos = new String[4];
        
        modelo = new DefaultTableModel(null, encabezado);
        String sql = "SELECT * FROM Turno WHERE id_turno NOT IN (SELECT DISTINCT id_turno FROM Empleado_Turno WHERE cedula_empleado = '" + cedula + "')";
        
        try{
            conexion = fachada.getConnetion();
            st = conexion.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                
                modelo.addRow(datos);
                
            }
            
            return modelo;
            
        }catch(SQLException ex){
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "error al consultar en la base de datos");
        }        
        
        return modelo;
    }
    
    public ArrayList<String> buses (){
        ArrayList<String> bus = new ArrayList<>();
        
        String sql = "SELECT numero_bus FROM Bus";
        
        try{
            conexion = fachada.getConnetion();
            st = conexion.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                bus.add(rs.getString(1));
            }
            
            return bus;
            
        }catch(SQLException ex){
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "error al consultar en la base de datos");
        } 
        
        return bus;
    }
    
    public void asignar (String cedula, String id){
        String sql = "INSERT INTO Empleado_Turno VALUES ('" + cedula + "', '" + id + "')";
        try{
            conexion = fachada.getConnetion();
            st = conexion.createStatement();
            st.executeUpdate(sql);
                                    
        }catch(SQLException ex){
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "error al consultar en la base de datos");
        } 
    }
    
    public void conduce (String bus, String ruta, String cedula,String turno){
        String sql = "INSERT INTO Conduce VALUES ('" + bus + "', '" + ruta + "', '"+ cedula +"' , '"+ turno +"')";
        try{
            conexion = fachada.getConnetion();
            st = conexion.createStatement();
            st.executeUpdate(sql);
                                    
        }catch(SQLException ex){
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "error al consultar en la base de datos");
        } 
    }
    
    public String rut (String bus){
        String sql = "SELECT nombre_ruta FROM Bus WHERE numero_bus = '" + bus +"'";
        String resultado = "";
        try{
            conexion = fachada.getConnetion();
            st = conexion.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                resultado = rs.getString(1);
            }
            
            return resultado;
            
        }catch(SQLException ex){
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "error al consultar en la base de datos");
        }
        return resultado;
    }
    
    public String cond (String cedula){
        String resultado = null;
        
        String sql  = "SELECT * FROM Empleado WHERE cargo = 'Conductor' AND cedula_empleado = '" + cedula +"'";
        
        try{
            conexion = fachada.getConnetion();
            st = conexion.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                resultado = rs.getString(1);
            }
            
            return resultado;
            
        }catch(SQLException ex){
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "error al consultar en la base de datos");
        }
        return resultado;
        
    }
}
