package Capitulo_9.ejercicio;

public class EmpleadoPorComision extends Empleado {
    private double ventasBrutas;
    private double tasaComision;

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
            double ventasBrutas, double tasaComision) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        this.ventasBrutas = ventasBrutas;
        this.tasaComision = tasaComision;
    }

    public double obtenerVentasBrutas() {
        return ventasBrutas;
    }

    public double obtenerTasaComision() {
        return tasaComision;
    }

    public void establecerVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    public void establecerTasaComision(double tasaComision) {
        this.tasaComision = tasaComision;
    }

    public double ingresos() {
        return obtenerVentasBrutas() * obtenerTasaComision();
    }

    public String toString() {
        return String.format("%s\nVentas brutas: %.2f\nTasa de comisión: %.2f", super.toString(), obtenerVentasBrutas(),
                obtenerTasaComision());
    }
}
