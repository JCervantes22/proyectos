package Capitulo_9.ejercicio;

public class PruebaEmpleadoBaseMasComision {
    public static void main(String[] args) {
        EmpleadoBaseMasComision empleado = new EmpleadoBaseMasComision("Jane", "Smith", "987654321", 5000, 0.07, 2000);

        System.out.println(empleado.toString());
        System.out.println("Ingresos: $" + empleado.ingresos());
    }
}
