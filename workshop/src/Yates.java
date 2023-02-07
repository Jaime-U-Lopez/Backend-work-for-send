import java.util.Date;

public class Yates extends Embarcacion{

    private  int cantidadCamarotes;

    public Yates(Capitan capitan, long precioBase, long añoFabricacion, long eslora, int cantidadCamarotes) {
        super(capitan, precioBase, añoFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }


    @Override
    public String compraVote() {

        if(this.cantidadCamarotes>7){

           return "Este es un llate lujoso, deseas comprarlo ";

        }else{

            return "Este yate no es tan lujoso, deseas comprarlo? ";
        }

    }



    @Override
    public String calcularMontoAlquiler() {

        setValorAdicional(20000);

        if(this.getAñoFabricacion()>2020 && this.cantidadCamarotes>4){
            long total= this.getPrecioBase()+this.getValorAdicional();

            return  " Este es un yate lujoso su valor de arriendo es: "  +total;
        } else if(this.getAñoFabricacion()>2020 && this.cantidadCamarotes<4) {
            long total= this.getPrecioBase()+this.getValorAdicional();
            return   " Este es un velero normal su valor de arriendo es: "  +total;
        } else {
            long total= this.getPrecioBase();
            return " Este es un Yate  normal sin adición, precio: "+total;
        }


    }




}
