import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<String>();

        ingresarAlumnos(alumnos);

        ArrayList<String> curso1 = new ArrayList<String>(alumnos.subList(0, 3));
        ArrayList<String> curso2 = new ArrayList<String>(alumnos.subList(4, 7));
        ArrayList<String> curso3 = new ArrayList<String>(alumnos.subList(8, 11));

        System.out.println("Curso 1: ");
        imprimirAlumnos(curso1);

        System.out.println("Curso 2: ");
        imprimirAlumnos(curso2);

        System.out.println("Curso 3: ");
        imprimirAlumnos(curso3);
    }

    public static void ingresarAlumnos(ArrayList<String> listaAlumnos){
        listaAlumnos.add("Lionel");
        listaAlumnos.add("Emiliano");
        listaAlumnos.add("Gonzalo");
        listaAlumnos.add("Cristian");
        listaAlumnos.add("Nicolas");
        listaAlumnos.add("Marcos");
        listaAlumnos.add("Angel");
        listaAlumnos.add("Rodrigo");
        listaAlumnos.add("Leandro");
        listaAlumnos.add("Giovani");
        listaAlumnos.add("Lionel");
    }

    public static void imprimirAlumnos(ArrayList<String> listaTotal){
        for (String alumno: listaTotal){
            System.out.println(alumno);
        }
    }
}
