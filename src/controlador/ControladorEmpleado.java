/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import accesoDatos.DaoEmpleado;
import javax.swing.table.DefaultTableModel;
import logica.Empleado;
/**
 *
 * @author Edison Mamian cod. 1224279
 */
public class ControladorEmpleado {
    DaoEmpleado daoEmpleado = new DaoEmpleado();
    Empleado est = new Empleado();
    
    public int crearEmpleado(Empleado emp){
        int resultado;
        
        System.out.println("Se va a crear el empleado " + emp.getNombre());
        resultado = daoEmpleado.guardarEmpleado(emp);
        System.out.println("Se creo el empleado " + emp.getNombre());
        
        return resultado;
    }
    
    public Empleado consultarEmpleado(String cedula){
        
        est = daoEmpleado.consultarEmpleado(cedula);
        
        return est;
    }
    
    public DefaultTableModel listar (){
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo = daoEmpleado.listarEmpleado();
        
        return modelo;
    }
    
    public void modificar (Empleado emp){
        daoEmpleado.modificarEmpleado(emp);
    }
}
