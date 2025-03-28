package com.senai.aula4_heranca.exercicios.sistema_de_bibliotecas;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new LivroFisico("o Senhor dos Anéis", "Tolkien", 500);
        Livro livro2 = new LivroDigital("1984", "George Orwell", 230, 531);

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();

    }
}
