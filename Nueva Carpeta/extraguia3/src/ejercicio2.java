/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor 
diferente a cada una. A continuación, realizar las instrucciones necesarias 
para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D 
tome el valor de B. Mostrar los valores iniciales y los valores finales de cada 
variable. Utilizar sólo una variable auxiliar.
 */
import java.util.Scanner;

/**
 *
 * @author Luz Fernandez
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int A;
        int B;
        int C;
        int D;
        int auxi=0;
        System.out.println("ingrese todos los valores distintos");
        System.out.println("asignele un valor a A");
        A=leer.nextInt();
          System.out.println("asignele un valor a B");
        B=leer.nextInt();
          System.out.println("asignele un valor a C");
        C=leer.nextInt();
          System.out.println("asignele un valor a D");
        D=leer.nextInt();
        
      //  System.out.println("el valor de A era " + A + " y ahora  es " + D);
      //  System.out.println("el valor de B era " + B + " y ahora es " + C);
      //  System.out.println("el valor de C era " + C + " y ahora es " + A);
      //  System.out.println("el valor de D era " + D + " y ahora es " + B);
     
    A=D;
    B=C;
    C=auxi;
    auxi=A;
    D=B;
            System.out.println("el valor de A ahora  es " + A);
       System.out.println("el valor de B ahora es " + B);
       System.out.println("el valor de C  ahora es " + C);
        System.out.println("el valor de D ahora es " + D);     
    }
    
}


