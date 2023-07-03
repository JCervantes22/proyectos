package Capitulo_6.ejercicios;

import java.util.*;

public class AdivinarNumero {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAdivinar = random.nextInt(1000) + 1;
        boolean adivinado = false;
        Scanner teclado = new Scanner(System.in);

        while (!adivinado) {
            System.out.print("Adivina un número entre 1 y 1000: ");
            int intento = teclado.nextInt();

            if (intento < numeroAdivinar) {
                System.out.println("Demasiado bajo. Intente de nuevo.");
            } else if (intento > numeroAdivinar) {
                System.out.println("Demasiado alto. Intente de nuevo.");
            } else {
                System.out.println("¡Felicidades! Adivinó el número.");
                adivinado = true;
            }
        }

        System.out.print("¿Desea jugar otra vez? (s/n) ");
        String respuesta = teclado.next();

        if (respuesta.equalsIgnoreCase("s")) {
            main(null);
        } else {
            System.out.println("¡Gracias por jugar!");
        }

        teclado.close();
    }
}
