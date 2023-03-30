
import java.util.Scanner;


public class clase8mentora {

public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra: ");
        String entrada = leer.nextLine();
        String salida = codificarVocales(entrada);
        System.out.println("La frase o palabra codificada es: " + salida);
    }

    public static String codificarVocales(String entrada) {
        StringBuilder salida = new StringBuilder();
        for (char i : entrada.toCharArray()) {
            char frase = Character.toLowerCase(i);
            switch (frase) {
                case 'a':
                    salida.append('@');
                    break;
                case 'e':
                    salida.append('#');
                    break;
                case 'i':
                    salida.append('$');
                    break;
                case 'o':
                    salida.append('%');
                    break;
                case 'u':
                    salida.append('*');
                    break;
                default:
                    salida.append(i);
                    break;
            }
        }
        return salida.toString();
    }
}

