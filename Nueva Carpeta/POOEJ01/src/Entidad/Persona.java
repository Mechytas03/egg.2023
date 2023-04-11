/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
import java.util.Scanner ;
/**
 *
 * @author Luz Fernandez
 */
public class Persona {
    Scanner leer=new Scanner(System.in);
    public persona (int edad, String nombre,double Notas){
        this.edad=edad;
        this.nombre=nombre;
        this.Notas=Notas;
    }
    //public String nombre;

public Persona(){
    System.out.println("ingrese nombre");
    nombre = leer.nextLine();
    System.out.println("ingrese edad");
    edad = leer.nextnt();
    System.out.println("ingrese la nota");
    Notas = leer.nextDouble();


}

