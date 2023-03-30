
import java.util.Scanner;

public class ejercicio14 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("bienvenidas familias");
        System.out.println("cuantas familias son?");
        int flias = leer.nextInt();
        
        int coun = 0;
        int edades = 0;
     
        int tedades = 0;
        do {
            coun = coun + 1;
            System.out.println("cuantos hijos tiene la familia numero " + coun);
            int fia = leer.nextInt();
            System.out.println("la familia " + coun + "tienen " + fia + "hijos");
            int counH = 0;
            int promEdades=0;
            do {
                System.out.println("que edades tienen ?");
                int edad = leer.nextInt();

                tedades = tedades + edad;
                counH = counH + 1;
                promEdades=tedades / counH;
                
            } while (fia !=counH);
             
            System.out.println("y el promedio de sus edades de la flia " + coun + " es " + promEdades);
           
        } while (flias != coun);


    }

}

