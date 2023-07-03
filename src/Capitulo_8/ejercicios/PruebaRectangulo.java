package Capitulo_8.ejercicios;

import java.util.*;

public class PruebaRectangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Rectangulo rectangulo = new Rectangulo();

        System.out.println("Longitud: " + rectangulo.obtenerLongitud());
        System.out.println("Anchura: " + rectangulo.obtenerAnchura());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
        System.out.println("Área: " + rectangulo.calcularArea());

        System.out.println("Ingrese la longitud: ");
        double L = teclado.nextDouble();
        rectangulo.establecerLongitud(L);
        System.out.println("Ingrese la Anchura: ");
        double A = teclado.nextDouble();
        rectangulo.establecerAnchura(A);

        System.out.println("Longitud: " + rectangulo.obtenerLongitud());
        System.out.println("Anchura: " + rectangulo.obtenerAnchura());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
        System.out.println("Área: " + rectangulo.calcularArea());
        teclado.close();
    }
}
