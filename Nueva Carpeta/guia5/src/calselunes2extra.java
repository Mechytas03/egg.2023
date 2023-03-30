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
public class calselunes2extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Scanner leer=new Scanner(System.in);
      int matriz[][]=new int[3][3];
      int num=0;
      for (int i = 0; i < 3; i++){
          for(int j = 0; j < 3; j++)
      do{
          System.out.println("Ingrese numeros para rellenar la matriz(entre 1 y 9)");
          num=leer.nextInt();
          if (num>9){
              System.out.println("Numero no valido, reintentar");
          }else{
              matriz[i][j]=num;
          }
      }while(num>9);
      }
 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        
        int f1=(matriz[0][0])+(matriz[0][1])+(matriz[0][2]);
     int f2=(matriz[1][0])+(matriz[1][1])+(matriz[1][2]);
     int f3=(matriz[2][0])+(matriz[2][1])+(matriz[2][2]);
     int c1=(matriz[0][0])+(matriz[1][0])+(matriz[2][0]);
     int c2=(matriz[0][1])+(matriz[1][1])+(matriz[2][1]);
     int c3=(matriz[0][2])+(matriz[1][2])+(matriz[2][2]);
     int diag1=(matriz[0][0])+(matriz[1][1])+(matriz[2][2]);
     int diag2=(matriz[2][0])+(matriz[1][1])+(matriz[0][2]);
     
     if(f1==f2&f2==f3&f3==c1&c1==c2&c2==c3&c3==diag1&diag1==diag2 ){
         System.out.println("Es un cuadrado magico");
     }else{
         System.out.println("No es un cuadrado magico");
     }
    }
    
}
