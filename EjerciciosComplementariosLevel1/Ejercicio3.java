import java.util.Scanner;

class Ejercicio3 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int numero = Integer.valueOf(scanner.nextLine());

        imprimirEscalera(numero);
        scanner.close();
    }

    static void imprimirEscalera(int numero) { 
        for (int i = 1; i <= numero; i++) { 
            String escalon = "";
            for(int j = 1; j <= i; j++) { 
                escalon += j;
            }
            System.out.println(escalon);
        }
    }
}
