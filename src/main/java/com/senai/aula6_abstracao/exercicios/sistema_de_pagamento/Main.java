package com.senai.aula6_abstracao.exercicios.sistema_de_pagamento;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamento1 = new CartaoCredito("Gabriel", 120, "Assinatura Netflix.", "1234-5678");
        Pagamento pagamento2 = new PIX("Gabriel", 50, "Presente.");
        Pagamento pagamento3 = new CarteiraDigital("Gabriel", 321, "Pizza", "PicPay");

        System.out.println("\n   CARTÃO DE CRÉDITO     ");
        pagamento1.autenticarUsuario();
        pagamento1.validarAntiFraude();
        pagamento1.validarSegurancaGenerica();
        pagamento1.efetuarPagamento();
        pagamento1.registrarLog();
        System.out.println("\n------------------------------------------------------------------------------------");
        System.out.println("\n        PIX         ");
        pagamento2.autenticarUsuario();
        pagamento2.validarAntiFraude();
        pagamento2.validarSegurancaGenerica();
        pagamento2.efetuarPagamento();
        pagamento2.registrarLog();
        System.out.println("\n------------------------------------------------------------------------------------");
        System.out.println("\n   CARTEIRA DIGITAL     ");
        pagamento3.autenticarUsuario();
        pagamento3.validarAntiFraude();
        pagamento3.validarSegurancaGenerica();
        pagamento3.efetuarPagamento();
        pagamento3.registrarLog();


    }
}
