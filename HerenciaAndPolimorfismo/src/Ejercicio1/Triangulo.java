package Ejercicio1;

public class Triangulo extends Figuras{


    private Double base;
    private Double altura;
    public Triangulo( String color, Double base, Double altura){
        super(color);
        this.base=base;
        this.altura=altura;

    }

    @Override
    Double calcularArea() {
        return this.altura*this.base;
    }
}
