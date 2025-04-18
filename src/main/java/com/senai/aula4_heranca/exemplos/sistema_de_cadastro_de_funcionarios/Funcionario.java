package com.senai.aula4_heranca.exemplos.sistema_de_cadastro_de_funcionarios;

public class Funcionario {
    private String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibirDados(){
        System.out.printf("\nO funcionário: %s, tem o salário de: R$%,.2f", nome, salario);
    }
}
