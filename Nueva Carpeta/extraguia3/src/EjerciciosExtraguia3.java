/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, 
si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 
día, 2 horas.
 */

import java.util.Scanner;

/**
 *
 * @author Luz Fernandez
 */
public class EjerciciosExtraguia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese los minutos");
        System.out.println("----------------------------------");
        int min = leer.nextInt();
        int hor = (min / 60);
//2 horas
        int dias = 0;
        while (hor > 24 ) {
            dias = dias + 1;
            hor = hor - 24;
        }

        System.out.println("----------------------------------");

        System.out.println("en horas seria " + hor);
        System.out.println("----------------------------------");
        System.out.println("en dias seria " + dias);
        System.out.println("----------------------------------");

    }

}
