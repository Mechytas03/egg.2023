/*
 Diseñe una función que pida el nombre y la edad de N personas e imprima
los datos de las personas ingresadas por teclado e indique si son mayores
o menores de edad. Después de cada persona, el programa debe preguntarle 
al usuario si quiere seguir mostrando personas y frenar cuando el usuario
ingrese la palabra “No”.
 */
package guia4;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("bienvenido");
        System.out.println("cuantas personas seran encuestadas?");
        int cant = leer.nextInt();

        int retorno = personas(cant);

        System.out.println("La suma de ambos es: " + retorno);
    }

    public static int personas(int cant) {
    int  returns ;
    int i=0;
    returns=i;
        for ( i = 0; i < cant; i++) {
            System.out.println("cual es su nombre");
            int nombre = leer.nextInt();
            System.out.println("ingrese la edad");
            int edad = leer.nextInt();
            System.out.println(nombre + edad);
            if (edad >= 18) {
                System.out.println("usted es mayor de edad");

            } else {
                System.out.println("es menor de edad pebete");
            }
            System.out.println("desea seguir agregagndo? 1:si o 2:no");
            int siono = leer.nextInt();

            if (siono == 1) {
            } else {
                System.out.println("adios");
                break;
           }
        }
       return retums ;
    } 
   
}


