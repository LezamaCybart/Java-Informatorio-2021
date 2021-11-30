import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 4, 4, 4);
        System.out.println(factorialSinRepeticion(numeros));
    }

    public static int factorial(int numero) { 
        return (numero <= 1) ? 1 : (numero * factorial(numero - 1));
    }

    public static  List<Integer> factorialSinRepeticion(List<Integer> numeros) {
        List<Integer> factoriales = numeros.stream()
            .distinct()
            .map(numero -> factorial(numero))
            .collect(Collectors.toList());
        return factoriales;
    }
}
