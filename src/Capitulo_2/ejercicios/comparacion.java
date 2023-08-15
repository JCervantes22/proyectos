package Capitulo_2.ejercicios;

import java.util.*;

public class comparacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int num1 = teclado.nextInt();
        System.out.print("Ingrese un numero entero: ");
        int num2 = teclado.nextInt();
        if (num1 > num2) {
            System.out.print(num1 + " Es mas grande!!");
        }
        if (num1 < num2) {
            System.out.print(num2 + " Es mas grande!!");
        }
        if (num1 == num2) {
            System.out.print("SON IGUALES!!");
        }
        teclado.close();
    }
}
