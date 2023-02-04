public class Bank {

    Customer Customer;

    public Bank(Customer Customer){
        this.Customer= Customer;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "Customer=" + Customer +
                '}';
    }
}
