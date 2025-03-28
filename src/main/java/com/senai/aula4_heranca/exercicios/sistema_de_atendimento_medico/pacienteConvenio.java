package com.senai.aula4_heranca.exercicios.sistema_de_atendimento_medico;

public class pacienteConvenio extends pacienteParticular{
    private double descontoConvenio;

    public pacienteConvenio(String nome, int idade, double valorConsulta, double descontoConvenio) {
        super(nome, idade, valorConsulta);
        this.descontoConvenio = descontoConvenio;
    }

    public double getDescontoConvenio() {
        return descontoConvenio;
    }

    public void setDescontoConvenio(double descontoConvenio) {
        this.descontoConvenio = descontoConvenio;
    }

    public double valoComConvenio(){
        return getValorConsulta() - descontoConvenio;
    }

    public void exibirDetalhes(){
        System.out.printf("\nNome do Paciente: %s | Idade: %d |  Valor da Consulta com Convênio: %,.2f", getNome(), getIdade(), valoComConvenio());
    }
}
