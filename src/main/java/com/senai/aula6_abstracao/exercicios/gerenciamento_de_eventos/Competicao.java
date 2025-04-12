package com.senai.aula6_abstracao.exercicios.gerenciamento_de_eventos;

public class Competicao implements Evento{
    private String nomeCompeticao;

    public Competicao(String nomeCompeticao) {
        this.nomeCompeticao = nomeCompeticao;
    }

    @Override
    public void iniciarEvento() {
        System.out.printf("Competição de %s Iniciada!", nomeCompeticao);
    }

    @Override
    public void finalizarEvento() {
        System.out.printf("Competição de %s Encerrada.", nomeCompeticao);
    }

    @Override
    public void premiarParticipantes() {
        System.out.printf("Campeões receberam R$%,.2f\n", PREMIACAO);
    }
}
