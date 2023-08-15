package Capitulo_2.ejercicios;

public class Damero {
    public static void main(String[] args) {
        int x, y, c;

        for (x = 1; x <= 8; x++) {
            for (y = 1; y <= 8; y++) {
                c = (y + x) % 2;
                if (c == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }
}
