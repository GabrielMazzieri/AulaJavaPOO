package com.senai.aula6_abstracao.exemplos.exemplos_classe_abstrata.conta_bancaria;

public abstract class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    abstract void aplicarTaxaMensal();

    public void depositar(double valor){
        if (valor>0){
            this.saldo+=valor;
            System.out.println("Deposito realizado. Saldo atual: R$"+saldo);
        } else {
            throw new RuntimeException("ERRO: Valor do deposito negativo");
        }
    }

    public boolean sacar(double valor){
        if (valor <= this.saldo && valor > 0){
            this.saldo-=valor;
            System.out.println("Saque realizado. Saldo atual: R$" + saldo);
        } else if (valor > this.saldo){
            throw new RuntimeException("ERRO: Saldo insuficiente");
        } else {
            throw new RuntimeException("ERRO: Valor do saque negativo");
        }
        return false;
    }

    public void exibirSaldo(){
            System.out.printf("\nO titular: %s, tem o saldo de: R$%,.2f", titular, saldo);
        }
}
