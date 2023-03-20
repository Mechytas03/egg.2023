/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Realizar un programa que pida dos números enteros positivos por teclado y muestre
por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa
deberá mostrar el resultado por pantalla y luego volver al menú. El programa deberá 
ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona 
la opción 5, en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de
confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona 
el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
import java.util.Scanner;

/**
 *
 * @author Luz Fernandez
 */
public class ejercici6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
         System.out.println("Bienvenido a calculando");
         System.out.println("ingrese su nombre");
         String nombre;
         nombre = leer.nextLine();
         System.out.println(nombre + " ingrese un numero");
         int numero;
         numero = leer.nextInt();
         System.out.println(nombre + " ingresa otro numero");
         int numero2;
         numero2 = leer.nextInt();
         
         if (numero > numero2){
             int respuesta;
             System.out.println(" menu:");
               System.out.println("suma:1");
                 System.out.println("resta:2");
                   System.out.println("multiplicacion:3");
                     System.out.println("division:4");
                      respuesta = leer.nextInt();
                     switch (respuesta) {
                 case 1:
                     System.out.print(" la respuesta es " +( numero + numero2 ));
                      break;
                 case 2:
                     System.out.print( " la respuesta es " +(numero - numero2));
                     break;
                case 3:
                     System.out.print(" la respuesta es " + (numero * numero2));
                     break;
                 case 4:
                     System.out.print(" la respuesta es " + (numero / numero2));
                     break;
                default:
                     System.out.print(" adios");
                     break;
             }
         }
         
         else{
            int respuesta;
             System.out.println(" menu:");
               System.out.println("suma:1");
                 System.out.println("resta:2");
                   System.out.println("multiplicacion:3");
                     System.out.println("division:4");
                      respuesta = leer.nextInt();
                     switch (respuesta) {
                 case 1:
                     System.out.print(" la respuesta es " +( numero2 + numero ));
                      continue;
                 case 2:
                     System.out.print( " la respuesta es " +(numero2 - numero));
                     continue;
                case 3:
                     System.out.print(" la respuesta es " + (numero2 * numero));
                     continue
                 case 4:
                     System.out.print(" la respuesta es " + (numero2 / numero));
                     continue;
                default:
                     System.out.print(" adios");
                     break;
             }
         }
    }
    
}
