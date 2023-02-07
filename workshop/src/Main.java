public class Main {
    public static void main(String[] args) {

        Capitan capitan = new Capitan("Pedro", "Gonzales", "454542ko");
        Capitan capitan2 = new Capitan("santiago", "dominguez", "454542ko");
        Veleros veleros = new Veleros(capitan, 254563525, 2022, 45525, 10);
        Veleros veleros2 = new Veleros(capitan, 254563525, 2022, 45525, 5);
        Yates yates = new Yates(capitan2, 45845445, 2020, 4545455, 8);

        String PrintValeroGrande = veleros.calcularMontoAlquiler();
        System.out.println("Valor arriendo Velero = " + PrintValeroGrande);
        String PrintValeroNormal = veleros2.calcularMontoAlquiler();
        System.out.println("PrintValeroNormal = " + PrintValeroNormal);

        String PrintYatesCompra = yates.compraVote();
        System.out.println("Valor compra Yate = " + PrintYatesCompra);
        String PrintYatesarriendo = yates.calcularMontoAlquiler();
        System.out.println("Arriendo Yate = " + PrintYatesarriendo);

    }
}
