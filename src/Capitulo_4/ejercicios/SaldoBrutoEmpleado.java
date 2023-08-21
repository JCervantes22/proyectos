package Capitulo_4.ejercicios;

import java.util.Scanner;

public class SaldoBrutoEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese el nombre del empleado " + i + ":");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese las horas trabajadas por el empleado " + i + ":");
            int horasTrabajadas = scanner.nextInt();

            System.out.println("Ingrese la tarifa por horas del empleado " + i + ":");
            double tarifaPorHora = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer de entrada

            double sueldoBruto = calcularSueldoBruto(horasTrabajadas, tarifaPorHora);
            System.out.println("El sueldo bruto del empleado " + nombre + " es: $" + sueldoBruto);
            System.out.println();
        }

        scanner.close();
    }

    public static double calcularSueldoBruto(int horasTrabajadas, double tarifaPorHora) {
        double sueldoBruto = 0.0;

        if (horasTrabajadas <= 40) {
            sueldoBruto = horasTrabajadas * tarifaPorHora;
        } else {
            int horasNormales = 40;
            int horasExtra = horasTrabajadas - horasNormales;

            double sueldoPorHorasNormales = horasNormales * tarifaPorHora;
            double sueldoPorHorasExtra = horasExtra * (tarifaPorHora * 1.5);

            sueldoBruto = sueldoPorHorasNormales + sueldoPorHorasExtra;
        }

        return sueldoBruto;
    }
}
