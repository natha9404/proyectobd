/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import logica.Ruta;
import logica.RutaEstacion;

/**
 *
 * @author natha9404
 */
public class DaoRutas {
    
    
    FachadaBD fachada;
    
    public DaoRutas(){
        
        fachada = new FachadaBD();
        
    }

    public int guardarRuta(Ruta ruta) {
     
         String sql_guardar;
        sql_guardar="INSERT INTO Ruta (nombre_ruta, descripcion, imagen) VALUES ('" +
                ruta.getNombre()+ "', '" + 
                ruta.getDescripcion()+  "', '" +
                ruta.getImagen()+ "')";
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
    
    }

   

    public int insertarEstacionRuta(RutaEstacion rutaEstacion) {
     String sql_guardar;
        sql_guardar="INSERT INTO Ruta_Estacion(nombre_ruta, nombre_estacion) VALUES ('" +
                rutaEstacion.getNombre()+ "', '" + 
                rutaEstacion.getEstacion()+  "')";
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
    
    }

   
    
}
