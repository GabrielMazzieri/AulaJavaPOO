package com.senai.aula6_abstracao.exemplos.exemplos_classe_abstrata.veiculo;

public class Moto extends Veiculo{
    public Moto(int velocidade) {
        super(velocidade);
    }

    @Override
    void ligar() {
        System.out.println("Moto Ligada!");
    }
}
