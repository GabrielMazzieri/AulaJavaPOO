package com.senai.aula4_heranca.exemplos.veiculos;

class Carro extends Veiculo {
    int portas;

    public Carro(String marca, int ano, int portas) {
        super(marca, ano);
        this.portas = portas;
    }

    void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Portas: " + portas);
    }
}

