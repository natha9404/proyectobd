/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesoDatos.DatosPasajero;
import logica.Pasajero;

/**
 *
 * @author natha9404
 */
public class ControladorPasajero {

    DatosPasajero daoPasajero;

    public ControladorPasajero() {

        daoPasajero = new DatosPasajero();

    }

    public int insertar_pasajero(String cedula, String nombre, String telefono) {

        Pasajero pasajero = new Pasajero();

        pasajero.setCedula(cedula);
        pasajero.setNombre(nombre);
        pasajero.setTelefono(telefono);

        System.out.println("Se va  a insertr pasajero en controlador");

        int result = daoPasajero.guardarPasajero(pasajero);

        System.out.println("Se inserto apsajero en controlador");

        return result;

    }

    public Pasajero consultar_pasajero(int cedula) {

        Pasajero pasajero = new Pasajero();

        System.out.println("Se va a consultar pasajero");

        pasajero = daoPasajero.consultarPasajero(cedula);

        return pasajero;

    }

    public int modificar_pasajero(String cedula, String nombre, String telefono) {

        Pasajero pasajero = new Pasajero();

        pasajero.setCedula(cedula);
        pasajero.setNombre(nombre);
        pasajero.setTelefono(telefono);

        System.out.println("Se va  a modificar pasajero en controlador");

        int result = daoPasajero.modificarPasajero(pasajero);

        System.out.println("Se modifico apsajero en controlador");

        return result;

    }

}
