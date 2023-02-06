package ejercicio4Poligonos;

public class Cuadrado implements Poligonos {

    private int alto;
    private int ancho;

    public Cuadrado(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public int calcularArea() {

        int area= this.alto*this.ancho;
        return area;
    }

    @Override
    public int calcularPerimetro() {

        int perimetro= this.alto+this.ancho;
        return perimetro;
    }

    @Override
    public int numeroDeLados() {

        return 4;
    }
}
