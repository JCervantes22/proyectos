package Capitulo_3.paquetes;

public class empleado {

    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    public empleado(String primerNombre, String apellidoPaterno, double salarioMensual) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        if (salarioMensual > 0) {
            this.salarioMensual = salarioMensual;
        }
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0) {
            this.salarioMensual = salarioMensual;
        }
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public double obtenerSalarioAnual() {
        return salarioMensual * 12;
    }

    public void aumentoSalario() {
        salarioMensual = salarioMensual * 1.1;
    }
}
