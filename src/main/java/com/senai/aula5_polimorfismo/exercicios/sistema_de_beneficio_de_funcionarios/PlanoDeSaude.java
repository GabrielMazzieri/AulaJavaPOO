package com.senai.aula5_polimorfismo.exercicios.sistema_de_beneficio_de_funcionarios;

public class PlanoDeSaude extends Beneficio{
    public PlanoDeSaude(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularDesconto() {
        return 220;
    }
}
