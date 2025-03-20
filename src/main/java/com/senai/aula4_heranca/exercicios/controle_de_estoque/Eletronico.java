package com.senai.aula4_heranca.exercicios.controle_de_estoque;

public class Eletronico extends Produto{
    protected int tensao;

    public Eletronico(String nome, double preco, int quantidade, int tensao) {
        super(nome, preco, quantidade);
        this.tensao = tensao;
    }

    public int getTensao() {
        return tensao;
    }

    public void setTensao(int tensao) {
        if(tensao == 110 || tensao == 220){
            this.tensao = tensao;
        } else{
            System.out.println("Tensão incorreta.");
        }
    }

    public void exibirDetalhes(){
        System.out.printf("\nNome do Produto: %s | Preço: %,.2f | Quantidade: %d | Tensão Elétrica: %dV", getNome(), getPreco(), getQuantidade(), tensao);
    }
}


