package com.senai.aula6_abstracao.exercicios.controle_de_entrega;

public class Bicicleta extends VeiculoDaEntrega{
    private final double VELOCIDADE_MAX = 20.00;

    public Bicicleta(double velocidade, double capacidade, double distanciaDaEntrega) {
        super(velocidade, capacidade, distanciaDaEntrega);
    }

    @Override
    public void acelerar(double incremento) {
        if(velocidade + incremento > VELOCIDADE_MAX){
            velocidade = VELOCIDADE_MAX;
        } else {
            super.acelerar(incremento);

        }
        System.out.printf("Velocidade da Bicicleta: %,.2fkm/h", velocidade);
    }

    @Override
    public double calcularTempoDeEntrega() {
        return (distanciaDaEntrega / velocidade) * 1.06;
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("Bicicleta - " +
                "Velocidade Atual: %.2f km/h | " +
                "Capacidade de Carga: %,.2f kg | " +
                "Distância: %.2f km ", velocidade, capacidade, distanciaDaEntrega);

        double tempo = calcularTempoDeEntrega();
        int horas = (int) tempo;
        int minutos = (int) ((tempo - horas) * 60);
        System.out.printf("\nTempo estimado: %d horas e %d minutos\n", horas, minutos);
    }
}

