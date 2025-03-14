package com.senai.aula4_heranca.exercicios.controle_de_estoque;

public class Main {
    public static void main(String[] args) {
        Produto alimento1 = new Alimento("Maça", 5, 3, "23/04/2025");

        Produto eletronico1 = new Eletronico("Geladeira", 1200, 1, 220);

        alimento1.exibirDetalhes();
        eletronico1.exibirDetalhes();
    }
}
