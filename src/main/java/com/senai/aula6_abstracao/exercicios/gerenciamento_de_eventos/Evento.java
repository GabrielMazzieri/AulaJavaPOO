package com.senai.aula6_abstracao.exercicios.gerenciamento_de_eventos;

public interface Evento {
    double PREMIACAO = 1200;
    int TEMPO_MAX = 90;

    void iniciarEvento();
    void finalizarEvento();
    void premiarParticipantes();

    default boolean eventoValido(){
        return validarInternamente();
    }

    private boolean validarInternamente(){
        return true;
    }
}
