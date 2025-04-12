package com.senai.aula5_polimorfismo.exercicios.sistema_de_beneficio_de_funcionarios;

public class ValeAlimentacao extends Beneficio{
    public ValeAlimentacao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularDesconto() {
        return salario *0.02;
    }
}
