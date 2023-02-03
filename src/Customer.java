public class Customer extends Person  {


    private int id;
    private static int idCustomer =1;
    protected Acount Acount;


    public Customer(String name, String lastname, Acount Acount) {
        super(name, lastname);
        this.Acount=Acount;
        this.id = Customer.idCustomer++;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer =" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Acount=" + Acount +
                '}';
    }
}
