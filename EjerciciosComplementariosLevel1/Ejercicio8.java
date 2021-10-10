import java.util.Scanner;

class Ejercicio8 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre: ");
        String nombreYApellido = scanner.nextLine();

        System.out.println("Ingrese edad: ");
        Integer edad = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese direccion: ");
        String direccion = scanner.nextLine();

        System.out.println("Ingrese ciudad: ");
        String ciudad = scanner.nextLine();

        Persona persona = new Persona(nombreYApellido, edad, direccion, ciudad);

        System.out.println(persona);

        scanner.close();
    }
}
