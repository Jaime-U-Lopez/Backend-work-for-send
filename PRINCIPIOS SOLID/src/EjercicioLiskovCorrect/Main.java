package EjercicioLiskovCorrect;

public class Main {
    public static void main(String[] args) {

        // Este Ejercicio esta con la abstraccion correcta y aplicando el
        //model de lisbov

        Persona adulto = new Adulto("juan ", "lopez",8787,"jkj89");
        Persona niño= new Niño("Pedro", "lopez", (Adulto) adulto);

        ((Adulto) adulto).pagar();
    }
}
