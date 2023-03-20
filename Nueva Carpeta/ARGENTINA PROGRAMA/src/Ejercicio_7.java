

import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String cadena;
        int correctas=0, incorrectas=0;
        // contador
  
        do {
            System.out.println("Ingrese cadena de no mas de 5 caracteres:");
            cadena = sc.nextLine();
            cadena = cadena.toUpperCase();
            int longitud = cadena.length();

            String ini = cadena.substring(0,1);
            String fin = cadena.substring(4, 5);
            
            //String codigo="&&&&&";
            switch (longitud) {
                case 5:
                    if ((ini.equals("X")) && fin.equals("O")) {
                        System.out.println("Correcto");
                        correctas++;
                    } else if (!"&&&&&".equals(cadena)) {
                        System.out.println("incorrecto");
                        incorrectas++;
                        //sumar
                        break;
                    }  
                    break;

                default:
                    System.out.println("Supero los 5 caracteres y no se tendra en cuenta...");
                    break;
            }
            
        } while (!"&&&&&".equals(cadena));
        
        System.out.println("Las correctas son:" + correctas + " y las Incorrectas son:" + incorrectas);
    }     
}