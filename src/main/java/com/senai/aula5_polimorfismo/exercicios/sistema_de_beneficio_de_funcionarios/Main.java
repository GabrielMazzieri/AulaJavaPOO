package com.senai.aula5_polimorfismo.exercicios.sistema_de_beneficio_de_funcionarios;

public class Main {
    public static void main(String[] args) {
        Beneficio beneficio1 = new AuxilioTransporte("Gabriel", 12000);

        beneficio1.exibirDetalhes();
    }
}
