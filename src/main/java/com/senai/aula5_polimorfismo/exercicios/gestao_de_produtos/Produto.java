package com.senai.aula5_polimorfismo.exercicios.gestao_de_produtos;

public class Produto {
    protected String nomeProduto;
    protected double valorProduto;

    public Produto(String nomeProduto, double valorProduto) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
    }

    public double calcularValor(){
        return valorProduto;
    }

    public void exibirDetalhes(){
        System.out.printf("Nome do Produto: %s | Valor Base: %,.2f | valor Final: %,.2f", nomeProduto, valorProduto, calcularValor());
    }
}
