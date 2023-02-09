public class Vehiculo {


    protected   int limiteInferiorVehiculo;
    protected  int limiteInferiorIntermedioVehiculo;
    protected int limiteSuperiorVehiculo;
    protected String placa;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Vehiculo(int limiteInferiorVehiculo, int limiteInferiorIntermedioVehiculo, int limiteSuperiorVehiculo) {

        this.limiteInferiorVehiculo = limiteInferiorVehiculo;
        this.limiteInferiorIntermedioVehiculo = limiteInferiorIntermedioVehiculo;
        this.limiteSuperiorVehiculo = limiteSuperiorVehiculo;
    }

    public Vehiculo(){

    }

    @Override
    public String toString() {
        return "Vehiculo";
    }

    public int getLimiteInferiorVehiculo() {
        return limiteInferiorVehiculo;
    }

    public void setLimiteInferiorVehiculo(int limiteInferiorVehiculo) {
        this.limiteInferiorVehiculo = limiteInferiorVehiculo;
    }

    public int getLimiteInferiorIntermedioVehiculo() {
        return limiteInferiorIntermedioVehiculo;
    }

    public void setLimiteInferiorIntermedioVehiculo(int limiteInferiorIntermedioVehiculo) {
        this.limiteInferiorIntermedioVehiculo = limiteInferiorIntermedioVehiculo;
    }

    public int getLimiteSuperiorVehiculo() {
        return limiteSuperiorVehiculo;
    }

    public void setLimiteSuperiorVehiculo(int limiteSuperiorVehiculo) {
        this.limiteSuperiorVehiculo = limiteSuperiorVehiculo;
    }


}
