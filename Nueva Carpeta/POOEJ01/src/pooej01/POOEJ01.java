/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


 */
package pooej01;

/**
 *
 * @author Luz Fernandez
 */
public class POOEJ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Persona primeraPersona =nueva Persona();
      //Persona segundaPersona = new Persona("Mercedes");
     Persona  Mercedes = new Persona();
        System.out.println("el nombre es "+Mercedes.getNombre());
        System.out.println("la edad es "+ Mercedes.getEdad());
        System.out.println("la nota es "+Mercedes.getNotas());
      
    }
    
}
