package preWorkShop;

public abstract class Usuario {

    private String nombre;
    private String apellido;
    private long cedula;
    private String correoElectronico;
    private int id;
    private static int contador = 500;


    public Usuario(String nombre, String apellido, long Cedula, String CorreoElectronico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = Cedula;
        this.correoElectronico = CorreoElectronico;
        this.id=Usuario.contador++;
    }

    public int getId() {
        return id;
    }

    abstract String ObtenerTipo();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
