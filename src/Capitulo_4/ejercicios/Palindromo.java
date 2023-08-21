package Capitulo_4.ejercicios;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número entero de cinco dígitos: ");
            numero = scanner.nextInt();
        } while (String.valueOf(numero).length() != 5);

        String numeroString = String.valueOf(numero);
        StringBuilder numeroInvertido = new StringBuilder(numeroString).reverse();

        if (numeroString.equals(numeroInvertido.toString())) {
            System.out.println("El número " + numero + " es un palíndromo.");
        } else {
            System.out.println("El número " + numero + " no es un palíndromo.");
        }
        scanner.close();
    }
}
