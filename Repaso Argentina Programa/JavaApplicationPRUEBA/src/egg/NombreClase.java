/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//cuando creamos la clase psvn para ejecutar el programa 
package egg;

/**
 *psvm mas tab
 * @author Luz Fernandez
 */
import java.util.Scanner;
public class NombreClase {
    public static void main(String[] args) {
       //aca se ejectuta el programa
       //int num declarar una variable como entero
       //num = o inicializar
       //num=1; asignacion
       //declariacion e inicializar en la misma sentencia
       //++ incremento -- incremento 
       //++ numero sumar y mostras , numero ++ mostrar numero y sumar
       //== comparacion = asignacion 
       //concatenar una var + (para operaciones matematicas)
       // las letras se gurdan con''
       //concat concatenar
       //System.out.println para imprimir
       //contains v o f si tiene el caracter subcadena
       //para leer
       Scanner leer = new Scanner (System.in);
       System.out.println("ingrese dos numeros");
       int num1 = leer.nextInt();
       int num2 = leer.nextInt();
       
       int suma = num1 + num2;
       System.out.println("el resultado es" + suma);
       
               
               
               
       
    }
}