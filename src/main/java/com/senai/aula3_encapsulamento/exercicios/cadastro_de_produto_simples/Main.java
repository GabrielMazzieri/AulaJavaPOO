package com.senai.aula3_encapsulamento.exercicios.cadastro_de_produto_simples;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Gabriel", 0);


        produto1.setPreco(3);
        System.out.println(produto1.getPreco());


    }
}
