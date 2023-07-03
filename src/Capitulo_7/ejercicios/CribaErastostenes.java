package Capitulo_7.ejercicios;

public class CribaErastostenes {
    public static void main(String[] args) {
        boolean[] primos = new boolean[1000]; // arreglo de 1000 elementos
        for (int i = 2; i < primos.length; i++) { // inicializar elementos en true
            primos[i] = true;
        }
        for (int p = 2; p * p < primos.length; p++) { // iterar hasta la raíz cuadrada de 1000
            if (primos[p]) { // si el número es primo
                for (int i = p * p; i < primos.length; i += p) { // marcar múltiplos como no primos
                    primos[i] = false;
                }
            }
        }
        // imprimir números primos
        System.out.println("Números primos: ");
        for (int i = 2; i < primos.length; i++) {
            if (primos[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
