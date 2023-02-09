public class Carro  extends Vehiculo{


    public Carro() {
        super();
        this.limiteInferiorVehiculo =65;
        this.limiteInferiorIntermedioVehiculo=66;
        this.limiteSuperiorVehiculo=85;
        this.placa="car89";

    }

    @Override
    public String toString() {
        return "Carro";
    }
}
