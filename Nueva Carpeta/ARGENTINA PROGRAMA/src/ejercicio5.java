/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números
al usuario hasta que la suma de los números introducidos supere el límite inicial.
*/


import java.util.Scanner;


public class ejercicio5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        int suma = 0;
        System.out.println("Ingrese un numero entero positivo");
        System.out.print("Numero: ");
        int num = scan.nextInt();
        do {
            System.out.print("Numero: ");
            int num1 = scan.nextInt();
            suma += num1;
        } while (suma < num);
    }
}