package com.senai.aula6_abstracao.exemplos.exemplos_classe_abstrata.conta_bancaria;

public class ContaPoupanca extends ContaCorrente {
    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    void aplicarTaxaMensal(){
        saldo-=20;
   }
}
