package Capitulo_6.ejercicios;

import java.util.*;

public class InvertirNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int num = teclado.nextInt();
        System.out.println("Número invertido: " + invertir(num));

        teclado.close();
    }

    public static int invertir(int num) {
        int invertido = 0;
        while (num != 0) {
            invertido = (invertido * 10) + (num % 10);
            num = num / 10;
        }
        return invertido;
    }
}
