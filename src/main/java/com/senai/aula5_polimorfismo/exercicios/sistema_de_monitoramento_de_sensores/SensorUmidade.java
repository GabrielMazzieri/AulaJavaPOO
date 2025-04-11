package com.senai.aula5_polimorfismo.exercicios.sistema_de_monitoramento_de_sensores;

public class SensorUmidade extends Sensor {
    public SensorUmidade(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("Nome do Sensor: %s | Valor de: %,.2f%% ", nome, valor);
    }
}
