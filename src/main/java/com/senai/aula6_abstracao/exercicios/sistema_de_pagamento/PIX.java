package com.senai.aula6_abstracao.exercicios.sistema_de_pagamento;

public class PIX extends Pagamento{
    public PIX(String nomeUsuario, double valor, String descricao) {
        super(nomeUsuario, valor, descricao);
    }

    @Override
    protected void autenticarUsuario() {
        System.out.println("Autenticando chave PIX.");
    }

    @Override
    protected void validarAntiFraude() {
        System.out.println("Analisando o limite diário e transações suspeitas.");
    }

    @Override
    protected void efetuarPagamento() {
        System.out.println("Pagamento no PIX efetuado com sucesso.");
    }

}
