import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // date today;

        int day= 6000;
        Date date = new Date(day);
        // Card object  data:
        CardBlack cardBlack = new CardBlack("bancolombia", 499009099, 45454,  date);
        // Customer  object  data :
        Customer customer = new Customer("javier Alberto", cardBlack);

        // bank object data:s

        Bank bank = new Bank(customer);

        // print information
       String print=  bank.toString();
        System.out.println("Information bank  = " + print +"\n");

        cardBlack.print();

    }
}
