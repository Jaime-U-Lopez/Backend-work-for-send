package ejercicio4Poligonos;

import static java.lang.Math.PI;

public class Circulo implements Poligonos {

    private int alto;
    private int ancho;

    public Circulo(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public int calcularArea() {


        return 0;
    }

    @Override
    public int calcularPerimetro() {

        int perimetro=this.alto+this.ancho;
        return perimetro;
    }

    @Override
    public int numeroDeLados() {
        return 0;
    }
}
