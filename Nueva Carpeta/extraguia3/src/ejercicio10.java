
import java.util.Scanner;

public class ejercicio10 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
         int max = 10;
        int min = 0;
        int range = max - min + 1;
 
       
        for (int i = 0; i < 10; i++) {
            int rand = (int)(Math.random() * range) + min;
        int num = (int) (Math.random() * 0 + 10);
      
        
        System.out.println("adivine el numero ingresando uno");
        int nums = leer.nextInt();
        if (nums == rand) {
            System.out.println("adivinaste capo1");
            System.out.println("el numero era " + rand );
            break;
        } else {
            System.out.println("nop, siga intentando");
            System.out.println("ingrese nuevamente");
            int otroNum=leer.nextInt();
            while (otroNum != rand) {
                System.out.println("ingrese nuevamente un numero");
                otroNum = leer.nextInt();

            }
            System.out.println("adivinaste capo");
            System.out.println("el numero era " + rand );
            break;
        }

        

    }

}
}

