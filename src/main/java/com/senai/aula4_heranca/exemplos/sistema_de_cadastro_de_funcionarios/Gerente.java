package com.senai.aula4_heranca.exemplos.sistema_de_cadastro_de_funcionarios;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void exibirDados() {
        System.out.printf("\nO Gerente: %s, tem o salário de: R$%,.2f", getNome(), (salario+bonus));
    }
}
