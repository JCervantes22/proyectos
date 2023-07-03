package Capitulo_7.ejercicios;

import java.util.*;

public class Baraja {
    private ArrayList<Carta> cartas;

    public Baraja() {
        cartas = new ArrayList<Carta>();
        String[] valores = { "as", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jota", "reina", "rey" };
        String[] palos = { "picas", "corazones", "treboles", "diamantes" };

        for (String valor : valores) {
            for (String palo : palos) {
                Carta carta = new Carta(valor, palo);
                cartas.add(carta);
            }
        }
    }

    public void mezclar() {
        Collections.shuffle(cartas);
    }

    public Carta sacarCarta() {
        return cartas.remove(0);
    }

    public void agregarCarta(Carta carta) {
        cartas.add(carta);
    }
}
