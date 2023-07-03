package Capitulo_7.ejercicios;

public class ForMejorado {
    public static void main(String[] args) {

        // Inicializar la variable para almacenar la suma
        double suma = 0.0;

        // Utilizar un bucle for mejorado para sumar los valores double
        for (String arg : args) {
            suma += Double.parseDouble(arg);
        }

        // Imprimir el resultado de la suma
        System.out.println("La suma de los valores es: " + suma);

    }
}
