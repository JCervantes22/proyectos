package Capitulo_6.ejercicios;

import java.util.*;

public class DistanciaEntrePuntos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese las coordenadas x e y del primer punto separadas por un espacio:");
        double x1 = teclado.nextDouble();
        double y1 = teclado.nextDouble();

        System.out.println("Ingrese las coordenadas x e y del segundo punto separadas por un espacio:");
        double x2 = teclado.nextDouble();
        double y2 = teclado.nextDouble();

        double distancia = calcularDistancia(x1, y1, x2, y2);

        System.out.println("La distancia entre los dos puntos es: " + distancia);

        teclado.close();
    }

    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        return distancia;
    }
}
