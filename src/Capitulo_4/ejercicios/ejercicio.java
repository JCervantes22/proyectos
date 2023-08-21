package Capitulo_4.ejercicios;

import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        // Leer los tres valores del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer lado del triángulo:");
        double lado1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo lado del triángulo:");
        double lado2 = scanner.nextDouble();
        System.out.println("Ingrese el tercer lado del triángulo:");
        double lado3 = scanner.nextDouble();

        // Verificar si los valores pueden representar los lados de un triángulo
        boolean esTriangulo = (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);

        // Imprimir el resultado
        if (esTriangulo) {
            System.out.println("Los valores ingresados pueden representar los lados de un triángulo.");
        } else {
            System.out.println("Los valores ingresados no pueden representar los lados de un triángulo.");
        }
        scanner.close();
    }
}
