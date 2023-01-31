public class Main {
    public static void main(String[] args) {

        Cuenta cuenta1=new Cuenta("Jaime Alberto", 87878.0);


        cuenta1.setIngreso(50000.0);
        cuenta1.setRetiro(55000.0);
        cuenta1.getDatoscuenta();

        //saldo de la cuenta
        double c= cuenta1.getSaldoDeCuenta();
        System.out.println(" balance of acount currently : $"+ c);


    }


}
