package com.senai.aula5_polimorfismo.exercicios.sistema_de_beneficio_de_funcionarios;

public class Beneficio {
    protected String nome;
    protected double salario;

    public Beneficio(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularDesconto(){
        return 0;
    }

    public void exibirDetalhes(){
        System.out.printf("Nome Funcionário: %s | Salário sem Desconto: R$%,.2f | Valor Descontado: R$%,.2f | Total Com Desconto: R$%,.2f", nome, salario, calcularDesconto(), salario-calcularDesconto());
    }
}
