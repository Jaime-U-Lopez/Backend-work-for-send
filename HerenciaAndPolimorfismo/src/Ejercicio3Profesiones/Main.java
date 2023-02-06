package Ejercicio3Profesiones;

public class Main {
    public static void main(String[] args) {


        Arquitecto arquitecto =new Arquitecto("pedro", 2000000);
        Ingeniero ingeniero= new Ingeniero("domingo", 5000000 );
        Medico medico = new Medico("santiago", 3000000);

        long printIngeniero= ingeniero.calcularSueldo();
        System.out.println("\nEl salario del Ingeniero es : = $ " + printIngeniero);
        long printArquitecto= arquitecto.calcularSueldo();
        System.out.println("\nEl salario del arquitecto es : = $ " + printArquitecto);

        long printMedico= medico.calcularSueldo();
        System.out.println("El salario del medico es :  = $ " + printMedico);

    }
    
}
