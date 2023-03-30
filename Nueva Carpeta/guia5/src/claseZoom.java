/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Luz Fernandez
 */
public class claseZoom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        System.out.println("ingrese primer valor");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese segundo valor");
        int numero2 = leer.nextInt();
        
        System.out.println("Elija la operacion matematica\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividr");
        
        int eleccion = leer.nextInt();
        
        switch (eleccion) {
            case 1:
                System.out.println("La suma es "+suma(numero1, numero2));
                break;
                 case 2:
                System.out.println("La resta es "+resta(numero1, numero2));
                break;
                 case 3:
                System.out.println("La multi es "+multiplicacion(numero1, numero2));
                break;
                 case 4:
                System.out.println("La divi es "+division(numero1, numero2));
                break;
            default:
               System.out.println("eleccion no valida");
        }
    }
    
    public int suma(int n1, int n2) { 
        return n1 + n2;
    }

    public int resta(int n1, int n2) {
        return n1 - n2;
    }

    public int multiplicacion(int n1, int n2) {
        return n1 * n2;
    }

    public int division(int n1, int n2) {  
         return n1 / n2;
    }
    }
    

