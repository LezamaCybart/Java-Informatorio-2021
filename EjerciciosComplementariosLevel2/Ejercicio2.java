import java.util.ArrayList;
import java.util.Scanner;

class Ejercicio2 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        inicializarListaNumeros(scanner, numeros);
        imprimirListaNumeros(numeros);
        informarTamañoLista(numeros);

        ingresarNumeroAlPrincipio(scanner, numeros);
        ingresarNumeroAlFinal(scanner, numeros);
        imprimirListaNumeros(numeros);
        informarTamañoLista(numeros);

        scanner.close();

    }

    static void inicializarListaNumeros(Scanner scanner, ArrayList<Integer> listaNumeros) { 
        for (int i = 0; i < 5; i++) { 
            ingresarNumeroAlFinal(scanner, listaNumeros);
        }
    }

    static void ingresarNumeroAlFinal(Scanner scanner, ArrayList<Integer> numeros) { 
        System.out.println("Ingrese un numero entero para insertar en la lista: ");
        Integer numero = Integer.valueOf(scanner.nextLine());

        numeros.add(numero);
    }

    static void ingresarNumeroAlPrincipio(Scanner scanner, ArrayList<Integer> numeros) { 
        System.out.println("Ingrese un numero entero para insertar al principio la lista: ");
        Integer numero = Integer.valueOf(scanner.nextLine());

        numeros.add(0, numero);
    }

    static void imprimirListaNumeros(ArrayList<Integer> lista) { 
        System.out.println("Numeros en la lista : ");
        for (Integer numero: lista) { 
            System.out.println(numero);
        }
    }

    static void informarTamañoLista(ArrayList<Integer> lista) { 
        System.out.println(String.format("Tamaño de la lista: %d", lista.size()));
    }
}

