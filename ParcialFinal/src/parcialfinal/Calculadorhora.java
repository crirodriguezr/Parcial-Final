/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialfinal;

import java.util.Calendar;

/**
 *
 * @author Estudiantes
 */
public class Calculadorhora {
    
    public int calcularhora(){
        Calendar calendario = Calendar.getInstance();
        int hora, minutos;
        hora =calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        int horaenminutos = hora*60;
     return horaenminutos+minutos;
    }
}
