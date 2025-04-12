package com.senai.aula6_abstracao.exercicios.controle_de_entrega;

public class Main {
    public static void main(String[] args) {
        VeiculoDaEntrega bicicleta = new Bicicleta(14, 5, 5);
        VeiculoDaEntrega moto = new Moto(30, 12, 15);

        bicicleta.exibirDetalhes();
        System.out.println("");
        moto.exibirDetalhes();
    }
}