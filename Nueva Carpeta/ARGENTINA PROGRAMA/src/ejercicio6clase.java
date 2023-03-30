import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** 
 *
 * @author joaqu
 */
public class ejercicio6clase {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese 2 numeros positivos");
        int num1, num2, opc, result; //opc=opcion
        String resp = " ";
        boolean salir=false;
        num1=leer.nextInt();
        num2=leer.nextInt();
        do{
            System.out.println("1: sumar");  
            System.out.println("2: restar");  
            System.out.println("3: multiplicar");  
            System.out.println("4: dividir");  
            System.out.println("5: salir");  
            System.out.println("eliga una opcion"); 
            opc=leer.nextInt();
            switch(opc){
                case 1:
                    result = num1+num2;
                    System.out.println("la suma es: " +result);
                    
                    break;
                case 2:
                result = num1-num2;
                    System.out.println("la resta es: " +result);
                    break;
                case 3:
                    result = num1*num2;
                    System.out.println("la multiplicacion es: " +result);
                    break;
                case 4:
                    result =num1/num2;
                    System.out.println("la division es: " +result);
                    break;                
                case 5:
                    System.out.println("desea salir del programa? s/n");
                    resp=leer.next(); 
                    if (resp.equalsIgnoreCase("s")){
                        salir=true;
                    }
                    break;               
                default:
                    System.out.println("ingrese opcion valida");
                    break;
            }      
        } while(salir != true); 
    }
    }