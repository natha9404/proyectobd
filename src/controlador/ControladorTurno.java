/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import accesoDatos.DaoTurno;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import logica.Turno;

/**
 *
 * @author Edison Mamian cod. 1224279
 */
public class ControladorTurno {
    DaoTurno daoTurno = new DaoTurno();
    
    public void crearTurno (Turno turno){
        daoTurno.crearTurno(turno);
    }
    
    public DefaultTableModel listar (String cedula){
        DefaultTableModel modelo;
        
        modelo = daoTurno.listar(cedula);
        
        return modelo;        
    }
    
    public ArrayList<String> buses (){
        ArrayList<String> lista;
        
        lista = daoTurno.buses();
        
        return lista;
    }
    
    public void asignar (String cedula, String id){
        daoTurno.asignar(cedula, id);
    }
    
    public String ruta (String id){
        String resultado;
        
        resultado = daoTurno.rut(id);
        
        return resultado;
    }
    
    public void conduce (String bus, String ruta, String cedula, String turno){
        daoTurno.conduce(bus, ruta, cedula,turno);
    }
    
    public String cond (String cedula){
        String resultado;
        resultado = daoTurno.cond(cedula);
        return resultado;
    }
}
