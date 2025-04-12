package com.senai.aula6_abstracao.exercicios.gerenciamento_de_eventos;

public class EventoSocial implements Evento{
    private String nomeEventoSocial;

    public EventoSocial(String nomeEventoSocial) {
        this.nomeEventoSocial = nomeEventoSocial;
    }

    @Override
    public void iniciarEvento() {
        System.out.printf("Evento %s Iniciado! ", nomeEventoSocial);
    }

    @Override
    public void finalizarEvento() {
        System.out.printf("Evento %s Encerrado. ", nomeEventoSocial);
    }

    @Override
    public void premiarParticipantes() {
        System.out.println("Participantes recebaram a premiação! ");
    }
}
