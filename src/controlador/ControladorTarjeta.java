/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesoDatos.DaoTarjeta;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import logica.Aborda;
import logica.Tarjeta;

/**
 *
 * @author Usuario
 */
public class ControladorTarjeta {

    DaoTarjeta daoTarjeta;

    public ControladorTarjeta() {
        daoTarjeta = new DaoTarjeta();
    }

    public int registrarTarjeta(Tarjeta t) {

        //Se llama al dao para guardar
        System.out.println("Se va a registrar una nueva tarjeta");

        int result = daoTarjeta.registrarTarjeta(t);

        System.out.println("Se  insertó  una  nueva tarjeta");

        return result;

    }//end

    public Tarjeta consultarTarjeta(int id_tarjeta) {
        Vector v = new Vector();

        Tarjeta t = new Tarjeta();

        System.out.println("Se va a consultar una Tarjeta");

        t = daoTarjeta.consultarTarjeta(id_tarjeta);

        return t;
    }

    public int recargarTarjeta(int id_tarjeta, double valorRecarga) {
        System.out.println("Se va a recargar la tarjeta " + id_tarjeta + "...");

        int result = daoTarjeta.recargarTarjeta(id_tarjeta, valorRecarga);

        System.out.println("Se  recargo con exito la tarjeta " + id_tarjeta + ".");

        return result;
    }

    public int modificarTarjeta(Tarjeta t) {

        //Se llama al dao para guardar
        System.out.println("Se van a modificar los datos de la tarjeta " + t.getId_tarjeta() + "...");

        int result = daoTarjeta.modificarTarjeta(t);

        System.out.println("Se  modificaron con exito los datos de la tarjeta " + t.getId_tarjeta() + ".");

        return result;

    }//end

    public DefaultTableModel listarTarjetas() {
        DefaultTableModel modelo;

        System.out.println("Se van a listar todas las Tarjetas");

        modelo = daoTarjeta.listarTarjetas();

        return modelo;
    }

    public int eliminarTarjeta(int id_tajeta) {

        //Se llama al dao para guardar
        System.out.println("Se van a eleminar los datos de la tarjeta " + id_tajeta + "...");

        int result = daoTarjeta.eliminarTarjeta(id_tajeta);

        System.out.println("Se eliminaron con exito los datos de la tarjeta " + id_tajeta + ".");

        return result;

    }//end

    public int asignarPersonalizada(String cedula_pasajero, int id_tarjeta) {
        System.out.println("Se va a asignar tarjeta personalizada al pasajero " + cedula_pasajero + "...");

        int result = daoTarjeta.asignarPersonalizada(cedula_pasajero, id_tarjeta);

        System.out.println("Se asigno con exito la tarjeta personalizada " + id_tarjeta + ".");

        return result;
    }

    public int verificarPasajero(String cedula_pasajero) {
        System.out.println("Se va a verificar al pasajero " + cedula_pasajero + "...");

        int resultado = daoTarjeta.verificarPasajero(cedula_pasajero);

        System.out.println("Se verifico al pasajero " + cedula_pasajero + ".");

        return resultado;
    }

    public void cerrarConexionBD() {
        daoTarjeta.cerrarConexionBD();
    }

    public ArrayList estaciones_ticket() {
        ArrayList<String> lista = new ArrayList<>();

        lista = daoTarjeta.estaciones_ticket();
        return lista;
    }

    public int abordar(Aborda aborda) {

        int num = daoTarjeta.abordar(aborda);
        return num;

    }
}
