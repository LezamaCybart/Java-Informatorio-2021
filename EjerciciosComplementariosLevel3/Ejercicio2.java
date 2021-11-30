import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> enteros = List.of(1, 2, 3, 4, 5);
        System.out.println(generarListaDeCuadrados(enteros));
    }

    public static List<Integer> generarListaDeCuadrados(List<Integer> numeros) {
        List<Integer> listaCuadrados = numeros.stream()
            .map(numero -> numero * numero)
            .collect(Collectors.toList());

        return listaCuadrados;
    }

}
