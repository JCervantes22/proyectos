package Capitulo_5.ejercicios;

import java.util.Scanner;

public class MenorDeVariosEnteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de valores que desea introducir: ");
        int cantidadValores = scanner.nextInt();

        System.out.print("Ingrese el primer valor: ");
        int menor = scanner.nextInt();

        for (int i = 1; i < cantidadValores; i++) {
            System.out.print("Ingrese el siguiente valor: ");
            int numero = scanner.nextInt();

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("El menor valor ingresado es: " + menor);

        scanner.close();
    }
}
