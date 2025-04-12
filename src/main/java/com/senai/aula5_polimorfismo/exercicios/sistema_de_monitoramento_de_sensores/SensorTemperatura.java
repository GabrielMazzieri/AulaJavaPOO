package com.senai.aula5_polimorfismo.exercicios.sistema_de_monitoramento_de_sensores;

public class SensorTemperatura extends Sensor{
    public SensorTemperatura(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("Nome do Sensor: %s | Valor de Temperatura: %,.2fºC ", nome, valor);
    }
}
