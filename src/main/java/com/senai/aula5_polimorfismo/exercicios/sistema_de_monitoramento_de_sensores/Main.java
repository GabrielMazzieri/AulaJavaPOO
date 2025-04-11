package com.senai.aula5_polimorfismo.exercicios.sistema_de_monitoramento_de_sensores;

public class Main {
    public static void main(String[] args) {
        Sensor sensor1 = new SensorTemperatura("Sensor 001", 24.42);
        Sensor sensor2 = new SensorUmidade("Sensor 002", 52.22);

        sensor1.exibirDetalhes();
        System.out.println("");
        sensor2.exibirDetalhes();

    }

}
