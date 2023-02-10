package EjercicioLiskovConError;

public class Main {

    public static void main(String[] args) {
        // En este caso el error es que el niño no pueder tener cc ni puede pagar, e
        // el principio de liskok no se cumple ya que
        // todo lo del padre no le aplica a los hijos

        PersonaError juan = new NiñoError(22, "Juan", "dominguez", "ooo5544");
        juan.Pagar();
    }
}
