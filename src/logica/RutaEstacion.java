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
public class RutaEstacion {
    
    String nombre_ruta;
    String estacion;
    
    public RutaEstacion(){
        
        
    }

    public void setNombre(String nombre_ruta) {
        this.nombre_ruta=nombre_ruta;
       }

    public void setEstacion(String estacion) {
        this.estacion=estacion;
        }
    
     public String getNombre( ) {
        return nombre_ruta;
       }

    public String getEstacion( ) {
        return estacion;
        }
    
    
}
