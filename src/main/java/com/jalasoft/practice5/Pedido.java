package com.jalasoft.practice5;

import java.util.List;

public class Pedido {
    private final List<Detalle> codPedido;
    private final String tipoPedido;
    private final String cliente;
    private final String fecha;

    public Pedido(final List<Detalle> codPedido, final String tipoPedido, final String cliente, final String fecha) {
        this.codPedido = codPedido;
        this.tipoPedido = tipoPedido;
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public List<Detalle> getCodPedido() {
        return codPedido;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public String getFecha() {
        return fecha;
    }

}
