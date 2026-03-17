package modelo;

import java.util.ArrayList;

public class TiendaApp {

    public static void main(String[] args) {

        final double porcentajeDescuento = 0.15;
        final double limiteDescuento = 500;

        ArrayList pedidos = new ArrayList();

        pedidos.add("Juan,Portatil,900");
        pedidos.add("Juan,Raton,20");
        pedidos.add("Juan,Teclado,50");

        double total = 0;

        for (int i = 0; i < pedidos.size(); i++) {

            String linea = (String) pedidos.get(i);
            String[] datosCompra = linea.split(",");

            String nombreCliente = datosCompra[0];
            String producto = datosCompra[1];
            double precioProducto = Double.parseDouble(datosCompra[2]);

            totalCompra = totalCompra + precioProducto;

            System.out.println("Cliente: " + nombreCliente);
            System.out.println("Producto: " + producto);
            System.out.println("Precio: " + precioProducto);
            System.out.println("-------------------");
        }

        if (totalCompra > limiteDescuento) {
            totalCompra = totalCompra - (totalCompra * porcentajeDescuento);
        }

        System.out.println("TOTAL FINAL: " + totalCompra);
    }
}