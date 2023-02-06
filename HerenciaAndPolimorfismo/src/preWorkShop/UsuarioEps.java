package preWorkShop;

public class UsuarioEps extends Usuario {


    public UsuarioEps(String nombre, String apellido, long Cedula, String CorreoElectronico) {
        super(nombre, apellido, Cedula, CorreoElectronico);
    }

    @Override
    String ObtenerTipo() {
        return "preWorkShop.Usuario Eps";
    }
}
