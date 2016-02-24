/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import accesoDatos.DaoBus;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import logica.Bus;

/**
 *
 * @author Usuario
 */
public class ControladorBus {
    DaoBus daoBus;
    
    public ControladorBus(){
        daoBus=new DaoBus();
    }
    
    public int  insertarBus(String numero_bus,String tipo,String nombre_ruta){
        Bus b = new Bus();  
        
        b.setNumero_bus(numero_bus);
        b.setTipo(tipo);
        b.setNombre_ruta(nombre_ruta);
        
        //Se llama al dao para guardar
        System.out.println("Se va a insertar un nuevo bus");
        
        int result =daoBus.registrarBus(b);

        System.out.println("Se  insertó  un  nuevo bus");
        
        return result;

    }//end
    
    public Bus consultarBus(String placa){
        Vector v= new Vector();

        Bus b = new Bus();
        
         System.out.println("Se va a consultar un Bus");

        b= daoBus.consultarBus(placa);
      
       return b;
    }
    
    public int  modificarBus(Bus b){
        
        //Se llama al dao para guardar
        System.out.println("Se van a modificar los datos del bus "+b.getNumero_bus()+"...");
        
        int result =daoBus.modificarBus(b);

        System.out.println("Se  modificaron con exito los datos del bus "+b.getNumero_bus()+".");
        
        return result;

    }//end
    
    public int  eliminarBus(String placa){
        
        //Se llama al dao para guardar
        System.out.println("Se van a eleminar los datos del bus "+placa+"...");
        
        int result =daoBus.eliminarBus(placa);

        System.out.println("Se eliminaron con exito los datos del bus "+placa+".");
        
        return result;

    }//end
    
    public DefaultTableModel listarBuses(){
        DefaultTableModel modelo;
        
        System.out.println("Se van a listar todos los Buses");

        modelo= daoBus.listarBuses();
      
       return modelo;
    }
    
    public int consultarTotalBuses(){
        int totalBuses = daoBus.consultarTotalBuses();
      
       return totalBuses;
    }
    
    public void cerrarConexionBD(){
        daoBus.cerrarConexionBD();
    }
}
