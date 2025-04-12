package com.senai.aula6_abstracao.exemplos.exemplos_classe_abstrata.conta_bancaria;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    void aplicarTaxaMensal(){
        saldo+= saldo*0.05;
    }
}
