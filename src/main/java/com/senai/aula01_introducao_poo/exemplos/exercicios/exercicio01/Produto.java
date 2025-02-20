package com.senai.aula01_introducao_poo.exemplos.exercicios.exercicio01;

public class Produto {
    String nomeProduto;
    float precoProduto;
    int qtdProduto;

    public Produto(String nomeProduto, float precoProduto, int qtdProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.qtdProduto = qtdProduto;
    }

    public void exibirDetalhes() {
        System.out.printf("\nNome do produto: %s | Preço: R$%,.2f | Quantidade: %d unidades",
                nomeProduto, precoProduto, qtdProduto);
    }

    public void atualizaEstoque(int atualizarEstoque) {
        if (qtdProduto + atualizarEstoque >= 0) {
            qtdProduto += atualizarEstoque;
            System.out.printf("\nValor atualizado para: %d unidades", qtdProduto);
        } else {
            System.out.println("O valor do estoque não pode ser negativo :/");
        }
    }

    public void calcularValorEstoque() {
        float calculo = this.precoProduto * this.qtdProduto;
        System.out.printf("\n\n\tValor total do estoque: R$%,.2f\n", calculo);
    }
}