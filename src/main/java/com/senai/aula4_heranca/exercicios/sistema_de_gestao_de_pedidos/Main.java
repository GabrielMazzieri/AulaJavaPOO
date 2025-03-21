package com.senai.aula4_heranca.exercicios.sistema_de_gestao_de_pedidos;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(1, 1000);
        PedidoOnline pedidoOnline1 = new PedidoOnline(1, 2000, 6);
        PedidoPresencial pedidoPresencial1 = new PedidoPresencial(2, 193, 3);

        pedidoOnline1.exibirDetalhes();
        pedidoPresencial1.exibirDetalhes();
    }
}
