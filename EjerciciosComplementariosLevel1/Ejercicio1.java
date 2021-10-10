import java.util.Scanner;

class Ejercicio1 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();

        scanner.close();
        System.out.println(String.format("HOLA %s!!!", nombreUsuario));
    }
}
