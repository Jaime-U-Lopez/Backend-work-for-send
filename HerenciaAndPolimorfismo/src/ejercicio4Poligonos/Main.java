package ejercicio4Poligonos;

public class Main {

    public static void main(String[] args) {

        Circulo circulo= new Circulo(4,6);
        Cuadrado cuadrado = new Cuadrado(45,45);
        Triangulo triangulo= new Triangulo(45,45);

        int printCuadrado= cuadrado.calcularArea();
        System.out.println("El area del cuadrado es  = " + printCuadrado);
        int printTriandgulo= triangulo.calcularArea();
        System.out.println("El area del triangulo es  = " + printTriandgulo);

        int printCiculo= circulo.calcularArea();
        System.out.println("El area del Circulo es:  = " + printCiculo);


    }
}
