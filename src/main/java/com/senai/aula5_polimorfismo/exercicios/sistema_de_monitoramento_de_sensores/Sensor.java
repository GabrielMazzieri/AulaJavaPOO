package com.senai.aula5_polimorfismo.exercicios.sistema_de_monitoramento_de_sensores;

public class Sensor {
    protected String nome;
    protected double valor;

    public Sensor(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public void exibirDetalhes(){
        System.out.printf("Nome do Sensor: %s | Valor: %,.2f ", nome, valor);
    }
}
