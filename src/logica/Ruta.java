/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author natha9404
 */
public class Ruta {
    
    String nombre_ruta;
    String descripcion;
    String ruta_imagen;
    
    public Ruta(){
        
    }
    
    

    public void setNombre(String nombre_ruta) {
        this.nombre_ruta=nombre_ruta;
        
       }

    public void setDescripcion(String descripcion) {
        this.descripcion=descripcion;
     }

    public void setImagen(String ruta_imagen) {
        this.ruta_imagen=ruta_imagen;
     }
    
     public String getNombre( ) {
        return nombre_ruta;
        
       }

    public String getDescripcion( ) {
        return descripcion;
     }

    public String getImagen( ) {
        return ruta_imagen;
     }
    
}
