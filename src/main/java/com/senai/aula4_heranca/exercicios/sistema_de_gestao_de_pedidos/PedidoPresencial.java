package com.senai.aula4_heranca.exercicios.sistema_de_gestao_de_pedidos;

public class PedidoPresencial extends Pedido {
    private double pagamentoAVista;

    public PedidoPresencial(int numPedido, double valorTotal, double pagamentoAVista) {
        super(numPedido, valorTotal);
        this.pagamentoAVista = pagamentoAVista;
    }

    public double getPagamentoAVista() {
        return pagamentoAVista;
    }

    public void setPagamentoAVista(double pagamentoAVista) {
        this.pagamentoAVista = getValorTotal() - pagamentoAVista;
    }

    public void exibirDetalhes(){
        System.out.printf("Número Pedido: %d | Valor Total com Entrega: %,.2f", getNumPedido(), pagamentoAVista);
    }

}
