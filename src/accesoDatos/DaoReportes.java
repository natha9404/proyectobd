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

}
