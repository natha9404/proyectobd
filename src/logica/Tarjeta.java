/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Usuario
 */
public class Tarjeta {
    int id_tarjeta;
    double saldo;
    String estado;
    double deuda;
    String cedula_empleado;
    String nombre_estacion;
    
    public Tarjeta(){
    }

    public Tarjeta(int id_tarjeta, double saldo, String estado, double deuda, String cedula_empleado, String nombre_estacion) {
        this.id_tarjeta = id_tarjeta;
        this.saldo = saldo;
        this.estado = estado;
        this.deuda = deuda;
        this.cedula_empleado = cedula_empleado;
        this.nombre_estacion = nombre_estacion;
    }

    public int getId_tarjeta() {
        return id_tarjeta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getEstado() {
        return estado;
    }

    public double getDeuda() {
        return deuda;
    }

    public String getCedula_empleado() {
        return cedula_empleado;
    }

    public String getNombre_estacion() {
        return nombre_estacion;
    }

    public void setId_tarjeta(int id_tarjeta) {
        this.id_tarjeta = id_tarjeta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public void setCedula_empleado(String cedula_empleado) {
        this.cedula_empleado = cedula_empleado;
    }

    public void setNombre_estacion(String nombre_estacion) {
        this.nombre_estacion = nombre_estacion;
    }
    
}
