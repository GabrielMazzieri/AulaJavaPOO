package com.senai.aula5_polimorfismo.exemplos.sistema_de_pagamento;

public class CLT extends Pagamentos{
    private double salario;

    public CLT(String nome, double salario){
        super(nome);
        this.salario = salario;
    }

    @Override
    public double calcularPagamento(){
        return salario;
    }
}
