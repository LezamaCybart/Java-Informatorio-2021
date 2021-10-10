import java.util.Scanner;

class Ejercicio9 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese cadena de texto");
        String cadena = scanner.nextLine();

        System.out.println("Ingrese la letra que desea contar");
        char caracter = scanner.nextLine().charAt(0);

        scanner.close();
        System.out.println(contarOcurrencia(cadena, caracter));
    }

    static int contarOcurrencia(String cadena, char caracter) { 
        int cantidadDeOcurrencias = 0;

        for (int i = 0; i < cadena.length(); i++) { 
            if (caracter == cadena.charAt(i)) { 
                cantidadDeOcurrencias++;
            }
        }

        return cantidadDeOcurrencias;
    }
}

