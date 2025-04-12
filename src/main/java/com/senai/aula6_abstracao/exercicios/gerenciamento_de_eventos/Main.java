package com.senai.aula6_abstracao.exercicios.gerenciamento_de_eventos;

public class Main {
    public static void main(String[] args) {
        Evento[] eventos = {
                new EventoSocial("Mineração"),
                new Competicao("1x1"),
                new DesafioRelampago()
        };

        for (Evento evento : eventos){
            System.out.println("--  Novo Evento  --");
            if (evento.eventoValido()){
                System.out.println("");
                evento.iniciarEvento();
                System.out.println("");
                evento.finalizarEvento();
                System.out.println("");
                evento.premiarParticipantes();
                System.out.println("");
            } else {
                System.out.println("Evento Indisponivel");
            }
        }
    }
}
