package com.senai.aula5_polimorfismo.exercicios.sistema_de_reserva_de_hotel;

public class ReservaVIP extends Reserva{
    private double valorNoite;
    private double taxaVIP;

    public ReservaVIP(String nome, int qtdNoites, double valorNoite, double taxaVIP) {
        super(nome, qtdNoites);
        this.valorNoite = valorNoite;
        this.taxaVIP = taxaVIP;
    }

    @Override
    public double calcularValorReserva() {
        return (qtdNoites*valorNoite)+taxaVIP;
    }

    @Override
    public void exibirDetalhes() {
            System.out.printf("Nome: %s | Quantidade de Noites: %d | Taxa VIP: %,.2f | Valor Total: %,.2f", nome, qtdNoites, taxaVIP, calcularValorReserva());
    }
}
