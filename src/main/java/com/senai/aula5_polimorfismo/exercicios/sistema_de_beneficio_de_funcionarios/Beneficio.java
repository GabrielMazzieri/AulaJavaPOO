package com.senai.aula5_polimorfismo.exercicios.sistema_de_beneficio_de_funcionarios;

public class Beneficio {
    protected String nome;
    protected double valor;

    public Beneficio(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public double calcularDesconto(){
        return 0;
    }

    public void exibirDetalhes(){
        System.out.printf("Nome Funcionário: %s | Salário sem Desconto: %,.2f | Salário com Desconto: %,.2f", nome, valor, calcularDesconto());
    }
}
