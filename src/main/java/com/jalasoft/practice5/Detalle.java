package com.jalasoft.practice5;

public class Detalle {
    private final String codDetalle;
    private final String producto;
    private final int cantidad;
    private final double precio;
    private final double descuento;
    private final double total;
    private final String codPedido;

    public Detalle(String codDetalle, String producto, int cantidad, double precio, double descuento, double total,
                   String codPedido) {
        this.codDetalle = codDetalle;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descuento = descuento;
        this.total = total;
        this.codPedido = codPedido;
    }

    public String getCodDetalle() {
        return codDetalle;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getTotal() {
        return total;
    }

    public String getCodPedido() {
        return codPedido;
    }

    @Override
    public String toString() {
        return "Detalle{" +
                "codDetalle='" + codDetalle + '\'' +
                ", producto='" + producto + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                ", descuento=" + descuento +
                ", total=" + total +
                ", codPedido='" + codPedido + '\'' +
                '}';
    }
}
