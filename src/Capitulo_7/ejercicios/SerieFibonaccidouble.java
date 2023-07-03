package Capitulo_7.ejercicios;

import java.util.*;

public class SerieFibonaccidouble {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el valor de n para calcular el n-ésimo número de Fibonacci: ");
        int n = teclado.nextInt();
        double fibonacci = fibonacci(n);
        System.out.println("El n-ésimo número de Fibonacci es: " + fibonacci);
        teclado.close();
    }

    public static double fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
