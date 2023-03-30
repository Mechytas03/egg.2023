/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para 
los mismos tratamientos que los socios del tipo A.na cuota mayor, pero tienen un 50% de descuento en 
todos los tipos de tratamientos.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre 
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un 
valor real que represente el costo del tratamiento (previo al descuento) y 
determine el importe en efectivo a pagar por dicho socio.


/**
 *
 * @author Luz Fernandez
 */
import java.util.Scanner;
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
         int cuotaA = 100000;
         int cuotaB = 50000;
         int cuotaC =25000;
         
         System.out.println("Bienvenidos a obra no hay salud");
         System.out.println("que tipo de socio es A:1 , B:2 o C:3");
         int socio = leer.nextInt();
         
        switch (socio){
        case 1:
        System.out.println("su cuota es de " + cuotaA);
        System.out.println("ingrese e valor del tratamiento");
        int tratamientoa = leer.nextInt();
        System.out.println("debe pagar "  +(cuotaA + (tratamientoa / 2)));
        break;
        
        case 2:
        System.out.println("su cuota es de " + cuotaB);
        System.out.println("ingrese e valor del tratamiento");
        int tratamientob = leer.nextInt();
        System.out.println("debe pagar " + (((tratamientob *65)/100)+ cuotaB));
        break;
        
        case 3:
        System.out.println("su cuota es de " + cuotaC) ;
        System.out.println("ingrese e valor del tratamiento");
        int tratamientoc = leer.nextInt();
        System.out.println("debe pagar " + (cuotaC+tratamientoc)) ;
        break;
        default:
            System.out.println("error");
        
    }
    }
    
}

