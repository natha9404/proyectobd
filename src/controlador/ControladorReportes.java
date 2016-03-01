/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import accesoDatos.DaoReportes;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Edison Mamian cod. 1224279
 */
public class ControladorReportes {
    DaoReportes dao = new DaoReportes();

    public ArrayList<String> cargarRutas() {
        ArrayList<String> lista;
        
        lista = dao.cargarRutas();
        
        return lista;
        
    }

    public int contar(String ruta, Date date) {
        int n = 0;
        
        n = dao.contar(ruta, date);
        
        return n;
    }

}
