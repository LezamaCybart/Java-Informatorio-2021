import java.util.ArrayList;
import java.util.Scanner;

class Ejercicio1 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> ciudades = new ArrayList<String>();

        System.out.println("Ingrese sus tres ciudades favoritas: ");
        ciudades.add(scanner.nextLine());
        ciudades.add(scanner.nextLine());
        ciudades.add(scanner.nextLine());

        System.out.println("Ranking de ciudades: ");

        for (int i = 0; i < ciudades.size(); i++ ){ 
            System.out.println(String.format("#%d - %s", (i + 1), ciudades.get(i)));
        }
        scanner.close();
    }
}
