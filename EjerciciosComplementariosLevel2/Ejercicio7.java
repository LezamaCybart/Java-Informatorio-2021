import java.util.ArrayList;

class Ejercicio7 { 
    public static void main(String[] args) { 
        System.out.println("Llamando a fizzBuzzFuncion(1,6)");
        System.out.println(fizzBuzzFuncion(1,6));
        System.out.println("Llamando a fizzBuzzFuncion(1,8)");
        System.out.println(fizzBuzzFuncion(1,8));
    }

    static ArrayList<String> fizzBuzzFuncion(Integer principio, Integer fin) { 
        ArrayList<String> fizzbuzzArray = new ArrayList<String>();

        for (int i = principio; i < fin; i++) { 
            String valor = "";

            if(i % 2 == 0) { 
                valor += "Fizz";
            }

            if(i % 3 == 0) { 
                valor += "Buzz";
            }

            if(valor == "") { 
                valor = String.valueOf(i);
            }

            fizzbuzzArray.add(valor);
        }

        return fizzbuzzArray;
    }
}

