package preWorkShop;

public class UsuarioPoliza extends Usuario {


    public UsuarioPoliza(String nombre, String apellido, long Cedula, String CorreoElectronico) {
        super(nombre, apellido, Cedula, CorreoElectronico);
    }

    @Override
    String ObtenerTipo() {
        return null;
    }
}
