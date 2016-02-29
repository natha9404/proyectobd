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
import logica.Empleado;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author win 7
 */
public class DaoEmpleado {
    private ResultSet rs ;
    private Statement st ;
    
    Empleado est = new Empleado();
    FachadaBD fachada;
    Connection conexion;
    
    public DaoEmpleado(){
        fachada = new FachadaBD ();
    
    }

     public int guardarEmpleado(Empleado emp){
        String sql_guardar;
        sql_guardar="INSERT INTO Empleado(cedula_empleado, nombre, telefono, direccion, cargo) VALUES ('" +
                emp.getCedula() + "', '" + 
                emp.getNombre() +  "', '" +
                emp.getTelefono() + "', '"  +
                emp.getDireccion() + "','" +
               // emp.getPrograma().getCodigo() +
                emp.getCargo() + "');";
        try{
           conexion = fachada.getConnetion();
            
            st = conexion.createStatement();
            int numFilas = st.executeUpdate(sql_guardar);
           
            return numFilas;
        }
        catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e); }
        return -1;
    }//fin guardar

    public Empleado consultarEmpleado(String cedula){
        //Programa p= new Programa();
        String sql_select;
        sql_select="SELECT *  FROM Empleado WHERE cedula_empleado = '" + cedula + "';";
         try{
            conexion = fachada.getConnetion();
            
            st = conexion.createStatement();
            
            rs = st.executeQuery(sql_select);
            
            
            //
            while(rs.next()){
               System.out.println("cedula_empleado: " + rs.getString(1) + " Nombre: " + rs.getString(2) + " Cargo:" +  rs.getString(3));
               est.setCedula(rs.getString(1));
               est.setNombre(rs.getString(2));
               est.setTelefono(rs.getString(3));
               est.setDireccion(rs.getString(4));
               est.setCargo(rs.getString(5));
            }
            
            return est;

         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
         
         return null;
    }
    
    public int modificarEmpleado(Empleado emp){
        String sql_modificar;
        int numFilas=0;
        
        sql_modificar= "UPDATE Empleado SET nombre='"+emp.getNombre()+"', telefono='"+emp.getTelefono()+"', direccion='"+emp.getDireccion()+"', cargo='"+emp.getCargo()+"' WHERE cedula_empleado='"+emp.getCedula()+"'";
        
        try{
            conexion = fachada.getConnetion();
            
            st = conexion.createStatement();

            numFilas = st.executeUpdate(sql_modificar);            
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
    
    public DefaultTableModel listarEmpleado(){
        DefaultTableModel modelo = new DefaultTableModel();
        String sql_select;
        
        String [] encabezado = {"ceduloa", "nombre", "telefono", "direccion", "cargo"};
        String [] datos = new String [5];
        
        modelo = new DefaultTableModel(null, encabezado);
        sql_select="SELECT * FROM  Empleado";
        
         try {
             //
            conexion = fachada.getConnetion();
            
            st = conexion.createStatement();
            
            rs= st.executeQuery(sql_select);
                        
            while(rs.next()){
                
                datos [0]=rs.getString(1);
                datos [1]=rs.getString(2);
                datos [2]=rs.getString(3);
                datos [3]=rs.getString(4);
                datos [4]=rs.getString(5);
                modelo.addRow(datos);
                               
            }
            System.out.println("ok");
            return modelo;
            
        } catch (SQLException | NumberFormatException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al conectar a la BD: DatosEmpleado L.123");
            
            return modelo;
        }
    }
    
    

}// Fin Clase
