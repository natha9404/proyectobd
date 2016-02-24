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
public class Bus {
    String numero_bus;
    String tipo;
    String nombre_ruta;

    public Bus() {
    }

    public Bus(String numero_bus, String tipo, String nombre_ruta) {
        this.numero_bus = numero_bus;
        this.tipo = tipo;
        this.nombre_ruta = nombre_ruta;
    }

    public String getNumero_bus() {
        return numero_bus;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre_ruta() {
        return nombre_ruta;
    }

    public void setNumero_bus(String numero_bus) {
        this.numero_bus = numero_bus;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre_ruta(String nombre_ruta) {
        this.nombre_ruta = nombre_ruta;
    }
    
}
