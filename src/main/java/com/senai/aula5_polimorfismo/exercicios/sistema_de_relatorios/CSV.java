package com.senai.aula5_polimorfismo.exercicios.sistema_de_relatorios;

public class CSV extends Relatorio{
    @Override
    public void gerar() {
        System.out.println("Gerar CSV");
    }
}
