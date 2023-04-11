public class Rectangulo {

    public static void main(String[] args) {
        Rectangulo rec1 = new Rectangulo();
        Rectangulo rec2 = new Rectangulo (4,6);
        
        System.out.println("LA BASE ES: " + rec2.getbase());
        System.out.println("LA ALTURA ES: " + rec2.getaltura());
        System.out.println("=========");
        System.out.println("EL PERIMETRO DE REC2 ES: " + rec2.calcularPerimetro());
        System.out.println("LA SUPERFICIE DE REC2 ES: " + rec2.calcularSuperficie());
        System.out.println("=========");
        rec1.crearRectangulo();
        System.out.println("LA BASE ES: " + rec1.getbase());
        System.out.println("LA ALTURA ES: " + rec1.getaltura());
        System.out.println("=========");
        System.out.println("EL PERIMETRO DE REC1 ES: " + rec1.calcularPerimetro());
        System.out.println("LA SUPERFICIE DE REC1 ES: " + rec1.calcularSuperficie());
        System.out.println("=========");
       //rec1.setbase(8);
        ///rec1.setaltura(10);
       // rec2.setbase(5);
       // rec2.setaltura(7);
       rec1.dibujarRectangulo();
        System.out.println("");
        rec2.dibujarRectangulo();
        
        
    }
    
}