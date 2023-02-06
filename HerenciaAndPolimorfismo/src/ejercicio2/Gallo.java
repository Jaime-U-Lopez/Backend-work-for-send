package ejercicio2;

public class Gallo  extends Animal  implements  Correr, Volar {


    public Gallo(String color, String sonido, Double peso) {
        super(color, sonido, peso);
    }

    @Override
    String comer() {
        return "El gallo de color :  " +this.getColor() + "Esta comiendo  por eso el peso de :"+ this.getPeso();
    }

    @Override
    String dormir() {
        return "El gallo esta durmiendo \n es de color  "+ this.getColor();
    }


    @Override
    String emitirSonido() {
        return "El sonido emitido por el gallo es : " + this.getSonido();
    }

    @Override
    public String accionCorrer() {
        return "el gallo esta corriendo en estos momentos de color :  "+ this.getColor();
    }


    @Override
    public String accionVolar() {
        return "el gallo esta volando  y es de color ";
    }
}
