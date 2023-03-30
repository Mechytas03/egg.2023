/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luz Fernandez
 */
public class ejercicio2clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int aux = 1;
        
        System.out.println("Ingrese ingrese los valores para 'A, B, C, D'");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int d = entrada.nextInt();
        
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
    }
}
    }
    
}
