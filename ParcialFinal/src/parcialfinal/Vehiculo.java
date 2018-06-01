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
public class Vehiculo implements Ivehiculo {
      
       private String placa;
           private String propietario;
           private float cilindraje;

    
       @Override
    public void registrarse() {
       
    }

       @Override
    public void salir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
       @Override
    public void arrancar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       @Override
    public void frenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
