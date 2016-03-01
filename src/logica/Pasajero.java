/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author win 7
 */
public class Pasajero {

    String cedula;
    String nombre;
    String telefono;
    Tarjeta tarjeta;
    String tarjeta2;
    
    
    public Pasajero() {
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    public void setTarjeta2(String tarjeta){
        
        tarjeta2=tarjeta;
        
    }
    
    public String getTarjeta2(){
        
        return tarjeta2;
        
    }
    
  

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

  
}
