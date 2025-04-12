package com.senai.aula6_abstracao.exercicios.sistema_de_pagamento;

public abstract class Pagamento {
    protected String nomeUsuario;
    protected double valor;
    protected String descricao;

    public Pagamento(String nomeUsuario, double valor, String descricao) {
        this.nomeUsuario = nomeUsuario;
        this.valor = valor;
        this.descricao = descricao;
    }

    public final void validarPagamento(){
        autenticarUsuario();
        validarAntiFraude();
        validarSegurancaGenerica();
        efetuarPagamento();
        registrarLog();
    }

    protected abstract void autenticarUsuario();
    protected abstract void validarAntiFraude();
    protected abstract void efetuarPagamento();

    protected void registrarLog() {
        System.out.printf("log: Pagamento de R$%,.2f por %s realizado. Descricação: %s", valor, nomeUsuario, descricao);
    }

    protected void validarSegurancaGenerica() {
        System.out.println("Validação de segurança padrão aplicada.");
    }

}
