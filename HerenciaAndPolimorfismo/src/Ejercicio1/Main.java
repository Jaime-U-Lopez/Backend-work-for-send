package Ejercicio1;

public class Main {

    public static void main(String[] args) {

        Cuadrado cuadrado = new Cuadrado( "orange",25.0);
        Triangulo triangulo = new Triangulo( "Green", 454.4,2.0);

        double printCuadrado= cuadrado.calcularArea();
        System.out.println("Area del Cuadrado = " + printCuadrado);
        double printTriangulo= triangulo.calcularArea();
        System.out.println(" Area de Triangulo = " + printTriangulo);
        

    }
}
