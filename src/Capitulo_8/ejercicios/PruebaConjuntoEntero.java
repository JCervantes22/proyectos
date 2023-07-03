package Capitulo_8.ejercicios;

public class PruebaConjuntoEntero {
    public static void main(String[] args) {
        ConjuntoEnteros set1 = new ConjuntoEnteros();
        set1.insertarElemento(3);
        set1.insertarElemento(10);
        set1.insertarElemento(42);
        System.out.println("Set1: " + set1); // salida: Set1: 3 10 42

        ConjuntoEnteros set2 = new ConjuntoEnteros();
        set2.insertarElemento(10);
        set2.insertarElemento(42);
        set2.insertarElemento(99);
        System.out.println("Set2: " + set2); // salida: Set2: 10 42 99

        ConjuntoEnteros setUnion = ConjuntoEnteros.union(set1, set2);
        System.out.println("Unión de set1 y set2: " + setUnion); // salida: Unión de set1 y set2: 3 10 42 99

        ConjuntoEnteros setInterseccion = ConjuntoEnteros.interseccion(set1, set2);
        System.out.println("Intersección de set1 y set2: " + setInterseccion); // salida: Intersección de set1 y set2:
                                                                               // 10 42

        set1.eliminarElemento(10);
        System.out.println("Set1 después de eliminar el elemento 10: " + set1); // salida: Set1 después de eliminar el
                                                                                // elemento 10: 3 42

        System.out.println("¿Set1 es igual a set2? " + set1.esIgualA(set2)); // salida: ¿Set1 es igual a set2? false
    }
}
