public class Engine_Car {


    private int idEnginer;
    private String brand;
    private int horsePower;
    private static int contador;

    public Engine_Car(String brand, int horsePower) {
        this.brand = brand;
        this.horsePower = horsePower;
        int incremento = Engine_Car.contador++;
        this.idEnginer = incremento;

    }

    public void getSeeEngineCar() {

        System.out.println("\n idEnginer: " + this.idEnginer + " Brand : " + this.brand + " horsePower :" + this.horsePower);
    }

    public int getId() {
        return idEnginer;

    }

    public void setId(int id) {
        this.idEnginer = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
