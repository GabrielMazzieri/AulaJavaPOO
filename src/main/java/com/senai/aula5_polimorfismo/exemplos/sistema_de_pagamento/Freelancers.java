package com.senai.aula5_polimorfismo.exemplos.sistema_de_pagamento;

public class Freelancers extends Pagamentos {
    private double valorProjeto;

    public Freelancers(String nome, double valorProjeto) {
        super(nome);
        this.valorProjeto = valorProjeto;
    }

    @Override
    public double calcularPagamento(){
        return valorProjeto;
    }
}
