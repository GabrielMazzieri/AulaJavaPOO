package com.senai.aula5_polimorfismo.exercicios.sistema_de_relatorios;

public class PDF extends Relatorio {
    @Override
    public void gerar() {
        System.out.println("Gerar PDF");
    }
}
