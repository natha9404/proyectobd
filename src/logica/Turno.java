/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;

import java.util.Date;

/**
 *
 * @author Edison Mamian cod. 1224279
 */
public class Turno {
    Date fecha;
    String hora_inicio;
    String hora_final;
    
    public Turno(){}
    
    public Turno(Date fecha, String hora_inicio, String hora_final){
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.hora_final = hora_final;
    }
    
    public Date getFecha(){
        return fecha;
    }
    
    public void setFecha(Date fecha){
        this.fecha = fecha;
    }
    
    public String getHoraInicio(){
        return hora_inicio;
    }
    
    public void setHoraInicio(String hora_inicio){
        this.hora_inicio = hora_inicio;
    }
    
    public String getHoraFinal (){
        return hora_final;
    }
    
    public void setHoraFinal(String hora_final){
        this.hora_final = hora_final;
    }
    
}
