package com.senai.aula3_encapsulamento.exercicios.conta_bancaria_operacoes_simples;

public class Main {
    public static void main(String[] args) {
    ContaBancaria titular1 = new ContaBancaria("Gabriel", 1);
    ContaBancaria titular2 = new ContaBancaria("Rodolfo", 100);

    titular2.transferir(99, titular1);



    }
}
