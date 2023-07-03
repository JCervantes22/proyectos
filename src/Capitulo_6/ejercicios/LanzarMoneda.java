package Capitulo_6.ejercicios;

import java.util.*;

public class LanzarMoneda {
    enum Moneda {
        CARA, CRUZ;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cara = 0, cruz = 0;

        while (true) {
            System.out.println("1. Lanzar moneda");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = teclado.nextInt();

            if (opcion == 1) {
                Moneda lado = tirar();
                if (lado == Moneda.CARA) {
                    cara++;
                    System.out.println("Cara");
                } else {
                    cruz++;
                    System.out.println("Cruz");
                }
            } else {
                break;
            }
        }

        System.out.println("Cara: " + cara);
        System.out.println("Cruz: " + cruz);
        teclado.close();
    }

    public static Moneda tirar() {
        double aleatorio = Math.random();
        if (aleatorio < 0.5) {
            return Moneda.CARA;
        } else {
            return Moneda.CRUZ;
        }
    }
}
