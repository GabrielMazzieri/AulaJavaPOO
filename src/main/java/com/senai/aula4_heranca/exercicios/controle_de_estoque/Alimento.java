package com.senai.aula4_heranca.exercicios.controle_de_estoque;

import java.util.Date;

public class Alimento extends Produto {
    private String data;

    public Alimento(String nome, double preco, int quantidade, String data) {
        super(nome, preco, quantidade);
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void exibirDetalhes(){
        System.out.printf("\nNome do Produto: %s | Preço: %,.2f | Quantidade: %d | Data de Validade: %S", getNome(), getPreco(), getQuantidade(), data);
    }
}
