/*
 Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
números del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca
un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
import java.util.Scanner;
/**
 *
 * @author Luz Fernandez
 */
public class ejercicio12 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int auxi=0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <9 ; j++) {
               if (i==0 ||i==9 ){
                   i=i +1;
                   System.out.println(i+"-"+i+"-"+i);
                   if(i == 3){
                       String str;
                       str = i.toString();
                       str="E";
                       
                   }
               }
                   
                
                
            }
            
        }
    }
    
}
