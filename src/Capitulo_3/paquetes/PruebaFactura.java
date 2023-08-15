package Capitulo_3.paquetes;

public class PruebaFactura {
    public static void main(String[] args) {
        Factura factura = new Factura("12345", "Martillo", 5, 10.99);

        System.out.println("Número de pieza: " + factura.getNumeroPieza());
        System.out.println("Descripción de la pieza: " + factura.getDescripcionPieza());
        System.out.println("Cantidad: " + factura.getCantidad());
        System.out.println("Precio: " + factura.getPrecio());
        System.out.println("Monto de la factura: " + factura.obtenerMontoFactura());

        factura.setCantidad(-2);
        factura.setPrecio(-5.99);

        System.out.println("Cantidad actualizada: " + factura.getCantidad());
        System.out.println("Precio actualizado: " + factura.getPrecio());
    }
}
