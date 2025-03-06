package com.senai.aula3_encapsulamento.exercicios.conta_bancaria_operacoes_simples;

public class Main {
    public static void main(String[] args) {
        ContaBancaria titular1 = new ContaBancaria("Gabriel", 1);

    titular1.depositar(100);
    titular1.sacar(101);

    }
}
