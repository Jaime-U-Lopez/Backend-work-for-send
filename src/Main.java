public class Main {
    public static void main(String[] args) {




        Acount acount1=new Acount( 100000.0);
        Customer customer= new Customer("juan Alberto", "lopez",acount1);
        Servicer_advisor  servicer_advisor1= new Servicer_advisor("michelle","domingo",37676656,"permanent", "north");

        Bank bank=  new Bank(customer,servicer_advisor1);


        //print

        String printBank= bank.toString();
        System.out.println("printBank = \n" + printBank +"\n");

        String printAdvisor=servicer_advisor1.toString();
        System.out.println("printAdvisor =\n " + printAdvisor  +"\n");
        String printCustomer =customer.toString();
        System.out.println("printCustomer = \n" + printCustomer +"\n");

        acount1.setIngreso(50000.0);
        acount1.setRetiro(5500000.0);


        //saldo de la cuenta
        double c= acount1.getSaldoDeCuenta();
        System.out.println("balance of acount currently : $"+ c);

            }


}
