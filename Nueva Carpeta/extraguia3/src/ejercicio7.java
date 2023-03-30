/*

Realice un programa que calcule y visualice el valor máximo, el valor mínimo y
el promedio de n números (n>0). El valor de n se solicitará al principio del 
programa y los números serán introducidos por el usuario. Realice dos versiones
del programa, una usando el bucle “while” y otra con el bucle “do - while”.
 */
import java.util.Scanner;

/**
 *
 * @author Luz Fernandez
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int contadorNumero = 0;
        int sumarNums = 0;
        int promedio=0;
        // int numMenor =0;
        // int numMax =0;
        int num =0;
        int menor = num;
        int mayor = num;
        int cantNumeros;

        System.out.println("cuantos numeros desea ingresar?");
        cantNumeros = leer.nextInt();

        do {
            System.out.println("ingrese un numero ");
           // int num = leer.nextInt();
            num = leer.nextInt();
            sumarNums = sumarNums + num;
            
            contadorNumero++;
            
            
            // if (num <num){
            //   num=numMenor;
            //}3
            //if (num<num){
            //  num= numMax;
            //}
            if (num > mayor) {
                mayor = num;
            }

            else if (num < menor) {
                menor = num;
            }
            else{
                System.out.println("error");
            }

        } while (cantNumeros != contadorNumero);

        System.out.println("el total de la suma de los numeros es " + sumarNums);
        System.out.println("el promedio de ellos es " + sumarNums / cantNumeros);
        System.out.println("el numero maximo es " + mayor);
        System.out.println("el numero menor es " + menor);

    }
}
