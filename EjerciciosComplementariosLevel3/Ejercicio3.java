import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        System.out.println(filtrarPalabrasB(palabras));
    }

    public static List<String> filtrarPalabrasB(List<String> palabras) {
        List<String> palabrasB = palabras.stream()
            .filter(palabra -> palabra.toUpperCase().startsWith("B"))
            .collect(Collectors.toList());
        return palabrasB;
    }
}
