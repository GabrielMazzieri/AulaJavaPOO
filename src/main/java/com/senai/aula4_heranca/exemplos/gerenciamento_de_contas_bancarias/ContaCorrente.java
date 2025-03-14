package com.senai.aula4_heranca.exemplos.gerenciamento_de_contas_bancarias;

public class ContaCorrente extends ContaBancaria {
    private double limite;

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor){
        if (valor > 0 && valor <= saldo+limite){
            saldo-=valor;
            System.out.println("Saque realizado. Saldo atual: R$" + getSaldo());
        } else if (valor > this.saldo){
            throw new RuntimeException("ERRO: Saldo insuficiente");
        } else {
            System.out.println("O Valor do saque é negativo");
        }
        return false;
    }
}
