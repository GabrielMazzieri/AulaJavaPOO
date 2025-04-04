package com.senai.aula6_abstracao.exemplos.exemplos_interface.veiculo;

public interface Veiculo {
    void acelerar();

    default void buzinar(){
        System.out.println("Bi");
    }
}
