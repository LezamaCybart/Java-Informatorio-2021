import java.util.Scanner;

class Ejercicio5 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer factor: ");
        int primerFactor = Integer.valueOf(scanner.nextLine());

        System.out.println("Ingrese el segundo factor: ");
        int segundoFactor = Integer.valueOf(scanner.nextLine());

        scanner.close();

        System.out.println(String.format("%d x %d = %d", primerFactor, segundoFactor, multiplicar(primerFactor, segundoFactor)));
    }

    static int multiplicar(int primerFactor, int segundoFactor) {
        int producto = 0;
        for(int i = 0; i < segundoFactor; i++) { 
            producto += primerFactor;
        }
        return producto;
    }
}
