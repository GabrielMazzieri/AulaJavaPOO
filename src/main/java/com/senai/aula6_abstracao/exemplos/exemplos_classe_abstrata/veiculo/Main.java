package com.senai.aula6_abstracao.exemplos.exemplos_classe_abstrata.veiculo;

public class Main {
    public static void main(String[] args) {
        testarVeiculos(new Carro(0));
        testarVeiculos(new Moto(0));
    }
    private static void testarVeiculos(Veiculo veiculo){
        veiculo.ligar();
        veiculo.acelerar(15);
        veiculo.acelerar(25);
    }
}
