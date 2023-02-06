public class UsuarioParticular extends Usuario  {

    public UsuarioParticular(String nombre, String apellido, long Cedula, String CorreoElectronico) {
        super(nombre, apellido, Cedula, CorreoElectronico);
    }

    @Override
    String ObtenerTipo() {
        return "Usuario Particular";
    }
}
