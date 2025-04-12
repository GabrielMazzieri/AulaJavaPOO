package com.senai.aula6_abstracao.exercicios.controle_de_entrega;

public class Moto extends VeiculoDaEntrega {
    public Moto(double velocidade, double capacidade, double distanciaDaEntrega) {
        super(velocidade, capacidade, distanciaDaEntrega);
    }

    @Override
    public double calcularTempoDeEntrega() {
        return (distanciaDaEntrega / velocidade) * 1.1;
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("Moto - " +
                "Velocidade Atual: %.2f km/h | " +
                "Capacidade de Carga: %,.2f kg | " +
                "Distância: %.2f km ", velocidade, capacidade, distanciaDaEntrega);

        double tempo = calcularTempoDeEntrega();
        int horas = (int) tempo;
        int minutos = (int) ((tempo - horas) * 60);
        System.out.printf("\nTempo estimado: %d horas e %d minutos\n", horas, minutos);
    }
}
