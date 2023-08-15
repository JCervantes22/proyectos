package Capitulo_2.ejercicios;

import java.util.*;

public class ParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int num = teclado.nextInt();
        if (num == 0) {
            System.out.print("ES PAR");
        } else {
            System.out.print("ES IMPAR");
        }
        teclado.close();
    }
}
