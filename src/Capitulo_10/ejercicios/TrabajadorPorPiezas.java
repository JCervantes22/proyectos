package Capitulo_10.ejercicios;

public class TrabajadorPorPiezas extends Empleado {
    private double sueldo;
    private int piezas;

    public TrabajadorPorPiezas(String nombre, String apellidoPaterno, String numeroSeguroSocial, double sueldo,
            int piezas) {
        super(nombre, apellidoPaterno, numeroSeguroSocial);
        this.sueldo = sueldo;
        this.piezas = piezas;
    }

    public void establecerSueldo(double sueldo) {
        if (sueldo < 0.0)
            throw new IllegalArgumentException(
                    "El sueldo debe ser >= 0.0");
        this.sueldo = sueldo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerPiezas(int piezas) {
        if ((piezas > 0.0))
            throw new IllegalArgumentException(
                    "Las piezas deben ser > 0.0 ");
        this.piezas = piezas;
    }

    // devuelve las horas trabajadas
    public double obtenerPiezas() {
        return piezas;
    }

    public double ingresos() {
        return sueldo * piezas;
    }

    @Override
    public String toString() {
        return String.format("Empleado por Pieza: %s%n%s: $%, .2f; %s: %, .2f",
                super.toString(), " Sueldo por pieza: ", obtenerSueldo(), ", Piezas producidas: ", obtenerPiezas());
    }
}
