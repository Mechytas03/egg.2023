/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import java.util.Scanner;

/**
 *
 * @author Luz Fernandez
 */
public class Ope {

    private int num1;
    private int num2;

    public Ope() {
    }
// constructor vacio

    public Ope(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //pasa con el valor que le doy a num 
// alt + insert
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    //void carga
    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
         num1 = leer.nextInt();
        System.out.println("ingrese el segundo numero ");
        num2 = leer.nextInt();
        //metodos
    }

    public int suma() {
        int suma = num1 + num2;
        return suma;

    }

    public int resta() {
        int resta = num1 - num2;
        return resta;

    }

    public int multi() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("error");
            return 0;
        } else {
            return num1 * num2;
        }
    }

    public int div() {
        if (num2 == 0) {
            System.out.println("error");
            return 0;
        } else {
            return num1 / num2;
        }
    }
    

}
