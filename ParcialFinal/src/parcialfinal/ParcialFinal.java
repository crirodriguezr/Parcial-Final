/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialfinal;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class ParcialFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
  Parqueadero Miparqueadero = new Parqueadero();
        Scanner Miscanner= new Scanner(System.in);
        Calendar calendario = Calendar.getInstance();
        int hora, minutos;
        hora =calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        
        System.out.println("------------BIENVENIDOS A MI PARQUEADERO------------"+" "+" "+hora+":"+minutos);
        System.out.println(" ");
        System.out.println("ingresa 1 si desea ingresar un vehiculo");
         System.out.println("ingresa 2 si deseas retirar un vehiculo");
          System.out.println("ingresa 3 si deseas consultar los cupos disponibles");
          int opcion=Miscanner.nextInt();
        switch(opcion){
            case 1:
                System.out.println(Miparqueadero.ingresarvehiculo() );
                System.out.println("cupos disponibles");
                break;
            case 2:
                System.out.println(Miparqueadero.retirarvehiculo());
                break;
                default:
                    System.out.println( Miparqueadero.consultarcupos());
                    break;
        }
        
        
        
        
    }
    
}
