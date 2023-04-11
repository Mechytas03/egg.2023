/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2.
A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda 
en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar 
una división por cero, el método devuelve 0 y se le informa al usuario el error se le informa
al usuario. Si no, se hace la división y se devuelve el resultado al main.

*/
package guia7;

public class Guia7 {

        public static void main(String[] args) {
    //inicializar clase
    //en nuevo objeto
    //ope clase, operacion1 el producto ..
     Ope Operacion1=new Ope();
     //va a quedar vacio se llena con el metodo 
     Ope Operacion2=new Ope(4,2);
     //operacion1 productos nuevo con el molde ope y operacon2 es otro con el misma clase
     //este hay q llenarlo
     //set modificar el atributo
            System.out.println("el numero uno es " + Operacion2.getNum1());
            Operacion2.setNum1(999);
            System.out.println("");
            System.out.println(Operacion2.getNum1());
            
            System.out.println("la suma de los dos numeros es " + Operacion2.suma());
            System.out.println("la resta es " +Operacion2.resta());
            System.out.println("la division es "+ Operacion2.div());
            System.out.println("la multi es "+ Operacion2.multi());
            //los metods se llenan con operacion que se lleno por parametro 
          
     Operacion1.crearOperacion();
     //se llena por el usuario
            System.out.println("el resultado de la suma es "+ Operacion1.suma());
            System.out.println("el resultado de la resta es "+ Operacion1.resta());
            System.out.println("el resultado de la divi es "+ Operacion1.div());
            System.out.println("el resultado de multi es "+ Operacion1.multi());
            
     System.out.println(Operacion1.getNum1());
            Operacion1.setNum1(115);
            //modificar sin cambiar el codigo interno
            //para cambiar numeros que son privados
            
            System.out.println(Operacion1.getNum1());
            //
     
    }
    
}


