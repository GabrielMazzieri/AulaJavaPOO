package com.senai.aula3_encapsulamento.exercicios.conta_bancaria_operacoes_simples;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        if (saldoInicial>0){
        this.titular = titular;
        this.saldo = saldoInicial;
    } else{
        throw new RuntimeException("ERRO: Saldo incial negativo");
    }
}

    public void depositar(double valor){
        if (valor>0){
            this.saldo+=valor;
            System.out.println("Deposito realizado. Saldo atual: R$"+getSaldo());
        } else {
            throw new RuntimeException("ERRO: Valor do deposito negativo");
        }
    }

    public boolean sacar(double valor){
        if (valor <= this.saldo && valor > 0){
            this.saldo-=valor;
            System.out.println("Saque realizado. Saldo atual: R$" + getSaldo());
        } else if (valor > this.saldo){
            throw new RuntimeException("ERRO: Saldo insuficiente");
        } else {
            throw new RuntimeException("ERRO: Valor do saque negativo");
        }
        return false;
    }

    public void transferir(double valor, ContaBancaria contaDestino) {
        if (this.sacar(valor))
            contaDestino.depositar(valor);
        }


    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "titular" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
