package Capitulo_3.paquetes;

public class Fecha {
    private int mes;
    private int dia;
    private int anio;

    public Fecha(int mes, int dia, int anio) {
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void mostrarFecha() {
        System.out.printf("%d/%d/%d", mes, dia, anio);
    }

    public static void main(String[] args) {
        Fecha fecha = new Fecha(12, 24, 2021);
        fecha.mostrarFecha();
    }
}
