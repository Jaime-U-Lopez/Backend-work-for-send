public class Mula  extends Vehiculo{


    public Mula() {
        super();
        this.limiteInferiorVehiculo =95;
        this.limiteInferiorIntermedioVehiculo=96;
        this.limiteSuperiorVehiculo=110;
        this.placa="mula78";
    }


    @Override
    public String toString() {
        return "Mula";
    }
}
