package preWorkShop;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        UsuarioEps usuarioEps = new UsuarioEps("alberto", "Lopez dominguez", 145454554l, "jkjkjkjk");
        UsuarioParticular usuarioParticular = new UsuarioParticular("alberto", "Lopez  santo ", 124454545l, "jkjkjkjk");
        UsuarioPoliza usuarioPoliza = new UsuarioPoliza("alberto", "Lopez p ", 12454l, "jkjkjkjk");
        Especialidades especialidades = new Especialidades(" Medicina General", "Fisioterapia");
        Hospital hospital= new Hospital();

        Date date= new Date();
        hospital.agendarCitas(especialidades,usuarioEps,date);


    }

}
