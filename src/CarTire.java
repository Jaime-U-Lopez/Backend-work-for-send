public class CarTire {

    private int IdCArTire;
    private int rim;
    private String colour;
    private static int contadorCarTire;

    public CarTire(int rim, String colour) {
        this.rim = rim;
        this.colour = colour;
        this.IdCArTire=CarTire.contadorCarTire++;
    }

    public void getSeeCarTire() {
        System.out.println( "\n idCarTire: "+this.IdCArTire + "  the rim : " + this.rim + " Colour :  " + this.colour);

    }

    public int getRim() {
        return rim;
    }

    public void setRim(int rim) {
        this.rim = rim;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
