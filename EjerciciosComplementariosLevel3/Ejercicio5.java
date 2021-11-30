import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(
                                 new Alumno("Homero", "Simpson", LocalDate.parse("1985-03-24"))
                                ,new Alumno("Bart", "Simpson", LocalDate.parse("2010-01-15"))
                                ,new Alumno("Lisa", "Simpson", LocalDate.parse("2008-04-01"))
                                ,new Alumno("Marge", "Simpson", LocalDate.parse("1989-04-25")));
        System.out.println(alumnosYEdades(alumnos));
    }

    public static Map<String, Integer> alumnosYEdades(List<Alumno> alumnos) {
        Map<String, Integer> alumnosYEdades = alumnos.stream()
            .collect(Collectors.toMap(Alumno::toString, Alumno::getAge));

        return alumnosYEdades;
    }
}
