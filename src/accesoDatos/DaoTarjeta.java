/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import logica.Tarjeta;

/**
 *
 * @author Usuario
 */
public class DaoTarjeta {
    FachadaBD fachada;
    
    public DaoTarjeta(){
        fachada= new FachadaBD();
    }
    
    public int registrarTarjeta(Tarjeta t){
        String sql_guardar;
        int numFilas=0;
        
        
        sql_guardar= "INSERT INTO Tarjeta(saldo,estado,deuda,cedula_empleado,nombre_estacion) VALUES ("+
                     t.getSaldo()+",'"+t.getEstado()+"',"+t.getDeuda()+",'"+t.getCedula_empleado()+"','"+
                     t.getNombre_estacion()+"')";
        
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
    
    public double consultarSaldoViejo(int id_tarjeta){
        String sql_consulta;
        double saldoViejo=0;
        
        sql_consulta="SELECT saldo FROM Tarjeta WHERE id_tarjeta="+id_tarjeta;
        
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando saldo viejo en la base de datos");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_consulta);
            
            while(tabla.next()){
                
                saldoViejo=(double)Integer.parseInt(tabla.getString(1));
              
                System.out.println("ok");
            }
           
            return saldoViejo;
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
        return -1;
    }
    
    public int recargarTarjeta(int id_tarjeta,double valorRecarga){
        String sql_guardar;
        int numFilas=0;
        double sv=this.consultarSaldoViejo(id_tarjeta);
        
        sql_guardar= "UPDATE tarjeta SET saldo = "+(sv+valorRecarga)+" WHERE id_tarjeta="+id_tarjeta;
        
        try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();

            numFilas = sentencia.executeUpdate(sql_guardar);            
            System.out.println("up " + numFilas);
            return numFilas;
            
        }
        catch(SQLException e){
            System.out.println("error en el sql");
            System.out.println(e); 
            }
        catch(Exception e){ 
            System.out.println("error");
            System.out.println(e);
        }
        return -1;
    
    }
    
    public Tarjeta consultarTarjeta(int id_tarjeta){
        Tarjeta t= new Tarjeta();
        String sql_select;
        sql_select="SELECT id_tarjeta,saldo,estado,deuda,cedula_empleado,nombre_estacion FROM  Tarjeta WHERE id_tarjeta=" + id_tarjeta;
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando Tarjeta en la base de datos");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                
                t.setId_tarjeta(Integer.parseInt(tabla.getString(1)));
                t.setSaldo((double)(Integer.parseInt(tabla.getString(2))));
                t.setEstado(tabla.getString(3));
                t.setDeuda(Integer.parseInt(tabla.getString(4)));
                t.setCedula_empleado(tabla.getString(5));
                t.setNombre_estacion(tabla.getString(6));
              
                System.out.println("ok");
            }
           
            return t;
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
        return null;
    }
    
    public int modificarTarjeta(Tarjeta t){
        String sql_modificar;
        int numFilas=0;
        
        sql_modificar= "UPDATE Tarjeta SET saldo="+t.getSaldo()+", estado='"+t.getEstado()+"',deuda="+t.getDeuda()+",cedula_empleado='"+t.getCedula_empleado()+"',nombre_estacion='"+t.getNombre_estacion()+"' WHERE id_tarjeta="+t.getId_tarjeta();
        
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
    
    public DefaultTableModel listarTarjetas(){
        DefaultTableModel modelo;
        String [] titulos = {"Id","Saldo","Estado","Deuda","Vendedor","Estacion"};
        String [] registro=new String[6];
        int totalregistros=0;
        
        modelo=new DefaultTableModel(null,titulos);
        
        String sql_select;
        
        sql_select="SELECT * FROM  Tarjeta";
        
         try {
             //
            Connection conn= fachada.getConnetion();
            System.out.println("consultando todas las Tarjetas en la base de datos");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
             //
            
            while(tabla.next()){
                registro[0]=tabla.getString("id_tarjeta");
                registro[1]=tabla.getString("saldo");
                registro[2]=tabla.getString("estado");
                registro[3]=tabla.getString("deuda");
                registro[4]=tabla.getString("cedula_empleado");
                registro[5]=tabla.getString("nombre_estacion");
                
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
    
    public int eliminarTarjeta(int id_tarjeta){
        String sql_eliminar,sql_eliminar2;
        int numFilas=0;
        
        sql_eliminar= "DELETE FROM Tarjeta WHERE id_tarjeta="+id_tarjeta;
        sql_eliminar2= "UPDATE Pasajero SET id_tarjeta = null WHERE id_tarjeta="+id_tarjeta;
        
        try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_eliminar2);
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
    
    public int asignarPersonalizada(String cedula_pasajero,int id_tarjeta){
        String sql_guardar,sql_guardar2;
        int numFilas=0;
        
        sql_guardar= "UPDATE pasajero SET id_tarjeta = "+id_tarjeta+" WHERE cedula_pasajero='"+cedula_pasajero+"'";
        sql_guardar2= "UPDATE tarjeta SET deuda = 5400 WHERE id_tarjeta="+id_tarjeta;
        
        try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_guardar2);
            numFilas = sentencia.executeUpdate(sql_guardar);            
            System.out.println("up " + numFilas);
            return numFilas;
            
        }
        catch(SQLException e){
            System.out.println("error en el sql");
            System.out.println(e); 
            }
        catch(Exception e){ 
            System.out.println("error");
            System.out.println(e);
        }
        return -1;
    
    }
    
    public int verificarPasajero(String cedula_pasajero){
        String sql_consulta;
        String tarjetaPasajero="";
        //boolean resultado;
        
        sql_consulta="SELECT id_tarjeta FROM Pasajero WHERE cedula_pasajero='"+cedula_pasajero+"'";
        
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando saldo viejo en la base de datos");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_consulta);
            
            while(tabla.next()){
                
                tarjetaPasajero=tabla.getString(1);
              
                System.out.println("ok");
            }
            
            if(tarjetaPasajero==null){
                return 1;
            }else{
                return 0;
            }
          
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
         return -1;
    }
    
    
    public void cerrarConexionBD(){
        fachada.closeConection(fachada.getConnetion());
    }
    
    public ArrayList estaciones_ticket (){
        ArrayList<String> lista = new ArrayList<>();
        String query;
        
        query = "SELECT DISTINCT nombre_ruta FROM Ruta_Estacion";
        
        try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando Tarjeta en la base de datos");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(query);
            
            while (tabla.next()){
                lista.add(tabla.getString(1));
                
            }
            return lista;
        }catch(SQLException e){
            System.out.println(e);
        }
        return lista;
    }
}
