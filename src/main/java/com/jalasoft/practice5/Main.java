package com.jalasoft.practice5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Detalle> ped1 = new ArrayList<>();
        ped1.add(new Detalle("cod1", "cocina",2, 1000, 10, 1990, "ped1"));
        ped1.add(new Detalle("cod2", "lavadora",1, 2500, 0, 2500, "ped1"));
        ped1.add(new Detalle("cod3", "plancha",5, 300, 50, 1450, "ped1"));

        List<Detalle> ped2 = new ArrayList<>();
        ped2.add(new Detalle("cod4", "mesa",2, 700, 30, 1370, "ped2"));
        ped2.add(new Detalle("cod5", "muebles",1, 3500, 0, 3500, "ped2"));
        ped2.add(new Detalle("cod6", "comoda",3, 800, 100, 2300, "ped2"));

        List<Detalle> ped3 = new ArrayList<>();
        ped3.add(new Detalle("cod7", "camisa",10, 100, 100, 900, "ped3"));
        ped3.add(new Detalle("cod8", "poleras",20, 80, 0, 1600, "ped3"));
        ped3.add(new Detalle("cod9", "zapatos",8, 400, 200, 3000, "ped3"));

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(ped1, "normal", "Juan Perez", "2020-05-05"));
        pedidos.add(new Pedido(ped2, "programado", "Maria Guaman", "2020-05-03"));
        pedidos.add(new Pedido(ped3, "normal", "Juan Perez", "2020-05-10"));

        printSeparator("select cliente from pedido");
        pedidos.stream().map(Pedido::getCliente).forEach(System.out::println);

        printSeparator("select cliente from pedido where tipoPedido = \"normal\"");
        pedidos.stream()
                .filter(pedido -> pedido.getTipoPedido().equals("normal"))
                .map(Pedido::getCliente)
                .forEach(System.out::println);

        printSeparator("Select codPedido from Pedido where fecha = \"2020-05-05\"");
        pedidos.stream()
                .filter(pedido -> pedido.getFecha().equals("2020-05-05"))
                .map(Pedido::getCodPedido)
                .forEach(System.out::println);


        printSeparator("Select producto from Detalle, Pedido where Pedido.codPedido = Detalle.codPedido and\n" +
                "Pedido.codPedido = \"ped1\"");
        pedidos.stream()
                .map(Pedido::getCodPedido)
                .flatMap(Collection::stream)
                .filter(pedido -> pedido.getCodPedido().equals("ped1"))
                .map(producto -> String.format("Detalle: %s - Producto: %s", producto.getCodDetalle(), producto.getProducto()))
                .forEach(System.out::println);

        printSeparator("Select detalle.producto from Detalle, detalle where Pedido.codPedido = Detalle.codPedido\n" +
                "and cantidad > 8");
        pedidos.stream()
                .map(Pedido::getCodPedido)
                .flatMap(Collection::stream)
                .filter(producto -> producto.getCantidad() > 8)
                .forEach(System.out::println);
    }

    private static void printSeparator(final String query) {
        System.out.println(String.format("%n%s:", query));
        System.out.println("---------------------------------");
    }
}
