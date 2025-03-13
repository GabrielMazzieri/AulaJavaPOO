package com.senai.aula4_heranca.exemplos.veiculos;

public class Veiculo {
    String marca;
    int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    void exibirDetalhes(){
        System.out.println("Marca: " + marca + ", Ano: " + ano);
    }
}
