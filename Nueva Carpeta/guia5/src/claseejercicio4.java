
import java.util.Scanner;
import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luz Fernandez
 */
public class claseejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);        
       Random rdm = new Random();
        int[] [] matriz = new int [4] [4];
     for (int i = 0; i < matriz.length; i++){
         for (int j = 0; j < matriz.length; j++){
          matriz [i][j]= rdm.nextInt(11);    
         }
     }
     String aux = " ";
     for (int i = 0; i < matriz.length; i++){
         for (int j = 0; j < matriz.length; j++){
          // aux += matriz[i][j];
             System.out.print("[" +matriz[i][j]+ "]");
         }
         System.out.println(" ");
     }
        System.out.println("   ");
     
        for (int i = 0; i < matriz.length; i++){
         for (int j = 0; j < matriz.length; j++){
          // aux += matriz[i][j];
             System.out.print("[" +matriz[j][i]+ "]");
         }
         System.out.println(" ");
     }
       
    
    }

}
 