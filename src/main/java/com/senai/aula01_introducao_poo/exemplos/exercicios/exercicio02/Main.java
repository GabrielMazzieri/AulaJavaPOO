package com.senai.aula01_introducao_poo.exemplos.exercicios.exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno1 = new Aluno(
                "Gabriel",
                18,
                7.32f
        );

        Aluno aluno2 = new Aluno(
                "Micael",
                13,
                5.99f
        );

        Aluno aluno3 = new Aluno(
                "Bob",
                10,
                3f
        );

        System.out.println("Digite o valor atualizado da nota: ");
        float notaAtualizada = sc.nextFloat();

        aluno2.atualizaNota(notaAtualizada);
        aluno1.exibirInformacoes();
        aluno2.exibirInformacoes();
        aluno3.exibirInformacoes();
        aluno1.verificaAprovacao();
        aluno2.verificaAprovacao();
        aluno3.verificaAprovacao();
    }
}
