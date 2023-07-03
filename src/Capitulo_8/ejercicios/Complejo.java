package Capitulo_8.ejercicios;

public class Complejo {
    private double parteReal;
    private double parteImaginaria;

    // Constructor con argumentos
    public Complejo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    // Constructor sin argumentos y con valores predeterminados
    public Complejo() {
        this.parteReal = 0;
        this.parteImaginaria = 0;
    }

    // Sumar dos números complejos
    public Complejo sumar(Complejo c) {
        double parteRealSuma = this.parteReal + c.parteReal;
        double parteImaginariaSuma = this.parteImaginaria + c.parteImaginaria;

        return new Complejo(parteRealSuma, parteImaginariaSuma);
    }

    // Restar dos números complejos
    public Complejo restar(Complejo c) {
        double parteRealResta = this.parteReal - c.parteReal;
        double parteImaginariaResta = this.parteImaginaria - c.parteImaginaria;

        return new Complejo(parteRealResta, parteImaginariaResta);
    }

    // Imprimir el número complejo juan juan
    public void imprimir() {
        System.out.println("( " + parteReal + ", " + parteImaginaria + "i )");
    }
}
