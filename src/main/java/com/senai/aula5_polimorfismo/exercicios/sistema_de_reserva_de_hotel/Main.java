package com.senai.aula5_polimorfismo.exercicios.sistema_de_reserva_de_hotel;

public class Main {
    public static void main(String[] args) {
        Reserva reserva1 = new ReservaSimples("Gabriel", 5, 100);
        Reserva reserva2 = new ReservaVIP("Brayan", 7, 200, 100);

        reserva1.exibirDetalhes();
        System.out.println("");
        reserva2.exibirDetalhes();
    }

}
