/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Leer la altura de N personas y determinar el promedio de estaturas que se
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general
 */
import java.util.Scanner;
/**
 *
 * @author Luz Fernandez
 */
public class ejercicio6 {

    private static int alturaTotal;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("cuantas son las personas");
       double persona = leer.nextInt();
        
   
   double promedio= 0;
    do {
        System.out.println("ingrese la altura");
           double altura =leer.nextFloat();
       double  altutaTotal= altura +altura;
               
       promedio ++;
    }while (promedio != persona);
   double prom=(alturaTotal / persona);
 System.out.println("el promedio general es " + prom);
   
if (prom<1.60){
    System.out.println("eres un hobbiet");
}
       
    }
    
}
