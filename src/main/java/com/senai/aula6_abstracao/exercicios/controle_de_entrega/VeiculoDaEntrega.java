package com.senai.aula6_abstracao.exercicios.controle_de_entrega;

public abstract class VeiculoDaEntrega {
    protected double velocidade;
    protected double capacidade;
    protected double distanciaDaEntrega;

    public VeiculoDaEntrega(double velocidade, double capacidade, double distanciaDaEntrega) {
        this.velocidade = velocidade;
        this.capacidade = capacidade;
        this.distanciaDaEntrega = distanciaDaEntrega;
    }

    public void acelerar(double incremento){
        velocidade += incremento;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public double getDistanciaDaEntrega() {
        return distanciaDaEntrega;
    }

    public abstract double calcularTempoDeEntrega();

    public abstract void exibirDetalhes();
}
