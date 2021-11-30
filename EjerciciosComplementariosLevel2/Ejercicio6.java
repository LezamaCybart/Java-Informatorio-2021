import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Ejercicio6 { 
    public static void main(String[] args) { 
        HashSet<Empleado> empleados = new HashSet<Empleado>();
        Map<Integer, Float>sueldos = new HashMap<Integer, Float>();

        ingresarEmpleados(empleados);
        poblarDiccionarioSueldos(sueldos, empleados);
        imprimirDiccionario(sueldos);
    }

    static void ingresarEmpleados(HashSet<Empleado> empleados) { 
        empleados.add(new Empleado("Fulano", 1234568, 60, 300.00f));
        empleados.add(new Empleado("Mengano", 4440015, 59, 400.00f));
        empleados.add(new Empleado("Fulanito", 1235555, 45, 250.50f));
        empleados.add(new Empleado("Menganito", 1233145, 55, 390.00f));
    }

    static void poblarDiccionarioSueldos(Map<Integer, Float> diccionario, HashSet<Empleado> empleados) { 
        for(Empleado empleado: empleados) { 
            diccionario.put(empleado.getDni(), empleado.getSueldo());
        }
    }

    static void imprimirDiccionario(Map<Integer, Float> diccionario) { 
        for(Integer dni: diccionario.keySet()) { 
            System.out.println(String.format("Dni: %d - Sueldo: %.2f", dni, diccionario.get(dni)));
        }
    }
}
