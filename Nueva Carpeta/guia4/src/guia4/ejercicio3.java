/*
 Crea una aplicación que a través de una función nos convierta una cantidad 
de euros introducida por teclado a otra moneda, estas pueden ser a dólares, 
yenes o libras. La función tendrá como parámetros, la cantidad de euros y 
la moneda a convertir que será una cadena, este no devolverá ningún valor y
mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package guia4;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("bienveniso al banco te garco");
        System.out.println("cuantos pesos desea cambiar?");
        double num = leer.nextDouble();
      

        
        
        
        double retorno = plata(num);
        System.out.println("el cambio es es: " + retorno);

    }

    public static double plata( double num) {
        double cambiar = 0;
        double dolares = 1.28;
        double yenes = 129.85;
        double libras = 0.86;
        String cambio = " ";
  System.out.println("desea combertirlo en dolares, yenes o  libras?");
        
        cambio=leer.nextLine();
        switch ("cambio") {
            case "dolares":
                System.out.println("el cambio es "+ (num * dolares));
                
                break;
                case "yenes":
                System.out.println("el cambio es "+ (num * yenes));
                
                break;
                case "libras":
                System.out.println("el cambio es "+ (num * libras));
                
                break;
            default:
                System.out.println("escrivi vien ");;
        }
        
       return cambiar ;
    }
    
}





