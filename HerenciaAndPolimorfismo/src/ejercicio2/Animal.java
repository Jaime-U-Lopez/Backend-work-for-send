package ejercicio2;

public abstract class Animal {

    private String color;

    private String sonido;

    private Double peso;


    public Animal() {
    }

    public Animal(String color, String sonido, Double peso) {
        this.color = color;
        this.sonido = sonido;
        this.peso = peso;
    }


    abstract String comer();

    abstract String dormir();

    abstract String emitirSonido();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
