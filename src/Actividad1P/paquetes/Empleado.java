package Actividad1P.paquetes;

public class Empleado {

    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    public Empleado(String primerNombre, String apellidoPaterno, double salarioMensual) {
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

public class PruebaEmpleado {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", "Pérez", 50000);
        Empleado empleado2 = new Empleado("Ana", "López", -10000);

        System.out.printf("%s %s tiene un salario anual de %.2f%n",
                empleado1.getPrimerNombre(), empleado1.getApellidoPaterno(),
                empleado1.obtenerSalarioAnual());
        System.out.printf("%s %s tiene un salario anual de %.2f%n",
                empleado2.getPrimerNombre(), empleado2.getApellidoPaterno(),
                empleado2.obtenerSalarioAnual());

        empleado1.aumentoSalario();
        empleado2.aumentoSalario();

        System.out.printf("%s %s tiene un salario anual de %.2f%n",
                empleado1.getPrimerNombre(), empleado1.getApellidoPaterno(),
                empleado1.obtenerSalarioAnual());
        System.out.printf("%s %s tiene un salario anual de %.2f%n",
                empleado2.getPrimerNombre(), empleado2.getApellidoPaterno(),
                empleado2.obtenerSalarioAnual());
    }
}