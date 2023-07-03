package Capitulo_7.ejercicios;

import java.util.*;

public class ventas {
    public static void main(String[] args) {
        double[][] ventas = new double[5][5];
        Scanner input = new Scanner(System.in);

        int vendedor, producto;
        double valor;

        System.out.println("Ingrese las ventas del mes pasado (0 para salir): ");
        do {
            System.out.print("Vendedor (1-4): ");
            vendedor = input.nextInt();

            if (vendedor != 0) {
                System.out.print("Producto (1-5): ");
                producto = input.nextInt();
                System.out.print("Valor: ");
                valor = input.nextDouble();

                ventas[producto - 1][vendedor - 1] += valor;
            }
        } while (vendedor != 0);

        input.close();

        System.out.println("\nVentas del mes pasado:");

        // Encabezado
        System.out.print(" Vendedor");
        for (int i = 1; i <= 4; i++) {
            System.out.print("\t" + i);
        }
        System.out.println("\tTotal");

        // Filas con productos
        String[] productos = { "Producto 1", "Producto 2", "Producto 3", "Producto 4", "Producto 5" };
        for (int i = 0; i < productos.length; i++) {
            System.out.print(productos[i]);
            for (int j = 0; j < 4; j++) {
                System.out.print("\t" + ventas[i][j]);
                ventas[i][4] += ventas[i][j]; // Cálculo de total por producto
            }
            System.out.println("\t" + ventas[i][4]);
        }

        // Totales por vendedor
        double totalVendedor;
        System.out.print("\tTotal");
        for (int j = 0; j < 4; j++) {
            totalVendedor = 0;
            for (int i = 0; i < 5; i++) {
                totalVendedor += ventas[i][j];
            }
            System.out.print("\t" + totalVendedor);
        }
        System.out.println();
    }
}
