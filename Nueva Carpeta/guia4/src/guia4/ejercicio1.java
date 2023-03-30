/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir 
entre sumar, restar, multiplicar y dividir. La aplicación debe tener una 
función para cada operación matemática y deben devolver sus resultados 
para imprimirlos en el main.
 */
package guia4;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
         int num1, num2, num3, num4,num5,num6;
        int num7,num8;
        System.out.println("menu");
        System.out.println("eliga la operacion");
        System.out.println("1:sumar, 2:restar, 3:multiplicar o 4:dividir");
        int respuesta = leer.nextInt();
        
        switch (respuesta) {
            case 1:
                System.out.println("eligio suma");
                System.out.println("ingrese un numero");
                num1 = leer.nextInt();
                System.out.println("ingrese otro numero");
                num2 = leer.nextInt();
                //System.out.println("La suma de ambos es: " + sumar(num1, num2));

                int retorno = sumar(num1, num2);

                System.out.println("La suma de ambos es: " + retorno);
            break;
       
    

             case 2:
                System.out.println("eligio resta");
                System.out.println("ingrese un numero");
                num3 = leer.nextInt();
                System.out.println("ingrese otro numero");
                 num4 = leer.nextInt();
               int retornor = restar(num3, num4);

                System.out.println("La resta de ambos es: " + retornor);
                 break;
             
            case 3:
                System.out.println("eligio multiplicar");
                System.out.println("ingrese un numero");
                 num5 = leer.nextInt();
                System.out.println("ingrese otro numero");
                 num6 = leer.nextInt();
               // System.out.println("el resultado es " + (num5 * num6));
                
                 int retornom = multiplicar(num5, num6);

                System.out.println("La multiplicacion de ambos es: " + retornom);
                 break;
             
             
              
            case 4:
                System.out.println("eligio dividir");
                System.out.println("ingrese un numero");
                 num7 = leer.nextInt();
                System.out.println("ingrese otro numero");
                 num8 = leer.nextInt();
                  int retornod = dividir(num7, num8);

                System.out.println("La division de ambos es: " + retornod);
              
            break;
            default:
                throw new AssertionError();
        }
      
      
    }

        
public static int sumar(int num1, int num2) {
        int suma;
        suma = num1 + num2;
        return suma;
}
public static int restar( int num3, int num4) {
        int resta;
        resta = num3 - num4;
        return resta;
}
public static int multiplicar(int num5, int num6) {
        int multi;
        multi = num5 * num6;
        return multi;
}
        public static int dividir(int num7, int num8) {
        int divi;
        divi = num7 / num8;
        return divi;
        }
}

        
      

 
        
        
        
        
    

