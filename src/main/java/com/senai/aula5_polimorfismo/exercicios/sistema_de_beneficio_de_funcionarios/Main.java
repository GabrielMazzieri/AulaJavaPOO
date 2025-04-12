package com.senai.aula5_polimorfismo.exercicios.sistema_de_beneficio_de_funcionarios;

public class Main {
    public static void main(String[] args) {
        Beneficio salario1AuxTrasporte = new AuxilioTransporte("Gabriel", 12000);
        Beneficio salario1PlanoDeSaude = new PlanoDeSaude("Gabriel", 12000);
        Beneficio salario1ValeAlimentacao = new ValeAlimentacao("Gabriel", 12000);

        salario1AuxTrasporte.exibirDetalhes();
        System.out.println("");
        salario1PlanoDeSaude.exibirDetalhes();
        System.out.println("");
        salario1ValeAlimentacao.exibirDetalhes();
    }
}
