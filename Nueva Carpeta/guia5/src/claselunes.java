/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Luz Fernandez
 */
public class claselunes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc= new Scanner(System.in);
        // para importar randoms
        Random rdm = new Random();
        int [][] matriz = new int [4][4];
        int [][] matriz2 = new int [4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // se pone 10 pero es de 0-9
                matriz[i][j]= rdm.nextInt(10);
            }
        }
        
        System.out.println("---Matriz Original---");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("---Matriz Traspuesta---");
         for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {

                System.out.print("[" + matriz[i][j] + "]");
                matriz2[i][j]= matriz [i][j];
                
                matriz2[i][j] = (-matriz2[i][j]);
            }
            System.out.println("");
        }
         
        System.out.println("---Matriz Traspuesta negativa---");
         for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {

                System.out.print("[" + matriz2[i][j] + "]");
            }
            System.out.println("");
        }
         
        System.out.println("---Comparando matrices---");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                if(matriz[i][j]==(-matriz2[i][j])){
                  
                 System.out.print("[ Matriz 1:"+ matriz[i][j] + " es el negativo de Matriz 2:" + matriz2[i][j] + "]");

                } else {
                   System.out.println("No coinciden");
                
                }
            }
            System.out.println(" ");
        }
        
    }
    }
    
}
