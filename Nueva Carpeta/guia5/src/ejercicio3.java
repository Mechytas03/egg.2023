/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Ingrese un numero");
        int[] vector = new int[leer.nextInt()];
        
       
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
      
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rnd.nextInt(99999);
            
        }
        
        for (int num : vector) {
            int num_digitos = Integer.toString(num).length();
            if (num_digitos == 1) {
                cont1++;
            } else if (num_digitos == 2) {
                cont2++;
            } else if (num_digitos == 3) {
                cont3++;
            } else if (num_digitos == 4) {
                cont4++;
            } else if (num_digitos == 5) {
                cont5++;
            }
        }
        System.out.println("1 digito " + cont1);
        System.out.println("2 digitos " + cont2);
        System.out.println("3 digitos " + cont3);
        System.out.println("4 digitos " + cont4);
        System.out.println("5 digitos " + cont5);
 */
import java.util.Scanner;
/**
 *
 * @author Luz Fernandez
 */
public class ejercicio3 {

    
    public static void main(String[] args) {
        // TODO code application logic here
      
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE EL TAMAÑO DEL VECTOR");
        int tamanio = entrada.nextInt();
        int[] vector = new int[tamanio];
        int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10000) + 1;
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.println("[" + vector[i] + "]");
        }

        System.out.println(" ");
        String numD;

        for (int i = 0; i < vector.length; i++) {
            numD = String.valueOf(vector[i]);

            switch (numD.length()) {
                case 1:
                    d1++;
                    break;
                case 2:
                    d2++;
                    break;
                case 3:
                    d3++;
                    break;
                case 4:
                    d4++;
                    break;
                case 5:
                    d5++;
                    break;
                default:
                    System.out.println("ERROR");
            }
        }
        System.out.println("LA CANTIDAD DE NUMERO DE 1 DIGITO ES: " + d1);
        System.out.println("LA CANTIDAD DE NUMERO DE 2 DIGITO ES: " + d2);
        System.out.println("LA CANTIDAD DE NUMERO DE 3 DIGITO ES: " + d3);
        System.out.println("LA CANTIDAD DE NUMERO DE 4 DIGITO ES: " + d4);
        System.out.println("LA CANTIDAD DE NUMERO DE 5 DIGITO ES: " + d5);
    }
}
    
