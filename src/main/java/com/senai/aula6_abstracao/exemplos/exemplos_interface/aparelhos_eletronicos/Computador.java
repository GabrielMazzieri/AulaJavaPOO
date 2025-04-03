package com.senai.aula6_abstracao.exemplos.exemplos_interface.aparelhos_eletronicos;

public class Computador implements AparelhoEletronico {
    @Override
    public void ligar() {
        System.out.println("Computador Ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Computador Desligado.");
    }
}
