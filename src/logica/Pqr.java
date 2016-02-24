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
public class Pqr {

    int secuencia_2 = 0;
    String tipo_pqr;
    String secuencia;
    String detalle;
    String nombre;
    String tarjeta;
    String estacion;
    String dateInString;
    String estado;
    String respuesta;

    public Pqr() {

    }

    public Pqr(String tipo_pqr, String detalle, String nombre,
            String tarjeta, String estacion, String dateInString,
            String estado, String respuesta) {

        this.tipo_pqr = tipo_pqr;
        this.detalle = detalle;
        this.nombre = nombre;
        this.tarjeta = tarjeta;
        this.estacion = estacion;
        this.dateInString = dateInString;
        this.estado = estado;
        this.respuesta = respuesta;

    }
    
    public Pqr(String secuencia,String tipo_pqr, String detalle, String nombre,
            String tarjeta, String estacion, String dateInString,
            String estado, String respuesta) {

        this.secuencia = secuencia;
        this.tipo_pqr = tipo_pqr;
        this.detalle = detalle;
        this.nombre = nombre;
        this.tarjeta = tarjeta;
        this.estacion = estacion;
        this.dateInString = dateInString;
        this.estado = estado;
        this.respuesta = respuesta;

    }

    public void setTipo_pqr(String tipo_pqr) {

        this.tipo_pqr = tipo_pqr;
        
    }

    public void setDetalle(String detalle) {

        this.detalle = detalle;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public void setTarjeta(String tarjeta) {

        this.tarjeta = tarjeta;
    }

    public void setEstacion(String estacion) {

        this.estacion = estacion;
    }

    public void setFecha(String dateInString) {

        this.dateInString = dateInString;
    }

    public void setEstado(String estado) {

        this.estado = estado;
    }

    public void setRespuesta(String respuesta) {

        this.respuesta = respuesta;
    }

    public String getTipo_pqr() {

        return tipo_pqr;
    }

    public String getDetalle() {
        return detalle;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public String getEstacion() {
        return estacion;
    }

    public String getFecha() {
        return dateInString;
    }

    public String getEstado() {
        return estado;
    }

    public String getRespuesta() {
        return respuesta;
    }
    
    public void setSecuencia(String secuencia){
        
    }
    
    public String getSecuencia(){
        return secuencia;
    }

    public void setSecuencia(int secuencia) {
        secuencia_2 = secuencia;
        
        }
    
    public int getSecuencia_2(){
        
        return secuencia_2;
        
    }

    

}
