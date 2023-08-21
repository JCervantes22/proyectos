package Capitulo_5.ejercicios;

public class TernasPitagoricas {
    public static void main(String[] args) {
        for (int lado1 = 1; lado1 <= 500; lado1++) {
            for (int lado2 = 1; lado2 <= 500; lado2++) {
                for (int hipotenusa = 1; hipotenusa <= 500; hipotenusa++) {
                    if (esTernaPitagorica(lado1, lado2, hipotenusa)) {
                        System.out.printf("Lado1: %d, Lado2: %d, Hipotenusa: %d\n", lado1, lado2, hipotenusa);
                    }
                }
            }
        }
    }

    public static boolean esTernaPitagorica(int lado1, int lado2, int hipotenusa) {
        return (lado1 * lado1) + (lado2 * lado2) == (hipotenusa * hipotenusa);
    }
}
