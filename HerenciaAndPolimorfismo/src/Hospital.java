
import java.util.Date;

public class Hospital {

    private int valorBaseApagar;
    private Especialidades Especialidades;
    private Usuario Usuario;

    private Date fechaCita;

    Hospital() {
    }

    ;

    public Hospital(int valorBaseApagar) {
        this.valorBaseApagar = valorBaseApagar;
    }

    public void agendarCitas(Especialidades Especialidades, Usuario Usuario, Date fechaCita) {

        this.Especialidades = Especialidades;
        this.Usuario = Usuario;
        this.fechaCita = fechaCita;

        if (Usuario instanceof UsuarioEps) {
            this.valorBaseApagar = 30000;
        } else if (Usuario instanceof UsuarioPoliza) {
            this.valorBaseApagar = 40000;
        } else if (Usuario instanceof UsuarioParticular) {
            this.valorBaseApagar = 70000;
        } else {
            System.out.println("Error usuario tipo no existe = ");
        }

        System.out.println(" Cita agendada : \n" + " Para el  Usuario = " + Usuario.getNombre() + Usuario.getApellido()
                + " Codigo usuario " + Usuario.getId() + " Cedula " + Usuario.getCedula() + " Con linea medica  :" + Especialidades.getNombre()
                + " Con la Especialidad : " + Especialidades.getTipoEspecialidad() + "\n codigo : " + Especialidades.getCodigo() + " Fecha Programada  " + this.fechaCita + "\n valor a pagar : $" + valorBaseApagar);

    }

    ;

    public int getValorBaseApagar() {
        return valorBaseApagar;
    }

    ;

    public void setValorBaseApagar(int valorBaseApagar) {
        this.valorBaseApagar = valorBaseApagar;
    }

    public Especialidades getEspecialidades() {
        return Especialidades;
    }

    public void setEspecialidades(Especialidades especialidades) {
        Especialidades = especialidades;
    }

    public Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuario usuario) {
        Usuario = usuario;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }
}
