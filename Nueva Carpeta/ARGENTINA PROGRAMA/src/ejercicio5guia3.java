/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Escriba un programa en el cual se ingrese un valor límite positivo, y a 
continuacion 
solicite números al usuario hasta que la suma de los números introducidos 
supere el límite inicial.
 */
import java.util.Scanner;

/**
 *
 * @author Luz Fernandez
 */
public class ejercicio5guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner leer = new Scanner(System.in);
          int numero1, numero2,numeroLimite;
          System.out.println("ingrese el limite positivo");
          numeroLimite = leer.nextInt();
          //leer por teclado y guardarla en numero limite
          do {System.out.println("ingrese un numero");
          numero1 = leer.nextInt();
          numero2 = leer.nextInt();
               
    } while ((numero1 + numero2 )> numeroLimite);
          
    
}
}