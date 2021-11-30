import java.util.Scanner;

class Ejercicio6 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base: ");
        int base = Integer.valueOf(scanner.nextLine());

        System.out.println("Ingrese el exponente: ");
        int exponente = Integer.valueOf(scanner.nextLine());

        scanner.close();

        System.out.println(String.format("%d elevado a %d = %d", base, exponente, potencia(base, exponente)));
    }

    static int potencia(int base, int exponente) {
        int potencia = 1;
        for(int i = 1; i <= exponente; i++) { 
            potencia *= base;
        }
        return potencia;
    }
}
