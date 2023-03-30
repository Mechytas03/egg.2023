

import java.util.Scanner;

/**
 *
 * @author Luz Fernandez
 */
public class ejercicioaye {

    public static void main(String[] args) {
  
Scanner leer = new Scanner(System.in);
        //System.out.println("Ingrese un numero");
        // int num = leer.nextInt();
        int numeroPar = 0;
        int numeroImpar = 0;
        int numLeidos = 0;

        do {
             System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            if (num % 2 == 0) {
                numeroPar++;
            } else {
                numeroImpar++;
            }
            if (num > 0) {
                numLeidos++;
            }

            if (num % 5 == 0) {
                break;
            }
            } while (true);

        System.out.println("La cantidad de numeros impares es :" + numeroImpar);
        System.out.println("La cantidad de numeros pares es : " + numeroPar);
        System.out.println("La cantidad de numeros ingresados es :" + numLeidos);
    
    }
}