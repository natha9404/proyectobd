/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Date;

/**
 *
 * @author natha9404
 */
public class Aborda {
    
    int tarjeta;
    String nombre_ruta;
    Date fecha;
    
    public Aborda(){
        
        
        
    }
    
    public void setTarjeta(int tarjeta){
        
        this.tarjeta=tarjeta;
        
    }
    
    public int getTarjeta(){
        
        return tarjeta;
        
    }
    
    public void setNombre_ruta(String nombre_ruta){
        
        this.nombre_ruta=nombre_ruta;
        
    }
    
    public String getNombreRuta(){
        
        return nombre_ruta;
        
    }
    
    public Date getFecha (){
        return fecha;
    }    
    
    public void setFecha (Date fecha){
        this.fecha = fecha;
    }
    
}
