package Capitulo_8.ejercicios;

public class CuentaDeAhorros {
    private static double tasaInteresAnual;
    private double saldoAhorros;

    public CuentaDeAhorros(double saldo) {
        this.saldoAhorros = saldo;
    }

    public void calcularInteresMensual() {
        double interes = (saldoAhorros * tasaInteresAnual) / 12;
        saldoAhorros += interes;
    }

    public static void modificarTasaInteres(double nuevaTasa) {
        tasaInteresAnual = nuevaTasa;
    }

    public double getSaldoAhorros() {
        return saldoAhorros;
    }
}
