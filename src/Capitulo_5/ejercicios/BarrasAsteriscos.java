package Capitulo_5.ejercicios;

import java.util.Scanner;

public class BarrasAsteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese un número entre 1 y 30: ");
            int numero = scanner.nextInt();

            if (numero >= 1 && numero <= 30) {
                String asteriscos = "";
                for (int j = 1; j <= numero; j++) {
                    asteriscos += "*";
                }
                System.out.println(asteriscos);
            } else {
                System.out.println("Número inválido. Intente de nuevo.");
                i--;
            }
        }

        scanner.close();
    }
}
