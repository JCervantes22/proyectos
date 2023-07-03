package Capitulo_8.ejercicios;

public class ConjuntoEnteros {
    private boolean[] conjunto;

    public ConjuntoEnteros() {
        conjunto = new boolean[101]; // arreglo de valores boolean de tamaño 101
    }

    public static ConjuntoEnteros union(ConjuntoEnteros set1, ConjuntoEnteros set2) {
        ConjuntoEnteros setUnion = new ConjuntoEnteros(); // nuevo ConjuntoEnteros para la unión teórica
        for (int i = 0; i < set1.conjunto.length; i++) {
            if (set1.conjunto[i] || set2.conjunto[i]) { // si el elemento está en al menos uno de los conjuntos
                setUnion.conjunto[i] = true; // establecer true en el nuevo ConjuntoEnteros
            }
        }
        return setUnion;
    }

    public static ConjuntoEnteros interseccion(ConjuntoEnteros set1, ConjuntoEnteros set2) {
        ConjuntoEnteros setInterseccion = new ConjuntoEnteros(); // nuevo ConjuntoEnteros para la intersección teórica
        for (int i = 0; i < set1.conjunto.length; i++) {
            if (set1.conjunto[i] && set2.conjunto[i]) { // si el elemento está en ambos conjuntos
                setInterseccion.conjunto[i] = true; // establecer true en el nuevo ConjuntoEnteros
            }
        }
        return setInterseccion;
    }

    public void insertarElemento(int k) {
        if (k >= 0 && k <= 100) { // verificar que k esté en el rango correcto
            conjunto[k] = true; // establecer true en el índice k
        }
    }

    public void eliminarElemento(int m) {
        if (m >= 0 && m <= 100) { // verificar que m esté en el rango correcto
            conjunto[m] = false; // establecer false en el índice m
        }
    }

    public String toString() {
        StringBuilder conjuntoString = new StringBuilder();
        boolean conjuntoVacio = true;
        for (int i = 0; i < conjunto.length; i++) {
            if (conjunto[i]) { // si el elemento está en el conjunto
                conjuntoVacio = false;
                conjuntoString.append(i + " ");
            }
        }
        if (conjuntoVacio) { // si el conjunto está vacío
            conjuntoString.append("---");
        }
        return conjuntoString.toString();
    }

    public boolean esIgualA(ConjuntoEnteros otherSet) {
        for (int i = 0; i < conjunto.length; i++) {
            if (conjunto[i] != otherSet.conjunto[i]) { // si hay algún elemento diferente entre los dos conjuntos
                return false;
            }
        }
        return true;
    }
}
