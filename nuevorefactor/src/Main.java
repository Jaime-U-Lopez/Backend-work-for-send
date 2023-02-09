public class Main {
    public static void main(String[] args) {
        // objetos instanciados
        Carro carro = new Carro();
        Mula mula = new Mula();
        Camion camion = new Camion();
        Comparendo comparendo = new Comparendo(carro);
        Comparendo comparendo2 = new Comparendo(camion);
        Comparendo comparendo3 = new Comparendo(mula);

        // print multas
        comparendo.construirFotoMulta(80, carro);
        comparendo2.construirFotoMulta(200, camion);
        comparendo3.construirFotoMulta(40, mula);
        comparendo.construirFotoMulta(40, null);


    }
}
