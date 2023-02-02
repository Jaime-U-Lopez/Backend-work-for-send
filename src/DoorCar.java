public class DoorCar {

    private int idDoorCar;
    private static int ContadorDoorCar;
    private int numberDoor;
    private String colorDoor;

    public DoorCar(int numberDoor, String colorDoor) {
        this.numberDoor = numberDoor;
        this.colorDoor = colorDoor;
        this.idDoorCar = DoorCar.ContadorDoorCar++;

    }


    public void getSeeDoor() {
        System.out.println("\n idNumberDoor :" + this.idDoorCar + " Number Door : " + this.numberDoor
                + " Colour door " + this.colorDoor
        );


    }

    public int getNumberDoor() {
        return numberDoor;
    }

    public void setNumberDoor(int numberDoor) {
        this.numberDoor = numberDoor;
    }

    public String getColorDoor() {
        return colorDoor;
    }

    public void setColorDoor(String colorDoor) {
        this.colorDoor = colorDoor;
    }
}
