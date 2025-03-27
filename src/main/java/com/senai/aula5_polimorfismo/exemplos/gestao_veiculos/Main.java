package com.senai.aula5_polimorfismo.exemplos.gestao_veiculos;

public class Main {
    public static void main(String[] args) {
        realizarManutencao(new Carro("civic"));
        realizarManutencao(new Moto("Factor"));
        realizarManutencao(new Caminhao("Scania") );
    }
    private static void realizarManutencao(Veiculo veiculo){
        veiculo.realizarManutencao();
    }
}
