/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata
de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la función 
equals() de la clase String.
 */
import java.util.Scanner;

/**
 *
 * @author Luz Fernandez
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
  
        System.out.println("ingrese una letra");
       String  letra = leer.nextLine();
        // System.out.println(letra.toLowerCase());
        if (letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")||  letra.equals("A") ||  letra.equals("a")||  letra.equals("e")||  letra.equals("i")||  letra.equals("o")||  letra.equals("u")){
        System.out.println("es vocal");
    } else  {
            System.out.println("no es vocal");
         
}
   
}

    private static void toLowerCase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
