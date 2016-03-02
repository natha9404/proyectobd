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
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Edison Mamian cod. 1224279
 */
public class DaoReportes {
    
    private ResultSet rs = null;
    private Statement st = null;
    
    FachadaBD fachada;
    Connection conexion;
    
    public DaoReportes (){
        fachada = new FachadaBD();
        conexion = fachada.getConnetion();
        
    }
    public ArrayList<String> cargarRutas() {
        ArrayList<String> lista = new ArrayList<>();
        String sql = "SELECT DISTINCT nombre_ruta FROM Aborda";
        try{
            st = conexion.createStatement();
            
            rs = st.executeQuery(sql);
            
            while (rs.next()){
                lista.add(rs.getString(1));
            }
            
            return lista;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al consultar en la base de datos");
        }
        
        return lista;
    }
    
    public int contar (String ruta, Date date){
        int n = 0;
        
        String sql = "SELECT COUNT(DISTINCT id_tarjeta) FROM Aborda WHERE nombre_ruta = '" + ruta + "' AND fecha = '" + date +"'";
        
        try{
            st = conexion.createStatement();
            
            rs = st.executeQuery(sql);
            
            while (rs.next()){
                n = Integer.parseInt(rs.getString(1));
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al consultar en la base de datos");
        }
        
        return n;
    }

    public DefaultTableModel busesArticulados() {
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "SELECT DISTINCT N.id_turno, Bus.numero_bus, N.nombre FROM (Conduce INNER JOIN Empleado ON Conduce.cedula_empleado = Empleado.cedula_empleado) AS N INNER JOIN Bus ON Bus.numero_bus = N.numero_bus WHERE Bus.tipo = 'Articulado'";
        
        String [] encabezado = {"turno", "bus", "conductor"};
        
        String [] datos = new String[3];
        
        modelo = new DefaultTableModel(null, encabezado);
        
        try{
            st = conexion.createStatement();
            
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                
                modelo.addRow(datos);
            }
            
            return modelo;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al consultar en la base de datos");
        }
        
        return modelo;
    }

    public ArrayList<ArrayList> tabla() {
        ArrayList<ArrayList> pdf = new ArrayList<>();
        ArrayList<String> turnos = new ArrayList<>();
        ArrayList<String> buses = new ArrayList<>();
        ArrayList<String> empleados = new ArrayList<>();
        
        String sql = "SELECT DISTINCT N.id_turno, Bus.numero_bus, N.nombre FROM (Conduce INNER JOIN Empleado ON Conduce.cedula_empleado = Empleado.cedula_empleado) AS N INNER JOIN Bus ON Bus.numero_bus = N.numero_bus WHERE Bus.tipo = 'Articulado'";
        
        try{
            st = conexion.createStatement();
            
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                turnos.add(rs.getString(1));
                buses.add(rs.getString(2));
                empleados.add(rs.getString(3));
            }
            
            pdf.add(turnos);
            pdf.add(buses);
            pdf.add(empleados);
            return pdf;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al consultar en la base de datos"+ex);
        }
        
        return pdf;
    }

    public DefaultTableModel mayorDemanda() {
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "SELECT MAX(count), nombre_ruta FROM (SELECT COUNT(id_tarjeta), nombre_ruta FROM Aborda GROUP BY nombre_ruta) AS N GROUP BY nombre_ruta";
        
        String [] encabezado = {"cantidad pasajeros", "ruta"};
        
        String [] datos = new String[2];
        
        modelo = new DefaultTableModel(null, encabezado);
        
        try{
            st = conexion.createStatement();
            
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                                
                modelo.addRow(datos);
            }
            
            return modelo;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al consultar en la base de datos");
        }
        
        return modelo;
    }

    public ArrayList<ArrayList> imprimir() {
        ArrayList<ArrayList> pdf = new ArrayList<>();
        ArrayList<String> cantidad = new ArrayList<>();
        ArrayList<String> ruta = new ArrayList<>();
        
        
        String sql = "SELECT MAX(count), nombre_ruta FROM (SELECT COUNT(id_tarjeta), nombre_ruta FROM Aborda GROUP BY nombre_ruta) AS N GROUP BY nombre_ruta";
        
        try{
            st = conexion.createStatement();
            
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                cantidad.add(rs.getString(1));
                ruta.add(rs.getString(2));
                
            }
            
            pdf.add(cantidad);
            pdf.add(ruta);
            
            return pdf;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al consultar en la base de datos"+ex);
        }
        
        return pdf;
    }

}
