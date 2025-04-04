package com.senai.aula6_abstracao.exemplos.exemplos_classe_abstrata.gerenciamento_de_funcionarios;

public class FuncionarioEfetivo extends Funcionarios{
    private double bonusMensal;

    public FuncionarioEfetivo(String nome, double salario, double bonusMensal) {
        super(nome, salario);
        this.bonusMensal = bonusMensal;
    }

    @Override
    public double calcularBonus() {
        return salario+=bonusMensal;
    }
}
