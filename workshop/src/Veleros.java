import java.util.Date;

public class Veleros extends Embarcacion {

private int cantidadMastiles;

    public Veleros(Capitan capitan, long precioBase, long añoFabricacion, long eslora, int cantidadMastiles) {
        super(capitan, precioBase, añoFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }


    @Override
    public String calcularMontoAlquiler() {

        setValorAdicional(20000);

        if(this.getAñoFabricacion()>2020 && this.cantidadMastiles>4){
            long total= this.getPrecioBase()+this.getValorAdicional();

            return  " Este es un velero Grande su valor de arriendo es: "  +total;
        } else if(this.getAñoFabricacion()>2020 && this.cantidadMastiles<4) {
            long total= this.getPrecioBase()+this.getValorAdicional();
            return   " Este es un velero normal su valor de arriendo es: "  +total;
        } else {
            long total= this.getPrecioBase();
                    return " Este es un velero normal sin adicion, precio: "+total;
        }


    }



}
