package com.senai.aula6_abstracao.exemplos.exemplos_classe_abstrata.veiculo;

public class Carro extends Veiculo {
    public Carro(int velocidade) {
        super(velocidade);
    }

    @Override
    void ligar() {
        System.out.println("Carro ligado!");
    }
}
