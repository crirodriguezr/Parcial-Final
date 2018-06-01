/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialfinal;

/**
 *
 * @author Estudiantes
 */
public class Parqueadero {
     Calculadorhora Micalculadorh = new Calculadorhora();
    Vehiculo Mivehiculo = new Vehiculo();
    int vehiculo[] = new int[100];
    int i;
    public int ingresarvehiculo(){
       for ( i=0; i < vehiculo.length; i++){
       }
        System.out.println("el vehiculo ha sido ingresado");
      return i-1;
       
    }
    public int retirarvehiculo(){
        int Vp = ((Micalculadorh.calcularhora()+200)-Micalculadorh.calcularhora())*50;
        
         System.out.println("el vehiculo ha sido retirado, por favor cancelar");
         return Vp;
    }
public int consultarcupos(){
    int Cd=i+99 ;
    
     System.out.println("El numero de cupos disponibles es");
    return Cd;    
}
}
    

