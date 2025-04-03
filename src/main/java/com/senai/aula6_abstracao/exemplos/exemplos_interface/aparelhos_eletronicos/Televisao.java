package com.senai.aula6_abstracao.exemplos.exemplos_interface.aparelhos_eletronicos;

public class Televisao implements AparelhoEletronico{
    @Override
    public void ligar() {
        System.out.println("Televisão Ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("Televisão Desligada.");
    }
}
