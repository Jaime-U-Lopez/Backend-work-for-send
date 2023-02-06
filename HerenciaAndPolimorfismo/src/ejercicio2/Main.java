package ejercicio2;

public class Main {
    public static void main(String[] args) {

        Ballena ballena= new Ballena( "red","agudo",150.0);
        Gallo gallo = new Gallo("azul", "quiquiriqui",50.0 );
        Rana rana = new Rana( "verde ", "cuack", 1.0 );
        
        String  printRana= rana.comer();
        System.out.println("printRana = " + printRana);
        String printRanaSalta= rana.accionSaltar();
        System.out.println("printRanaSalta = " + printRanaSalta);
        
    }

}
