package com.senai.aula5_polimorfismo.exercicios.sistema_de_relatorios;

public class Main {
    public static void main(String[] args) {
        gerarRelatorio(new PDF());
        gerarRelatorio(new JSON());
        gerarRelatorio(new CSV());
    }

    public static void gerarRelatorio(Relatorio relatorio){
        relatorio.gerar();
    }
}
