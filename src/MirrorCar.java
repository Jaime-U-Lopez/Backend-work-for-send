public class MirrorCar {

    private int idMirror;
    private int opacity;
    private String colour;

    private static int contadorMirror;

    //constructor
    public MirrorCar(int opacity, String colour) {

        this.opacity = opacity;
        this.colour = colour;
        int incremento = MirrorCar.contadorMirror++;
        this.idMirror = incremento;

    }


    public int getOpacity() {
        return this.opacity;
    }

    public String getColour() {
        return this.colour;
    }

    public void getSeeMirrorCar() {
        System.out.println("\n IDMirror : " + this.idMirror + " Opacity : " + this.opacity + " Colour : " + this.colour  +"\n");

    }
}
