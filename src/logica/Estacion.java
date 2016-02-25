/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;

/**
 *
 * @author Edison Mamian cod. 1224279
 */
public class Estacion {
    String nombre_estacion;
    String ubicacion;
    String empleado;
    
    public Estacion (){
        
    }
    
    public Estacion (String nombre_estacion, String ubicacion, String empleado){
        this.nombre_estacion = nombre_estacion;
        this.ubicacion = ubicacion;
        this.empleado = empleado;
    }
    
    public String getNombreEstacion (){
        return nombre_estacion;
    }
    
    public void setNombreEstacion (String nombre_estacion){
        this.nombre_estacion = nombre_estacion;
    }
    
    public String getUbicacion(){
        return ubicacion;
    }
    
    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }
    
    public String getEmpleado (){
        return empleado;
    }
    
    public void setEmpleado (String empleado){
        this.empleado = empleado;
    }
}
