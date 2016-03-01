/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import logica.Bus;

/**
 *
 * @author Usuario
 */
public class DaoBus {
    FachadaBD fachada;
    
    public DaoBus(){
        fachada= new FachadaBD();
    }
    
    public int registrarBus(Bus b){
        String sql_guardar;
        int numFilas=0;
        
        sql_guardar= "INSERT INTO Bus(numero_bus,tipo,nombre_ruta) VALUES ('"+
                     b.getNumero_bus()+"','"+b.getTipo()+"','"+b.getNombre_ruta()+"')";
        
        try{
            Connection conn= fachada.getConnetion();
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
    
    public Bus consultarBus(String placa){
        
        System.out.println("SE ENTRO AL DAO BUS "+ placa);
        
        Bus b= new Bus();
        String sql_select;
        sql_select="SELECT numero_bus,tipo,nombre_ruta FROM  Bus WHERE numero_bus='" + placa + "';";
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando Bus en la base de datos");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                
                b.setNumero_bus(tabla.getString(1));
                
                b.setTipo(tabla.getString(2));
                
                b.setNombre_ruta(tabla.getString(3));
              
                System.out.println("ok SE GUARDO"+tabla.getString(1)+tabla.getString(2)+tabla.getString(3));
            }
           
            return b;
         }
         catch(SQLException e){ System.out.println(e+"ERROR"); }
         catch(Exception e){ System.out.println(e+"ERROR"); }
        return null;
    }
    
    public int modificarBus(Bus b){
        String sql_modificar;
        int numFilas=0;
        
        sql_modificar= "UPDATE Bus SET tipo='"+b.getTipo()+"', nombre_ruta='"+b.getNombre_ruta()+"' WHERE numero_bus='"+b.getNumero_bus()+"'";
        
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
    
    public int eliminarBus(String placa){
        String sql_eliminar;
        int numFilas=0;
        
        sql_eliminar= "DELETE FROM Bus WHERE numero_bus='"+placa+"'";
        
        try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();

            numFilas = sentencia.executeUpdate(sql_eliminar);
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
    
    public DefaultTableModel listarBuses(){
        DefaultTableModel modelo;
        String [] titulos = {"Placa","Tipo","Ruta"};
        String [] registro=new String[3];
        int totalregistros=0;
        
        modelo=new DefaultTableModel(null,titulos);
        
        String sql_select;
        
        sql_select="SELECT * FROM  Bus";
        
         try {
             //
            Connection conn= fachada.getConnetion();
            System.out.println("consultando todos los Buses en la base de datos");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
             //
            
            while(tabla.next()){
                registro[0]=tabla.getString("numero_bus");
                registro[1]=tabla.getString("tipo");
                registro[2]=tabla.getString("nombre_ruta");
                
                totalregistros=totalregistros+1;
                
                modelo.addRow(registro);
                               
            }
            System.out.println("ok");
            return modelo;
            
        } catch (Exception e) {
            
            System.out.print(e);
            return null;
        }
    }
    
    public int consultarTotalBuses(){
        String sql_totalBuses;
        
        sql_totalBuses="SELECT COUNT(*) FROM Bus";
        
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando Bus en la base de datos");
            Statement sentencia = conn.createStatement();
            ResultSet tabla1 = sentencia.executeQuery(sql_totalBuses);
            //tabla.
            int cantidadTotal=Integer.parseInt(tabla1.toString());
            
           
            return cantidadTotal;
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
        return -1;
    }
    
    public void cerrarConexionBD(){
        fachada.closeConection(fachada.getConnetion());
    }
}
