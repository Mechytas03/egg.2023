
import java.util.Scanner;
/**
 *
 * @author Luz Fernandez
 */
public class eureka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner leer = new Scanner(System.in);
                String frase;
                System.out.println("ingrese la frase");
                frase = leer.nextLine();
                if (frase.equals("eureka"))
                    System.out.println("es igual");
                else 
                    System.out.println("son distintas ");
    }
                

    }