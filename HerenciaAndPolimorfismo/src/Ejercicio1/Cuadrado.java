package Ejercicio1;

public class Cuadrado extends Figuras {

    private Double lado;

    public Cuadrado(String color, Double lado){
        super(color);
        this.lado=lado;
    }

    @Override
    Double calcularArea() {

        return this.lado*2;
    }
}
