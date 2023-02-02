public class Main {
    public static void main(String[] args) {


        // instanciando objetos
        CarChassis carChassis1 = new CarChassis(34, "red");
        CarTire carTire1 = new CarTire(17, "platino");
        DoorCar doorCar1 = new DoorCar(4, "platino");
        Engine_Car engine_Car1 = new Engine_Car("Tokio", 500);
        MirrorCar mirrorCar1 = new MirrorCar(50, "transparent");
        CarFather carFather1 = new CarFather(engine_Car1,
                carChassis1, carTire1, doorCar1, mirrorCar1);

        //invocando el metodo see en cada uno de los objetos anteriores
        carChassis1.getSeeChassis();
        engine_Car1.getSeeEngineCar();
        carTire1.getSeeCarTire();
        doorCar1.getSeeDoor();
        mirrorCar1.getSeeMirrorCar();


        String print = carFather1.toString();
        System.out.println("print = " + print);

    }
}
