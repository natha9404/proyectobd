/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import accesoDatos.DaoEstacion;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import logica.Estacion;

/**
 *
 * @author Edison Mamian cod. 1224279
 */
public class ControladorEstacion {
    DaoEstacion daoEstacion;
    
    public ControladorEstacion (){
        daoEstacion = new DaoEstacion ();
    }
    
    public int insertarEstacion (String nombre, String ubicacion, String empleado){
        int resultado;
        
        Estacion est = new Estacion();
        
        est.setNombreEstacion(nombre);
        est.setUbicacion(ubicacion);
        est.setEmpleado(empleado);
        
        System.out.println("se va crear la estacion " + nombre);
        
        resultado = daoEstacion.crear(est);
        
        System.out.println("se creo la estacion " + nombre);
        
        return resultado;
    }
    
    public Estacion consultarEstacion (String nombre){
        Estacion est;
        
        System.out.println("se va a consultar la estacion " + nombre);
        
        est = daoEstacion.consultar(nombre);
        
        return est;
    }
    
    public int modificarEstacion (Estacion est){
        int filas;
        
        System.out.println("se va a modificar la estacion " + est.getNombreEstacion());
        
        filas = daoEstacion.modificar(est);
        
        System.out.println("se moficio la estacion " + est.getNombreEstacion());
        return filas;
    }
    
    public int eliminarEstacion (String nombre){
        int resultado;
        
        System.out.println("se va a eliminar la estacion " + nombre);
        
        resultado = daoEstacion.eliminar(nombre);
        
        System.out.println("se elimino la estacion " + nombre);
        return resultado;
    }
    
    public DefaultTableModel listarEstaciones (){
        DefaultTableModel modelo;
        
        modelo = daoEstacion.listar();
        
        return modelo;
    }
    
    public ArrayList listarEncargados (){
        ArrayList <String> encargado;
        
        encargado = daoEstacion.encargados();
        
        return encargado;
    }
    
    public String encargado (String nombre){
        String id;
        System.out.println("controlador");
        id = daoEstacion.id_encargado(nombre);
        return id;
    }

    public ArrayList<String> listaEstaciones() {
        
        ArrayList<String> estaciones;
        
        estaciones = daoEstacion.estaciones();
        
        return estaciones;
    
    
    }
}
