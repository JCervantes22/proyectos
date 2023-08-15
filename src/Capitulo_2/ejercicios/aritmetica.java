package Capitulo_2.ejercicios;

import java.util.*;

public class aritmetica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int num1 = teclado.nextInt();
        System.out.print("Ingrese un numero entero: ");
        int num2 = teclado.nextInt();
        double cociente = num1 % num2;
        System.out.println("La suma de los numeros es: " + (num1 + num2));
        System.out.println("El producto de los numeros es: " + (num1 * num2));
        System.out.println("La diferencia de los numeros es: " + (num1 - num2));
        System.out.println("El cociente de los numeros es: " + cociente);
        teclado.close();
    }
}
