public class CarFather {

private int idCar;
private static int contadorCar;
    private Engine_Car Engine_Car;
    private CarChassis CarChassis;
    private CarTire CarTire;
    private DoorCar DoorCar;
    private MirrorCar MirrorCar;

    public CarFather(Engine_Car Engine_Car, CarChassis CarChassis,
                     CarTire CarTire, DoorCar DoorCar, MirrorCar MirrorCar) {


        this.Engine_Car= Engine_Car;
        this.CarChassis=CarChassis;
        this.CarTire= CarTire;
        this.DoorCar=DoorCar;
        this.MirrorCar=MirrorCar;

        this.idCar=CarFather.contadorCar++;

    }


    @Override
    public String toString() {
        return "CarFather{" +
                "idCar=" + idCar +
                ", Engine_Car=" + Engine_Car +
                ", CarChassis=" + CarChassis +
                ", CarTire=" + CarTire +
                ", DoorCar=" + DoorCar +
                ", MirrorCar=" + MirrorCar +
                '}';
    }

    public Engine_Car getEngine_Car() {
        return Engine_Car;
    }

    public CarChassis getCarChassis() {
        return CarChassis;
    }

    public CarTire getCarTire() {
        return CarTire;
    }

    public DoorCar getDoorCar() {
        return DoorCar;
    }

    public MirrorCar getMirrorCar() {
        return MirrorCar;
    }
}
