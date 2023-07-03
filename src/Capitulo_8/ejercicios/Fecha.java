package Capitulo_8.ejercicios;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    private String numDiaEnAnio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Fecha(String fechaStr, int dia, int anio) {
        String[] partes = fechaStr.split(" ");

        String mesStr = partes[0];
        if (mesStr.equals("Enero")) {
            this.mes = 1;
        } else if (mesStr.equals("Febrero")) {
            this.mes = 2;
        } else if (mesStr.equals("Marzo")) {
            this.mes = 3;
        } // Continuar con el resto de meses...

        this.dia = dia;
        this.anio = anio;
    }

    public Fecha(int diaEnAnio, int anio) {
        // Cálculo del mes y día a partir de díaEnAnio y anio
    }

    public void imprimirFormato1() {
        System.out.println(this.mes + "/" + this.dia + "/" + this.anio);
    }

    public void imprimirFormato2() {
        String nombreMes = ""; // Se obtiene el nombre del mes a partir de this.mes
        System.out.println(nombreMes + " " + this.dia + ", " + this.anio);
    }

    public void imprimirFormato3() {
        // Se obtiene el número de día en el año a partir de this.dia y this.mes
        System.out.println(numDiaEnAnio + " " + this.anio);
    }
}
