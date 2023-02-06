package preWorkShop;

public class Especialidades {

    private String nombre;
    private int Codigo;
    private String tipoEspecialidad;
    private static int contador= 500;

    public Especialidades(String nombre,  String tipoEspecialidad) {
        this.nombre = nombre;
        this.Codigo = ++Especialidades.contador;
        this.tipoEspecialidad = tipoEspecialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getTipoEspecialidad() {
        return tipoEspecialidad;
    }

    public void setTipoEspecialidad(String tipoEspecialidad) {
        this.tipoEspecialidad = tipoEspecialidad;
    }
}
