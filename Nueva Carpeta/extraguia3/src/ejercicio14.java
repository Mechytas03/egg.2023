/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M 
cantidad de hijos. Escriba un programa que pida la cantidad de familias y para 
cada familia la cantidad de hijos para averiguar la media de edad de los hijos 
de todas las familias.
 */
import java.util.Scanner;
/**
 *
 * @author Luz Fernandez
 */
public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("bienvenidas familias");
        System.out.println("cuantas familias son?");
        int flias = leer.nextInt();
        int coun= 0;
        int edades=0;
 
        do{
            coun= coun + 1;
            System.out.println("cuantos hijos tiene " + "familia numero " + coun) ;
            int fia =leer.nextInt();
            System.out.println("la familia " + coun + "tienen " + fia + "hijos" );
            do{
                System.out.println("que edades tienen ?");
                int edad=leer.nextInt();
                edades= edades + edades;
                
            } while (coun == fia );
            System.out.println("y el promedio de sus edades es " +  ( edades/coun ));
        }while (coun == flias);
    }
    
}

