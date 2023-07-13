package Capitulo_9.ejercicio;

public class PruebaEmpleadoPorComision {
    public static void main(String[] args) {
        EmpleadoPorComision empleado = new EmpleadoPorComision("John", "Doe", "123456789", 10000, 0.05);

        System.out.println(empleado.toString());
        System.out.println("Ingresos: $" + empleado.ingresos());
    }
}
