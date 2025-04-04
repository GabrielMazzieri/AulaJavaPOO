package com.senai.aula6_abstracao.exemplos.exemplos_classe_abstrata.gerenciamento_de_funcionarios;

public class Main {
    public static void main(String[] args) {
        testaPagamanto(new FuncionarioEfetivo("Gabriel", 1200, 222));
        testaPagamanto(new FuncionarioTemporario("Brayan", 199, 322, 2323));
    }
    public static void testaPagamanto(Funcionarios funcionarios){
        System.out.println("Testando Funcionarios");

        funcionarios.exibirDados();
        funcionarios.aumentarSalario(20);
        funcionarios.exibirDados();
        funcionarios.calcularBonus();
        funcionarios.exibirDados();

    }
}
