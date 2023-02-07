import java.util.Date;

public class Embarcacion implements Funcionalidades {


    private int idEmbarcacion;
    private static int Contador=1;
    private Capitan Capitan;
    private  long precioBase;
    private long añoFabricacion;

    private long valorAdicional;

    private long eslora;


    public Embarcacion(Capitan capitan, long precioBase, long añoFabricacion, long eslora) {
        Capitan = capitan;
        this.precioBase = precioBase;
        this.añoFabricacion = añoFabricacion;
        this.eslora = eslora;
        this.idEmbarcacion= Embarcacion.Contador++;
    }


    @Override
    public String calcularMontoAlquiler() {




       return null;
    }

    public long getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(long precioBase) {
        this.precioBase = precioBase;
    }

    public long getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(long añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public long getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(long valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public long getEslora() {
        return eslora;
    }

    public void setEslora(long eslora) {
        this.eslora = eslora;
    }

    @Override
    public String compraVote() {


        return null;
    }
}
