package Capitulo_3.paquetes;

public class Factura {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precio;

    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precio) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setPrecio(double precio) {
        if (precio > 0.0) {
            this.precio = precio;
        } else {
            this.precio = 0.0;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public double obtenerMontoFactura() {
        return cantidad * precio;
    }
}
