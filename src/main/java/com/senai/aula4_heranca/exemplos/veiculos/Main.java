package com.senai.aula4_heranca.exemplos.veiculos;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Honda", 2024, 4);
        Moto moto = new Moto("Harley-Davidson", 2022, true);

        System.out.println("Detalhes do Carro: ");
        carro.exibirDetalhes();

        System.out.println("Detalhes da Moto");
        moto.exibirDetalhes();
    }

}
