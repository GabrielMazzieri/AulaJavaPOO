package com.senai.aula6_abstracao.exemplos.exemplos_interface.veiculo;

public class Carro implements Veiculo{
    @Override
    public void acelerar() {
        System.out.println("Acelerando");
    }
}
