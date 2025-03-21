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
        this.pagamentoAVista = pagamentoAVista;
    }
    public double valorFinalPresencial(){
        return getValorTotal() - pagamentoAVista;
    }

    public void exibirDetalhes(){
        System.out.printf("\nNúmero Pedido: %d | Valor do Desconto: R$%,.2f | Valor Total com Desconto: R$%,.2f", getNumPedido(), pagamentoAVista, valorFinalPresencial());
    }
}
