package com.senai.aula5_polimorfismo.exercicios.gestao_de_produtos;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new ProdutoFisico("Celular", 1500);
        Produto produto2 = new ProdutoDigital("jogo", 50);
        Produto produto3 = new ProdutoServico("Manutenção Computador", 120);

        produto1.exibirDetalhes();
        System.out.println("");
        produto2.exibirDetalhes();
        System.out.println("");
        produto3.exibirDetalhes();
    }
}
