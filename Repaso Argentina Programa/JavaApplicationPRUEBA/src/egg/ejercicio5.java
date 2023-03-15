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
public class ejercicio5 {
      public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
          System.out.println("ingrese un numero");//sout + tab
          int numero = leer.nextInt();
          //numero doble var int numerDoble = numero *2
          int numeroTriple = numero * 3;
          float  raizCuadrada = (float) Math.sqrt(numero);
          System.out.println("su doble es : " + (numero * 2 ));
          System.out.println("su numero triple es " + numeroTriple);
          System.out.println("su raiz cuadrada es " + raizCuadrada);
          
          
          
}
}