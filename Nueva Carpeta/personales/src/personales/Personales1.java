/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personales;

import java.util.Scanner;

/**
 *
 * @author Luz Fernandez
 */
public class Personales1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner leer = new Scanner(System.in);
        System.out.println("Benvendos a calculadora");
        System.out.println("igrese un numero");
        int num1 = leer.nextInt();
        System.out.println("ngrese otro nuero");
        int num2 = leer.nextInt();
        System.out.println("ngrese bien los numeros?" + num1 + " y " + num2);
        String respuesta;
        respuesta = leer.nextLine();

        if (respuesta = "si") {
            System.out.println("menu");
            System.out.println("sumar presionar 1");
            System.out.println("restar presonar 2");
            System.out.println("multiplicar presionar 3");
            System.out.println("divdir presionar 4");
            int menu = leer.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("el resutado es " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("el resutado es " + (num1 + num2));
                    break;
                case 3:
                    System.out.println("el resutado es " + (num1 + num2));
                    break;
                case 4:
                    if (!(num1 = 0)) {
                        System.out.println("el resutado es " + (num1 / num2));
                    }
                    break;
            }else {
                    System.out.println("no se puede dividir x 0");
                    break;
                    }

          
            default:
            throw new AssertionError();
        }else{
            System.out.println("error");
        }
    }

}
