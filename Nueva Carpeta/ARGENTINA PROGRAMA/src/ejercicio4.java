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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner leer = new Scanner(System.in);
                System.out.println("ingrese una frase");
                //String frase = leer.nextline();
                String frase;
                frase = leer.nextLine();
                if (frase.substring(0,1).equals("A")){
                    System.out.println("tiene letra A");
                } else {
                    System.out.println("incorrecto");
                }

    }
    
}


