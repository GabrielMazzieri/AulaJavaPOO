package com.senai.aula6_abstracao.exercicios.sistema_de_pagamento;

public class CartaoCredito extends Pagamento {
    private String numeroDoCartao;

    public CartaoCredito(String nomeUsuario, double valor, String descricao, String numeroDoCartao) {
        super(nomeUsuario, valor, descricao);
        this.numeroDoCartao = numeroDoCartao;
    }

    @Override
    protected void autenticarUsuario() {
        System.out.println("Autenticação com o CVV e Senha do Cartão.");
    }

    @Override
    protected void validarAntiFraude() {
        System.out.println("Analisando histórico de compras e Score.");
    }

    @Override
    protected void efetuarPagamento() {
        System.out.println("Pagamento no crédito efetuado com sucesso!");
    }
}
