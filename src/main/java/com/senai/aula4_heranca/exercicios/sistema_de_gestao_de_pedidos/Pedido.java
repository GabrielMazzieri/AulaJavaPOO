package com.senai.aula4_heranca.exercicios.sistema_de_gestao_de_pedidos;

public class Pedido {
    private int numPedido;
    private double valorTotal;

    public Pedido(int numPedido, double valorTotal) {
        this.numPedido = numPedido;
        this.valorTotal = valorTotal;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void exibirDetalhes(){
        System.out.printf("Número Pedido: %d | Valor Total: %,.2f", numPedido, valorTotal);
    }

}
