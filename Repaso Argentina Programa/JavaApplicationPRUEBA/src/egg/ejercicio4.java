/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg;
import java.util.Scanner;

/**
 *
 * @author Luz Fernandez
 */
public class ejercicio4 {
      public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("ingrese los grados centigrados y veamos cuanto sufre");
    int cel = leer.nextInt();
    int fah = 32 + (9 * cel  / 5 );
    System.out.println("en fahrenheit son : " + fah );
    
    
    
    
    
}
}