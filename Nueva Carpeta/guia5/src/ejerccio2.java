/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
se encuentra el numero y si se encuentra repetido
Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Ingrese el tamaño del vector");
       // int num = leer.nextInt();
        int[] vector = new int[leer.nextInt()];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rnd.nextInt(10);
            
        }
        
        System.out.println("Que numero quiere buscar");
        int buscar = leer.nextInt();
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == buscar) {
                cont++;
                System.out.println("Se encontro el numero en la posicion " + i);
            } 
            
        }
        System.out.println("Se encontro el numero  " + cont + " veces.");
 */
importjava.util.Scanner;
/**
 *
 * @author Luz Fernandez
 */
public class ejerccio2 {

    
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        
        int vector[] = (int)(Math. random()*10+1);
        
        
        
        
         	
   	 
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
   
        
