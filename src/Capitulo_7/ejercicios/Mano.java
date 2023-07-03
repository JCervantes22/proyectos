package Capitulo_7.ejercicios;

import java.util.*;

public class Mano {
    private ArrayList<Carta> cartas;

    public Mano() {
        cartas = new ArrayList<Carta>();
    }

    public void agregarCarta(Carta carta) {
        cartas.add(carta);
    }

    public Carta sacarCarta(int indice) {
        return cartas.remove(indice);
    }

    public int evaluar() {
        // Esta es una forma sencilla de evaluar una mano
        // Puede ser mejorada utilizando otras estrategias
        int puntuacion = 0;
        ArrayList<String> valores = new ArrayList<String>();
        ArrayList<String> palos = new ArrayList<String>();

        for (Carta carta : cartas) {
            valores.add(carta.getValor());
            palos.add(carta.getPalo());
        }

        if (esEscaleraDeColor(valores, palos)) {
            puntuacion = 100;
        } else if (esPoker(valores)) {
            puntuacion = 90;
        } else if (esFull(valores)) {
            puntuacion = 70;
        } else if (esColor(palos)) {
            puntuacion = 60;
        } else if (esEscalera(valores)) {
            puntuacion = 50;
        } else if (esTrio(valores)) {
            puntuacion = 30;
        } else if (esDoblePareja(valores)) {
            puntuacion = 20;
        } else if (esPareja(valores)) {
            puntuacion = 10;
        }

        return puntuacion;
    }

    private boolean esEscaleraDeColor(ArrayList<String> valores, ArrayList<String> palos) {
        ArrayList<Integer> valoresNumericos = convertirValoresNumericos(valores);
        Collections.sort(valoresNumericos);

        boolean esEscalera = true;
        for (int i = 1; i < valoresNumericos.size(); i++) {
            if (valoresNumericos.get(i) != valoresNumericos.get(i - 1) + 1) {
                esEscalera = false;
                break;
            }
        }

        boolean esColor = esColor(palos);

        return esEscalera && esColor;
    }

    private boolean esPoker(ArrayList<String> valores) {
        boolean esPoker = false;

        for (String valor : valores) {
            if (Collections.frequency(valores, valor) == 4) {
                esPoker = true;
                break;
            }
        }

        return esPoker;
    }

    private boolean esFull(ArrayList<String> valores) {
        boolean esFull = false;

        for (String valor : valores) {
            if (Collections.frequency(valores, valor) == 3) {
                for (String otroValor : valores) {
                    if (!otroValor.equals(valor) && Collections.frequency(valores, otroValor) == 2) {
                        esFull = true;
                        break;
                    }
                }
            }

            if (esFull) {
                break;
            }
        }

        return esFull;
    }

    private boolean esColor(ArrayList<String> palos) {
        boolean esColor = false;

        for (String palo : palos) {
            if (Collections.frequency(palos, palo) == 5) {
                esColor = true;
                break;
            }
        }

        return esColor;
    }

    private boolean esEscalera(ArrayList<String> valores) {
        ArrayList<Integer> valoresNumericos = convertirValoresNumericos(valores);
        Collections.sort(valoresNumericos);

        boolean esEscalera = true;
        for (int i = 1; i < valoresNumericos.size(); i++) {
            if (valoresNumericos.get(i) != valoresNumericos.get(i - 1) + 1) {
                esEscalera = false;
                break;
            }
        }

        return esEscalera;
    }

    private boolean esTrio(ArrayList<String> valores) {
        boolean esTrio = false;

        for (String valor : valores) {
            if (Collections.frequency(valores, valor) == 3) {
                esTrio = true;
                break;
            }
        }

        return esTrio;
    }

    private boolean esDoblePareja(ArrayList<String> valores) {
        boolean esDoblePareja = false;
        int contadorPares = 0;

        for (String valor : valores) {
            if (Collections.frequency(valores, valor) == 2) {
                contadorPares++;
            }
        }

        if (contadorPares == 2) {
            esDoblePareja = true;
        }

        return esDoblePareja;
    }

    private boolean esPareja(ArrayList<String> valores) {
        boolean esPareja = false;

        for (String valor : valores) {
            if (Collections.frequency(valores, valor) == 2) {
                esPareja = true;
                break;
            }
        }

        return esPareja;
    }

    private ArrayList<Integer> convertirValoresNumericos(ArrayList<String> valores) {
        ArrayList<Integer> valoresNumericos = new ArrayList<Integer>();

        for (String valor : valores) {
            if (valor.equals("as")) {
                valoresNumericos.add(1);
            } else if (valor.equals("jota")) {
                valoresNumericos.add(11);
            } else if (valor.equals("reina")) {
                valoresNumericos.add(12);
            } else if (valor.equals("rey")) {
                valoresNumericos.add(13);
            } else {
                valoresNumericos.add(Integer.parseInt(valor));
            }
        }

        return valoresNumericos;
    }
}
