package Capitulo_8.ejercicios;

public class PruebaCuentaDeAhorro {
    public static void main(String[] args) {
        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(2000.00);
        CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(3000.00);

        CuentaDeAhorros.modificarTasaInteres(0.04);
        for (int i = 1; i <= 12; i++) {
            ahorrador1.calcularInteresMensual();
            ahorrador2.calcularInteresMensual();
            System.out.println("Mes " + i + ":");
            System.out.println("Ahorrador 1 - Saldo: $" + ahorrador1.getSaldoAhorros());
            System.out.println("Ahorrador 2 - Saldo: $" + ahorrador2.getSaldoAhorros());
        }

        CuentaDeAhorros.modificarTasaInteres(0.05);
        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();
        System.out.println("Mes 13:");
        System.out.println("Ahorrador 1 - Saldo: $" + ahorrador1.getSaldoAhorros());
        System.out.println("Ahorrador 2 - Saldo: $" + ahorrador2.getSaldoAhorros());
    }
}
