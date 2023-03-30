
public class forCorto {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE EL TAMAÑO DEL VECTOR");
        int tamanio = entrada.nextInt();
        int[] vector = new int[tamanio];
        int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10000) + 1;
        }

        for (int elemento: vector) {
            System.out.println("[" + elemento + "]");
        }

        System.out.println(" ");
        String numD;

        for (int elemento: vector) {
            numD = String.valueOf(elemento);

            switch (numD.length()) {
                case 1:
                    d1++;
                    break;
                case 2:
                    d2++;
                    break;
                case 3:
                    d3++;
                    break;
                case 4:
                    d4++;
                    break;
                case 5:
                    d5++;
                    break;
                default:
                    System.out.println("ERROR");
            }
        }
        System.out.println("LA CANTIDAD DE NUMERO DE 1 DIGITO ES: " + d1);
        System.out.println("LA CANTIDAD DE NUMERO DE 2 DIGITO ES: " + d2);
        System.out.println("LA CANTIDAD DE NUMERO DE 3 DIGITO ES: " + d3);
        System.out.println("LA CANTIDAD DE NUMERO DE 4 DIGITO ES: " + d4);
        System.out.println("LA CANTIDAD DE NUMERO DE 5 DIGITO ES: " + d5);
    }
}
