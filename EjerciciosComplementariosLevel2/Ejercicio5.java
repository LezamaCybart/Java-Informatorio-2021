import java.util.ArrayList;
import java.util.Scanner;

class Ejercicio5 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> horasTrabajadas = new ArrayList<Integer>();
        //Utilizo el tipo float para los valores para contemplar valores que no sean enteros.
        ArrayList<Float> valorPorHora = new ArrayList<Float>();

        inicializarArraysSemanales(scanner, horasTrabajadas, valorPorHora);
        ArrayList<Float> totales = generarArrayTotales(horasTrabajadas, valorPorHora);

        //Imprimir array totales
        System.out.println(totales);

        //Informar total a pagar
        System.out.println(String.format("Total Final: $%.2f", obtenerTotal(totales)));
        scanner.close();
    }

    static void inicializarArraysSemanales(Scanner scanner, ArrayList<Integer> horasTrabajadas, ArrayList<Float> valorPorHora) { 

        //Ambos arreglos se generan en simultaneo
        for (int i = 0; i < 5; i++) { //5 corresponde a la cantidad de dias laborales Lun-Vie
            System.out.println("Ingrese horas trabajdas en el día " + (i + 1));
            horasTrabajadas.add(Integer.valueOf(scanner.nextLine()));
            System.out.println("Ingrese el valor por hora del dia" + (i + 1));
            valorPorHora.add(Float.valueOf(scanner.nextLine()));
        }
    }

    static ArrayList<Float> generarArrayTotales(ArrayList<Integer> horasTrabajadas, ArrayList<Float> valorPorHora) {
        ArrayList<Float> arrayTotales = new ArrayList<Float>();

        for (int i = 0; i < 5; i++) { 
            arrayTotales.add(horasTrabajadas.get(i) * valorPorHora.get(i));
        }
        return arrayTotales;
    }

    static Float obtenerTotal(ArrayList<Float> arrayTotales) { 
        Float total = 0.0f;

        for (Float valor: arrayTotales) { 
            total += valor;
        }
        return total;
    }
}
