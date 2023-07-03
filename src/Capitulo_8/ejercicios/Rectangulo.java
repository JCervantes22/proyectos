package Capitulo_8.ejercicios;

public class Rectangulo {
    private double longitud = 1.0;
    private double anchura = 1.0;

    public double obtenerLongitud() {
        return longitud;
    }

    public double establecerLongitud(double longitud) {
        if (longitud > 0.0 && longitud < 20.0) {
            this.longitud = longitud;
        }
        return longitud;
    }

    public double obtenerAnchura() {
        return anchura;
    }

    public void establecerAnchura(double anchura) {
        if (anchura > 0.0 && anchura < 20.0) {
            this.anchura = anchura;
        }
    }

    public double calcularPerimetro() {
        return 2 * (longitud + anchura);
    }

    public double calcularArea() {
        return longitud * anchura;
    }
}
