package Capitulo_4.ejercicios;

import java.util.*;

public class cuadrado {
    public static void main(String[] args) {
        // Pedir al usuario el tamaño del lado del cuadrado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del lado del cuadrado (entre 1 y 20): ");
        int lado = scanner.nextInt();

        // Validar que el tamaño del lado esté dentro del rango permitido
        if (lado < 1 || lado > 20) {
            System.out.println("El tamaño del lado debe estar entre 1 y 20.");
            return;
        }

        // Imprimir el cuadrado hueco
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                    // Imprimir asterisco en los bordes
                    System.out.print("*");
                } else {
                    // Imprimir espacio en el centro del cuadrado
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
