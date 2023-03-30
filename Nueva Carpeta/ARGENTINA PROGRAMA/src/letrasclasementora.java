import java.util.Scanner;


    public class letrasclasementora {
    public static void main(String[] args) {
  
        Scanner Leer=new Scanner(System.in);
        
        
        String pala="";
        System.out.println("Ingrese una palabra");
        pala=Leer.nextLine();
        pala=pala.toUpperCase();
        reemplazo(pala);
}
    public static String reemplazo(String pala){
       pala=pala.replaceAll("A", "@");
       pala=pala.replaceAll("E", "#");
       pala=pala.replaceAll("I", "&");
       pala=pala.replaceAll("O", "%");
       pala=pala.replaceAll("U", "*");
        System.out.println(pala);
        return pala;
    }
}

