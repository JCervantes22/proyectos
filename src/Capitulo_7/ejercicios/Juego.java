package Capitulo_7.ejercicios;

public class Juego {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.mezclar();

        Mano mano1 = new Mano();
        Mano mano2 = new Mano();

        for (int i = 0; i < 5; i++) {
            Carta carta1 = baraja.sacarCarta();
            Carta carta2 = baraja.sacarCarta();
            mano1.agregarCarta(carta1);
            mano2.agregarCarta(carta2);
        }

        System.out.println("Mano 1: ");
        // for (Carta carta : mano1) {
        // System.out.println(carta.getValor() + " de " + carta.getPalo());
        // }

        System.out.println("Mano 2: ");
        // for (Carta carta : mano2) {
        // System.out.println(carta.getValor() + " de " + carta.getPalo());
        // }

        int puntuacion1 = mano1.evaluar();
        int puntuacion2 = mano2.evaluar();

        if (puntuacion1 > puntuacion2) {
            System.out.println("La mano 1 gana con una puntuación de " + puntuacion1);
        } else if (puntuacion2 > puntuacion1) {
            System.out.println("La mano 2 gana con una puntuación de " + puntuacion2);
        } else {
            System.out.println("Empate");
        }
    }

    private static Carta[] iterator(Mano mano1) {
        return null;
    }
}
