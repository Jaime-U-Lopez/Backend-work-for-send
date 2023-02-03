public class Bank {
    private Customer Customer;
    private  Servicer_advisor Servicer_advisor;

    public Bank (Customer Customer, Servicer_advisor Servicer_advisor ){
        this.Customer= Customer;
        this.Servicer_advisor= Servicer_advisor;

    }

    @Override
    public String toString() {
        return "Bank{" +
                "Customer=" + Customer +
                ", Servicer_advisor=" + Servicer_advisor +
                '}';
    }
}
