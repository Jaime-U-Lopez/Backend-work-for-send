package ejercicioInversionDependencias.Errado;

public class Main {

    public static void main(String[] args) {

    Person person= new Person("jaime","lopez");
    ServicePerson servicePerson =new ServicePerson( ) ;

    servicePerson.savePerson(person);

    }
}
