/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesoDatos.DaoRutas;
import java.util.ArrayList;
import logica.Ruta;
import logica.RutaEstacion;

/**
 *
 * @author natha9404
 */
public class ControladorRutas {

    DaoRutas daoRutas;

    public ControladorRutas() {

        daoRutas = new DaoRutas();

    }

    public int insertarRuta(String nombre_ruta, String descripcion, String ruta_imagen) {

        Ruta ruta = new Ruta();
        ruta.setNombre(nombre_ruta);
        ruta.setDescripcion(descripcion);
        ruta.setImagen(ruta_imagen);

        System.out.println("Se va  a insertr ruta en controlador");

        int result = daoRutas.guardarRuta(ruta);

        System.out.println("Se inserto ruta en controlador");

        return result;

    }

    public int insertarEstacionRuta(String nombre_ruta, ArrayList<String> estacion_añadir) {

        RutaEstacion rutaEstacion = new RutaEstacion();
        int result = 0;
        for (int i = 0; i < estacion_añadir.size(); i++) {
            rutaEstacion.setNombre(nombre_ruta);
            rutaEstacion.setEstacion(estacion_añadir.get(i));
            result = daoRutas.insertarEstacionRuta(rutaEstacion);

        }

        return result;
    }

}
