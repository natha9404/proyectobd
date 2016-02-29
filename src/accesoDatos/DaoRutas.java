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
<<<<<<< HEAD
import javax.swing.JOptionPane;
=======
import java.util.ArrayList;
>>>>>>> origin/master
import logica.Ruta;
import logica.RutaEstacion;

/**
 *
 * @author natha9404
 */
public class DaoRutas {

    FachadaBD fachada;

    public DaoRutas() {

        fachada = new FachadaBD();

    }

    public int guardarRuta(Ruta ruta) {

        String sql_guardar;
        sql_guardar = "INSERT INTO Ruta (nombre_ruta, descripcion, imagen) VALUES ('"
                + ruta.getNombre() + "', '"
                + ruta.getDescripcion() + "', '"
                + ruta.getImagen() + "')";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            int numFilas = sentencia.executeUpdate(sql_guardar);
            conn.close();
            return numFilas;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;

    }

    public int insertarEstacionRuta(RutaEstacion rutaEstacion) {
        String sql_guardar;
        sql_guardar = "INSERT INTO Ruta_Estacion(nombre_ruta, nombre_estacion) VALUES ('"
                + rutaEstacion.getNombre() + "', '"
                + rutaEstacion.getEstacion() + "')";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            int numFilas = sentencia.executeUpdate(sql_guardar);
            conn.close();
            return numFilas;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;

    }

    public Ruta consultarRuta(String nombre_ruta) {
        Ruta ruta = new Ruta();

        String sql_select;
        sql_select = "SELECT * FROM Ruta WHERE nombre_ruta='" + nombre_ruta +  "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            System.out.println("se conecto");
            //
            while (tabla.next()) {

                ruta.setNombre(tabla.getString(1));
                ruta.setDescripcion(tabla.getString(2));
                ruta.setImagen(tabla.getString(3));

            }
            conn.close();
            System.out.println("Conexion cerrada");

        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Empleado no existe");
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Empleado no existe");
        }

        return ruta;

    }
<<<<<<< HEAD

    public int modificarRuta(Ruta ruta, String ruta_anterior) {
    
        String sql_modificar;
        int numFilas=0;
        
        System.out.println(ruta+"modificar");
        
        sql_modificar= "UPDATE Ruta SET descripcion='"+ruta.getDescripcion()+"' , imagen='"+ruta.getImagen()+"' WHERE nombre_ruta='"+ruta_anterior+"'";
        
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

=======
    
    public ArrayList listar_estaciones(String nombre){
        String sql_select = "SELECT nombre_estacion FROM Estacion WHERE nombre_estacion NOT IN (SELECT nombre_estacion FROM Ruta_Estacion WHERE nombre_ruta = '" + nombre + "')";
        
        ArrayList<String> lista = new ArrayList<>();
        
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            System.out.println("se conecto");
            //
            while (tabla.next()) {
                lista.add(tabla.getString(1));
                
            }
            
            conn.close();
            System.out.println("Conexion cerrada");
            return lista;
            
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }
    
    public ArrayList estaciones_eliminar(String nombre){
        String sql_select = "SELECT nombre_estacion FROM Ruta_Estacion WHERE nombre_ruta = '" + nombre + "'";
        
        ArrayList<String> lista = new ArrayList<>();
        
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            System.out.println("se conecto");
            //
            while (tabla.next()) {
                lista.add(tabla.getString(1));
                
            }
            
            conn.close();
            System.out.println("Conexion cerrada");
            return lista;
            
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }
    
    public void eliminar_estaciones (String nombre, String estacion){
        String sql = "DELETE FROM Ruta_Estacion WHERE nombre_estacion = '" + estacion + "' AND nombre_ruta = '" + nombre +"'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql);
            System.out.println("se conecto");
            //
                      
            conn.close();
            System.out.println("Conexion cerrada");
           
            
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
>>>>>>> origin/master
}
