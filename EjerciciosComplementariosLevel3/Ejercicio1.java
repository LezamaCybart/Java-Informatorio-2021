import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");

        System.out.println(filtarPalabras(palabras));
    }

    public static List<String> filtarPalabras(List<String> palabras) {
        List<String> palabrasNoNulas = palabras.stream()
            .filter(palabra -> palabra != null && !palabra.isEmpty())
            .collect(Collectors.toList());

        return palabrasNoNulas;
    }
}
