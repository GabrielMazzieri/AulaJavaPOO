package com.senai.aula5_polimorfismo.exercicios.gestao_de_produtos;

public class ProdutoDigital extends Produto{
    public ProdutoDigital(String nomeProduto, double valorProduto) {
        super(nomeProduto, valorProduto);
    }

    @Override
    public double calcularValor() {
        return valorProduto*1.05;
    }
}
