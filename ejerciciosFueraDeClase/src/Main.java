public class Main {


    private static []array array;
    public static void main(String[] args) {

        int []array= new Array[6];
        ordenar_burbuja(array[],4);


    }



    static int ordenar_burbuja(int* array2, int elementos)
    {
        int i;
        int j;
        int aux_elem;
        int movimientos;

        movimientos = 0;

        for (int i = 0; i < elementos - 1; i++)
        {
            for (j = 1; j < elementos; j++)
            {
                if (array[j] < array[j-1])
                {   // si el elemento anterior es mayor, hacemos el cambio
                    aux_elem = array[j];
                    array[j] = array[j-1];
                    array[j-1] = aux_elem;
                    movimientos++;
                }
            }
        }

        return movimientos;
    }
}
