package com.senai.aula6_abstracao.exercicios.sistema_de_pagamento;

public class CarteiraDigital extends Pagamento {
    private String appCarteiraDigital;

    public CarteiraDigital(String nomeUsuario, double valor, String descricao, String appCarteiraDigital) {
        super(nomeUsuario, valor, descricao);
        this.appCarteiraDigital = appCarteiraDigital;
    }

    @Override
    protected void autenticarUsuario() {
        System.out.printf("Autenticando com token do %s.", appCarteiraDigital);
    }

    @Override
    protected void validarAntiFraude() {
        System.out.println("Analisando dispositivo conectado.");
    }

    @Override
    protected void efetuarPagamento() {
        System.out.println("Pagamento feito pelo "+appCarteiraDigital+" efetuado com sucesso!");
    }
}
