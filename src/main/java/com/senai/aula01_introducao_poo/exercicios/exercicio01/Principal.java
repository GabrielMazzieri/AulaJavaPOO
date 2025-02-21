package com.senai.aula01_introducao_poo.exercicios.exercicio01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto produto1 = new Produto(
                "Caixa de suco",
                7.00f,
                5
                );
        Produto produto2 = new Produto(
                "Pacote de Doritos",
                9.00f,
                3
        );

        System.out.println("Coloque um valor para atualizar estoque (adicione '-' para diminuir, ex: -5: ");
        int valorMudanca = sc.nextInt();

        produto1.atualizaEstoque(valorMudanca);
        produto1.exibirDetalhes();
        produto1.calcularValorEstoque();
        produto2.exibirDetalhes();
        produto2.calcularValorEstoque();
    }
}
