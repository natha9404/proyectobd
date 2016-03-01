/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesoDatos.Daopqr;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import logica.Pqr;

/**
 *
 * @author natha9404
 */
public class Controlador_pqr {

    Daopqr daoPqr;

    public Controlador_pqr() {
        daoPqr = new Daopqr();

    }

    public int secuencia() {
        
        int secuencia = daoPqr.consultar_secuencia();
        return secuencia;

    }

    public int insertar_pqr(String tipo_pqr, String detalle, String nombre,
            String tarjeta, String estacion, String dateInString,
            String estado, String respuesta) {

        Pqr p = new Pqr();

        p.setTipo_pqr(tipo_pqr);
        p.setDetalle(detalle);
        p.setNombre(nombre);
        p.setTarjeta(tarjeta);
        p.setEstacion(estacion);
        p.setFecha(dateInString);
        p.setEstado(estado);
        p.setRespuesta(respuesta);

        //Se llama al dao para guardar
        System.out.println("Se va a insertar un nuevo bus");

        int result = daoPqr.insertar_pqr(p);

        System.out.println("Se  insertó  un  nuevo bus");

        return result;
    }

    public Pqr consultar_pqr(int secuencia) {
    
        Pqr pqr = new Pqr();
        
        System.out.println("Se va a consultar pqr");
        
        pqr = daoPqr.consultar_pqr(secuencia);
        
        return pqr;
    
    }

    public int modificar_pqr(int secuencia, String tipo_pqr, String detalle, String nombre, String tarjeta, String estacion, String dateInString, String estado, String respuesta) {
        
        Pqr p = new Pqr();
        

        p.setSecuencia(secuencia);
        p.setTipo_pqr(tipo_pqr);
        p.setDetalle(detalle);
        p.setNombre(nombre);
        p.setTarjeta(tarjeta);
        p.setEstacion(estacion);
        p.setFecha(dateInString);
        p.setEstado(estado);
        p.setRespuesta(respuesta);

        //Se llama al dao para guardar
        System.out.println("Se va contestar sqr");

        int result = daoPqr.contestar_pqr(p);

        System.out.println("Se  contesto sqr");

        return result;      
        
    
    
    }

    public DefaultTableModel listarPqr(int tarjeta) {
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo = daoPqr.listarPqr(tarjeta);
        
        return modelo;
      }

    public ArrayList<ArrayList> listarPqr_pdf(int tarjeta) {
       
        ArrayList<ArrayList> pqr = new ArrayList<>();
        
        pqr = daoPqr.listarPqr_pdf(tarjeta);
        
       
        return pqr;
    
    }

}
