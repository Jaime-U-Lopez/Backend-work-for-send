package ejercicio2;

public class Rana  extends Animal implements Saltar{


    public Rana(String color, String sonido, Double peso) {
        super(color, sonido, peso);
    }

    @Override
    String comer() {
        return "La rana come  por eso su peso es : "+ this.getPeso() +" de color "+ this.getColor();
    }

    @Override
    String emitirSonido() {
        return "la rana emite el siguiente sonido : "+ this.getSonido();
    }

    @Override
    String dormir() {
        return "la rana duerme en este momento ";
    }


    @Override
    public String accionSaltar() {
        return "La rana salta  ahora con un peso "+ this.getPeso() + "de color "+this.getColor();
    }
}
