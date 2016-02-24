/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import java.sql.*;
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

    
    
}
