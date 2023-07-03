package Capitulo_7.ejercicios;

import java.util.*;

public class Tirardados {
    public static void main(String[] args) {
        int[] sumas = new int[11];
        Random dado = new Random();
        for (int i = 0; i < 36000000; i++) {
            int dado1 = dado.nextInt(6) + 1;
            int dado2 = dado.nextInt(6) + 1;
            int suma = dado1 + dado2;
            switch (suma) {
                case 2:
                    sumas[0]++;
                    break;
                case 3:
                    sumas[1]++;
                    break;
                case 4:
                    sumas[2]++;
                    break;
                case 5:
                    sumas[3]++;
                    break;
                case 6:
                    sumas[4]++;
                    break;
                case 7:
                    sumas[5]++;
                    break;
                case 8:
                    sumas[6]++;
                    break;
                case 9:
                    sumas[7]++;
                    break;
                case 10:
                    sumas[8]++;
                    break;
                case 11:
                    sumas[9]++;
                    break;
                case 12:
                    sumas[10]++;
                    break;
            }
        }
        System.out.printf("%s\t%s\n", "Suma", "Frecuencia");
        for (int i = 2; i <= 12; i++) {
            System.out.printf("%d\t%d\n", i, sumas[i - 2]);
        }
    }
}
