



import java.util.Scanner;


public class ejercicio8 {

    public static void main(String[] args) {
  

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num = 0;
        int contadorPar = 0;
        int contadorImpar = 0;
        int contador = 0;

        while (num % 5 == 0) {
            if  (num !=5){
                System.out.println("Ingrese un número");
                num = leer.nextInt();
                if (num > 0) {
                    if (num % 2 == 0) {
                        contadorPar++;
                    } else {
                        contadorImpar++;
                    }
                }
                contador++;
            } else {
                break;
            }
        }
        
        System.out.println("Se leyeron " + contador + " números");
        System.out.println("Se leyeron " + contadorPar + " números pares");
        System.out.println("Se leyeron " + contadorImpar + " números impares");
    }
}
