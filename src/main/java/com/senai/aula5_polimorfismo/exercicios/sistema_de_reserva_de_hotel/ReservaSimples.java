package com.senai.aula5_polimorfismo.exercicios.sistema_de_reserva_de_hotel;

public class ReservaSimples extends Reserva{
    private double valorNoite;

    public ReservaSimples(String nome, int qtdNoites, double valorNoite) {
        super(nome, qtdNoites);
        this.valorNoite = valorNoite;
    }

    @Override
    public double calcularValorReserva() {
        return qtdNoites*valorNoite;
    }
}
