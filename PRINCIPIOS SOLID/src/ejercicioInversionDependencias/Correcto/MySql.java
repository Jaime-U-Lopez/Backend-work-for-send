package ejercicioInversionDependencias.Correcto;

public class MySql implements IPersistence {

    @Override
    public void save(Object object) {
        System.out.println(" Save ok... " );

    }
}
