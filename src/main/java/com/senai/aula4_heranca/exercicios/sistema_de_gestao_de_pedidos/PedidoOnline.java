package com.senai.aula4_heranca.exercicios.sistema_de_gestao_de_pedidos;

public class PedidoOnline extends Pedido{
    private double taxaEntrega;

    public PedidoOnline(int numPedido, double valorTotal, double taxaEntrega) {
        super(numPedido, valorTotal);
        this.taxaEntrega = taxaEntrega;
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = getValorTotal() + taxaEntrega;
    }

    public void exibirDetalhes(){
        System.out.printf("Número Pedido: %d | Valor Total com Entrega: %,.2f", getNumPedido(), taxaEntrega);
    }
}
