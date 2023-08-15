package Actividad1P.paquetes;

public class PruebaEmpleado {
        public static void main(String[] args) {
                empleado empleado1 = new empleado("Juan", "Pérez", 50000);
                empleado empleado2 = new empleado("Ana", "López", 10000);

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