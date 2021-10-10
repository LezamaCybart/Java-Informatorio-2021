import java.util.Scanner;

class Ejercicio2 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        int primerNumero = Integer.valueOf(scanner.nextLine());

        System.out.println("Ingrese otro numero entero: ");
        int segundoNumero = Integer.valueOf(scanner.nextLine());

        scanner.close();

        System.out.println(String.format("%d + %d = %d", primerNumero, segundoNumero,
                                                        sumar(primerNumero, segundoNumero)));

        System.out.println(String.format("%d - %d = %d", primerNumero, segundoNumero,
                                                        restar(primerNumero, segundoNumero)));

        System.out.println(String.format("%d * %d = %d", primerNumero, segundoNumero,
                                                        multiplicar(primerNumero, segundoNumero)));

        System.out.println(String.format("%d / %d = %d", primerNumero, segundoNumero,
                                                        dividir(primerNumero, segundoNumero)));

        System.out.println(String.format("%d %% %d = %d", primerNumero, segundoNumero,
                                                        calcularModulo(primerNumero, segundoNumero)));
    }

    public static int sumar(int primerNumero, int segundoNumero) { 
        return primerNumero + segundoNumero;
    }

    public static int restar(int primerNumero, int segundoNumero) { 
        return primerNumero - segundoNumero;
    }

    public static int multiplicar(int primerNumero, int segundoNumero) { 
        return primerNumero * segundoNumero;
    }

    public static int dividir(int primerNumero, int segundoNumero) { 
        return primerNumero / segundoNumero;
    }

    public static int calcularModulo(int primerNumero, int segundoNumero) { 
        return primerNumero % segundoNumero;
    }
}

