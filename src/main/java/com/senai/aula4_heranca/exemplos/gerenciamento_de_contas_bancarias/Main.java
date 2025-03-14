package com.senai.aula4_heranca.exemplos.gerenciamento_de_contas_bancarias;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente1 = new ContaCorrente("Gabriel", 3000, 300);
        ContaPoupanca contaPoupanca1 = new ContaPoupanca("Bryan", 4000, 20);

        contaCorrente1.exibirSaldo();
        contaPoupanca1.exibirSaldo();

        System.out.println("---Teste Conta Corrente---");

        contaCorrente1.sacar(2600);
        contaCorrente1.sacar(600);

        System.out.println("---Teste Conta Poupança---");
        contaPoupanca1.aplicarRendimento();
        System.out.println("\n--------------------");

        contaCorrente1.exibirSaldo();
        contaPoupanca1.exibirSaldo();
    }
}
