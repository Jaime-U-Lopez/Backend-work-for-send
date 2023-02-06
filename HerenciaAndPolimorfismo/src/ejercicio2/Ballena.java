package ejercicio2;

public class Ballena extends Animal implements Nadar {

    public Ballena(String color, String sonido, Double peso) {
        super(color, sonido, peso);
    }

    @Override
    String comer() {

        return "Esta comiendo en estos momentos la ballena  de color : " +this.getColor();
    }


    @Override
    String dormir() {
     return "Duerme en estos momento la ballena   ";
    }

    @Override
    String emitirSonido() {
        return  " El sonido emitido es : " + this.getSonido();
    }

    @Override
    public String accionNadar() {
        return "la ballena esta nadando y es de color "+this.getColor();
    }
}

