package com.senai.aula6_abstracao.exercicios.gerenciamento_de_eventos;

public class DesafioRelampago implements Evento{
    @Override
    public void iniciarEvento() {
        System.out.println("Desafio Relâmpago iniciado!");
    }

    @Override
    public void finalizarEvento() {
        System.out.println("Tempo Encerrado.");
    }

    @Override
    public void premiarParticipantes() {
        System.out.println("Premiação Relãmpago");
    }
}
