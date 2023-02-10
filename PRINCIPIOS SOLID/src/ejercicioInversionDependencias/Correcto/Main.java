package ejercicioInversionDependencias.Correcto;

public class Main {

    public static void main(String[] args) {

        Person person= new Person("pedro","lopez");
        MySql mySql=new MySql();
        ServicePerson servicePerson = new ServicePerson(mySql);
        servicePerson.savePerson(person);

    }
}
