package com.senai.aula5_polimorfismo.exercicios.sistema_de_reserva_de_hotel;

public class Reserva {
    protected String nome;
    protected int qtdNoites;

    public Reserva(String nome, int qtdNoites) {
        this.nome = nome;
        this.qtdNoites = qtdNoites;
    }

    public double calcularValorReserva(){
        return 0.0;
    }

    public void exibirDetalhes(){
        System.out.printf("Nome: %s | Quantidade de Noites: %d | Valor Total: %,.2f", nome, qtdNoites, calcularValorReserva());
    }
}
