package Capitulo_8.ejercicios;

import java.util.*;

public class PruebaComplejo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la parte real del primer numero: ");
        double nr1 = teclado.nextDouble();
        System.out.print("Ingrese la parte imaginaria del primer numero: ");
        double ni1 = teclado.nextDouble();
        System.out.print("Ingrese la parte real del segundo numero: ");
        double nr2 = teclado.nextDouble();
        System.out.print("Ingrese la parte imaginaria del segundo numero: ");
        double ni2 = teclado.nextDouble();
        Complejo complejo1 = new Complejo(nr1, ni1);
        Complejo complejo2 = new Complejo(nr2, ni2);

        Complejo complejoSuma = complejo1.sumar(complejo2);
        Complejo complejoResta = complejo1.restar(complejo2);

        System.out.print("Suma: ");
        complejoSuma.imprimir();
        System.out.print("Resta: ");
        complejoResta.imprimir();
        teclado.close();
    }
}
