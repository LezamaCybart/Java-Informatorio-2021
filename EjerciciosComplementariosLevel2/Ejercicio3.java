import java.util.ArrayList;
import java.util.Collections;

class Ejercicio3 { 
    public static void main(String[] args) { 
        ArrayList<String> baraja = new ArrayList<String>();

        inicializarBaraja(baraja);
        System.out.println("Baraja ordenada");
        System.out.println(baraja);

        //invertir baraja
        Collections.reverse(baraja);
        System.out.println("Baraja invertida");
        System.out.println(baraja);

        //mezclar baraja
        Collections.shuffle(baraja);
        System.out.println("Baraja mezclada");
        System.out.println(baraja);

    }

    static void inicializarBaraja(ArrayList<String> baraja) { 
        cargarFiguraABaraja(baraja, "pica");
        cargarFiguraABaraja(baraja, "corazones");
        cargarFiguraABaraja(baraja, "rombo");
        cargarFiguraABaraja(baraja, "trebol");
    }

    static void cargarFiguraABaraja(ArrayList<String> baraja, String figura) { 
        for(int i = 0; i < 13; i++) { 
            baraja.add(String.format("%d de %s", (i+1), figura));
        }
    }
}

