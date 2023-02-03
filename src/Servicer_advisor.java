public class Servicer_advisor extends Person {

    private int idAdvisor;
    private static int contadorAdvisor;
    private int salary;
    private String contract;
    private String Zone_Country;


    public Servicer_advisor(String name, String lastname, int salary, String contract, String Zone_Country) {

        super(name, lastname);
        this.salary = salary;
        this.contract = contract;
        this.Zone_Country = Zone_Country;
        this.idAdvisor = Servicer_advisor.contadorAdvisor++;
    }

    @Override
    public String toString() {
        return "Servicer_advisor{" +
                "idAdvisor=" + idAdvisor +
                ", salary=" + salary +
                ", contract='" + contract + '\'' +
                ", Zone_Country='" + Zone_Country + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
