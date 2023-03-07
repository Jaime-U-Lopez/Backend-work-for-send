import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static int maxDiferencia(int[] a) {

        // validamos que el array ingresado este en orden descen, que no este nulo y que este mayor o igual a dos
        boolean listaDescendete = true;
        for (int t = 0; t < a.length - 1; t++) {

            if (a[t] < a[t + 1]) {
                listaDescendete = false;
                break;
            }
        }
        if (a.equals(null) || a.length < 2 || listaDescendete == false) {

            System.out.println("El array puede estar vacio, sin orden o menor a dos numeros ");
            return -1;

        }

        // creamos la variable inicial, la cual es opcional
        // ya que la pudimos inicializar como varible local

        int diferenciaMaxima = -1;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length; j++) {
                int resultado = a[i] - a[j];
                if (resultado > diferenciaMaxima) {
                    diferenciaMaxima = resultado;
                }
            }
        }
// me retorna el numero
        System.out.println("la diferenciaMaxima  = " + diferenciaMaxima);
        return diferenciaMaxima;
    }


    public static void controlAcceso(String nombre, String clave) {
        HashMap<String, String> listUser = new HashMap<>();
        listUser.put("1234", "juan manule acosta");
        listUser.put("5555", "pedro domingo");
        listUser.put("54123", "diego echavarria");
        listUser.put("654123", "monseñor augusto");
        int intentos = 4;
        while (intentos > 0) {

            if (listUser.containsKey(clave)) {
                System.out.println("Accedo concedido  al usuario  " + nombre);
                break;

            } else {
                intentos--;
                System.out.println(" Intento fallido. Quedan " + intentos + " intentos.");
            }
            if (intentos == 0) {

                System.out.println("Acceso denegado para el usuario " + nombre);
            }

            Scanner scan = new Scanner(System.in);
            String passwork = scan.nextLine();
            String nameUser = scan.nextLine();
        }


    }


    public static void compararSumaConX(List<Integer> listEnter, int numberCompare) {


        int numberComparetion = numberCompare;
        int contadorSumas = 0;

        for (int i = 0; i < listEnter.size() - 1; i++) {

            for (int j = 1; j < listEnter.size(); j++) {
                int result = listEnter.get(i) + listEnter.get(j);
                if (result == numberComparetion) {
                    ++contadorSumas;
                }
            }
        }

        if (contadorSumas > 0) {
            System.out.println("El número ingresado tiene " + contadorSumas + " sumas que dan el mismo número de :" + numberCompare);

        } else {
            System.out.println("El numero no tiene sumas en la lista  ");
        }


    }

    public static void main(String[] args) {


        int[] array = {15, 16, 8, 6, 1};
        maxDiferencia(array);

        Scanner scan = new Scanner(System.in);
        String passwork = scan.nextLine();
        String nameUser = scan.nextLine();
        controlAcceso(nameUser, passwork);

        List<Integer> listNumber = new ArrayList<>();

        listNumber.add(45);
        listNumber.add(2);
        listNumber.add(6);
        listNumber.add(4);
        listNumber.add(8);
        listNumber.add(9);

        System.out.println("Ingresa el numero a validar en la lista  de sumas ");
        int numero = scan.nextInt();
        compararSumaConX(listNumber, numero);
    }


};


