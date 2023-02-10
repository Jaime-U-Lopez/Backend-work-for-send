package ejercicioInversionDependencias.Correcto;

public class ServicePerson {

    private  MySql mySql;
    public ServicePerson( MySql  mySql){

        this.mySql=mySql;
    }

    public void savePerson(Person person){
        mySql.save(person);
    }
}
