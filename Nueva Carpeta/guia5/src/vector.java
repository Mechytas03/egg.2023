
import java.util.Scanner;










public class vector{
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

   	 
    	int vector[] = new int[5]; 
// Le ponemos la dimension al vector
   	
    	// Puedo asignar valores de esta manera
    	vector[0] = 3;
   	 
    	// Asigno valores mediante el for
    	for (int i = 0; i < 5; i++) {
    	 
        	vector[i] = i + 3;
       	 
    	}
   	 
    	// Muestro el vector
    	for (int i = 0; i < 5; i++) {
        	System.out.println("[" + vector[i] + "]");
    	}
   	 
}
}

