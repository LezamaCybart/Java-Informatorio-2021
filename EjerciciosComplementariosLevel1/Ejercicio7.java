import java.util.Scanner;

class Ejercicio7 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese una cadena");
        String string = scanner.nextLine();

        System.out.println(cadenaAMayuscula(string));

        scanner.close();
        
    }

    static String cadenaAMayuscula(String string) { 
        String cadenaMayuscula = "";

        for(int i = 0; i < string.length(); i++) { 
            cadenaMayuscula += caracterAMayuscula(string.charAt(i));
        }
        return cadenaMayuscula;
    }

    static char caracterAMayuscula(char caracter) { 
        int asciiMayuscula = ((int) caracter) - 32;
        return (char) asciiMayuscula;
    }
}
