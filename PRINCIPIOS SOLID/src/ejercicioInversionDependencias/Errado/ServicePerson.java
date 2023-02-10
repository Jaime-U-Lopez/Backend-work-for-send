package ejercicioInversionDependencias.Errado;

public class ServicePerson {

    public void savePerson(Person person){
        MySql mySql=new MySql();
        mySql.savePerson(person);
    }
}
