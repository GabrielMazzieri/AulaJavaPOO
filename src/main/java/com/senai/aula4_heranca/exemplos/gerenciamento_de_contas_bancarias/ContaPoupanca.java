package com.senai.aula4_heranca.exemplos.gerenciamento_de_contas_bancarias;

public class ContaPoupanca extends ContaBancaria {
    private double taxaDeRendimento;

    public ContaPoupanca(String titular, double saldo, double taxaDeRendimento) {
        super(titular, saldo);
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public void aplicarRendimento(){
        saldo += (saldo*taxaDeRendimento)/100;
    }


    public double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }

    public void setTaxaDeRendimento(double taxaDeRendimento) {
        this.taxaDeRendimento = taxaDeRendimento;
    }
}
