/*
 Declaración y creación de un Vector
tipo[] arregloV = new tipo[Tamaño];
Declaración y creación de una Matriz
tipo[][] arregloM = new tipo[Filas][Columnas];


Realizar un algoritmo que llene un vector con los 100 primeros números 
enteros y los muestre por pantalla en orden descendente.
int[] vector = new int[100];
        for (int i = 99; i >= 0; i--) {
            vector[i] = i;
            System.out.println(vector[i]);
        }
 */

public class ejercicio1 {

    public static void main(String[] args) {
        
        
        int[] vec = new int[100];
        
        for (int i = 0; i < 100; i++) {
            vec[i] = (int) (100);
        }

      
        for (int i = 100; i > 0; i--) {
            System.out.println("[" + i + "]");
        }
        
        System.out.println(" ");
     
    }

}
