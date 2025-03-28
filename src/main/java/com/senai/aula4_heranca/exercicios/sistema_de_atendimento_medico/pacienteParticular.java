package com.senai.aula4_heranca.exercicios.sistema_de_atendimento_medico;

public class pacienteParticular extends Paciente {
    private double valorConsulta;

    public pacienteParticular(String nome, int idade, double valorConsulta) {
        super(nome, idade);
        this.valorConsulta = valorConsulta;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public void exibirDetalhes(){
        System.out.printf("\nNome do Paciente: %s | Idade: %d | Valor da Consulta: %,.2f", getNome(), getIdade(), valorConsulta);
    }
}
