package Capitulo_7.ejercicios;

import java.util.*;

public class aereolinea {
    public static void main(String[] args) {
        boolean[] tablaAsientos = new boolean[10];

        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("--------Menu--------");
            System.out.println("   1. Primera Clase");
            System.out.println("   2. Clase Economica");

            int opcion = teclado.nextInt();

            int asiento = 0;
            if (opcion == 1) {
                asiento = buscarAsiento(tablaAsientos, 1, 5);
            } else if (opcion == 2) {
                asiento = buscarAsiento(tablaAsientos, 6, 10);
            } else {
                continue;
            }

            if (asiento == -1) {
                System.out.println("Lo siento, no quedan asientos libres en esa sección.");
                System.out.println("¿Aceptar asiento en la otra sección? Escriba Sí o No");
                String respuesta = teclado.next();

                if (respuesta.equalsIgnoreCase("Sí")) {
                    if (opcion == 1) {
                        asiento = buscarAsiento(tablaAsientos, 6, 10);
                    } else if (opcion == 2) {
                        asiento = buscarAsiento(tablaAsientos, 1, 5);
                    }
                    System.out.println("-------------------------\n| AEROLINEA              |\n| No. de asiento: "
                            + asiento + "      |\n| Seccion: " + (opcion == 1 ? "Primera Clase" : "Economica")
                            + " \n-------------------------");
                } else {
                    System.out.println("El proximo vuelo sale en 3 horas.");
                    break;
                }
            } else {
                System.out.println("-------------------------\n| AEROLINEA              |\n| No. de asiento: "
                        + asiento + "      |\n| Seccion: " + (opcion == 1 ? "Primera Clase" : "Economica")
                        + " \n-------------------------");
            }
            if (asiento != -1) {
                tablaAsientos[asiento - 1] = true;
            }
        }
        teclado.close();
    }

    private static int buscarAsiento(boolean[] tablaAsientos, int desde, int hasta) {
        for (int i = desde; i <= hasta; i++) {
            if (!tablaAsientos[i - 1]) {
                return i;
            }
        }
        return -1;
    }
}
