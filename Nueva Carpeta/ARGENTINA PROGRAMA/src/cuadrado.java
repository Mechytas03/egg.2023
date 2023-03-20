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
public class cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tamanio ;
        System.out.println("que tamaño quiere que sea");
        tamanio = leer.nextInt();
        
        for (int i = 1 ; i <=tamanio ; i++){
            // para i=1 bucle paraS6
            
             for (int j = 1; j<=tamanio; j++){
                 if (j == 1 || j == tamanio || i == 1 || i == tamanio ){
                  System.out.print("* ");
                  //para los *
             }else {
                    System.out.print("  ");
                    // para el espacio
            }
                    
                
            }
            System.out.println();
        }
        
    }
    
}
