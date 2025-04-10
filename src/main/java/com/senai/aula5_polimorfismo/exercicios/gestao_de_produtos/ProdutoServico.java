package com.senai.aula5_polimorfismo.exercicios.gestao_de_produtos;

public class ProdutoServico extends Produto {
    public ProdutoServico(String nomeProduto, double valorProduto) {
        super(nomeProduto, valorProduto);
    }

    @Override
    public double calcularValor() {
        return valorProduto*1.08;
    }
}
