package Capitulo_6.ejercicios;

import java.util.*;

public class MCD {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = teclado.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = teclado.nextInt();

        int mcd = calcularMCD(num1, num2);

        System.out.println("El MCD de " + num1 + " y " + num2 + " es: " + mcd);
        teclado.close();
    }

    public static int calcularMCD(int a, int b) {

        if (b == 0) {
            return a;
        } else {
            return calcularMCD(b, a % b);
        }
    }
}
