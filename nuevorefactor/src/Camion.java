public class Camion  extends Vehiculo {


    public Camion() {
        super();
        this.limiteInferiorVehiculo =75;
        this.limiteInferiorIntermedioVehiculo=76;
        this.limiteSuperiorVehiculo=95;
        this.placa="cami00";
    }

    @Override
    public String toString() {
        return "Camion";
    }
}
