package com.senai.aula5_polimorfismo.exercicios.sistema_de_beneficio_de_funcionarios;

public class AuxilioTransporte extends Beneficio{
    public AuxilioTransporte(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularDesconto() {
        return salario *0.05;
    }
}
