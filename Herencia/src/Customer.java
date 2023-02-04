public class Customer {

    private int id;
    private static int contadorCustomer=100;

    private String name;
    CardCredit CardCredit;
    public Customer( String name, CardCredit cardCredit){

        this.name=name;
        this.CardCredit= cardCredit;
    }

    public Customer(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", CardCredit=" + CardCredit +
                '}';
    }
}
