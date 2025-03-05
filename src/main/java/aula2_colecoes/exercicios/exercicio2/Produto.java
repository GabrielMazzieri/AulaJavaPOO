package aula2_colecoes.exercicios.exercicio2;

import java.util.ArrayList;

public class Produto {
    String nomeProduto;
    int qtdEmEstoque;
    ArrayList<Produto> armazenarProduto;

    public Produto(String nomeProduto, int qtdEmEstoque) {
        this.nomeProduto = nomeProduto;
        this.qtdEmEstoque = qtdEmEstoque;
    }

    public String getNomeProduto(){
        return nomeProduto;
    }

    public int getQtdEmEstoque(){
        return qtdEmEstoque;
    }

    public void atualizaEstoque(int atualizarEstoque) {
        if (qtdEmEstoque + atualizarEstoque >= 0) {
            qtdEmEstoque += atualizarEstoque;
            System.out.printf("\nValor atualizado para: %d unidades", qtdEmEstoque);
        } else {
            System.out.println("O valor do estoque não pode ser negativo.");
        }
    }

    @Override
    public String toString() {
        return nomeProduto + " - " + qtdEmEstoque + " unidades";
    }
}
