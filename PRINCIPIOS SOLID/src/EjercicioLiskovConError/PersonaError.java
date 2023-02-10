package EjercicioLiskovConError;

public class PersonaError {
    private  int dni;
    private String nommbre;
    private String apellidos;
    private String tarjeta;


    public PersonaError(int dni, String nommbre, String apellidos, String tarjeta) {
        this.dni = dni;
        this.nommbre = nommbre;
        this.apellidos = apellidos;
        this.tarjeta = tarjeta;
    }


    public void Pagar(){

        System.out.println("el valor  a pagar es  = " );

    }
}
