package EjercicioLiskovCorrect;

public class Adulto extends Persona{

    private int dni;
    private String CardCredit;


    public Adulto(String name, String lastname, int dni, String cardCredit) {
        super(name, lastname);
        this.dni = dni;
        CardCredit = cardCredit;
    }

    public void pagar(){

        System.out.println("Valor a pagar es:  " + dni);
    }

    @Override
    public String toString() {
        return "Adulto{" +
                "dni=" + dni +
                ", CardCredit='" + CardCredit + '\'' +
                '}';
    }
}
