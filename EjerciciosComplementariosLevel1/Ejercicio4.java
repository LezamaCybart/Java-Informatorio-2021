import java.util.Scanner;

class Ejercicio4 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");

        int numero = Integer.valueOf(scanner.nextLine());

        scanner.close();

        System.out.println(String.format("El factorial de %d es: %d", numero, factorial(numero)));
    }

    static int factorial(int numero) { 
        if(numero <= 1) { 
            return 1;
        } else { 
            return (numero * factorial(numero - 1));
        }
    }
}

