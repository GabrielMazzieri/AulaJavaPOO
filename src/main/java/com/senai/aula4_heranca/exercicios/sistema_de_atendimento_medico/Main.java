package com.senai.aula4_heranca.exercicios.sistema_de_atendimento_medico;

public class Main {
    public static void main(String[] args) {
        Paciente pacienteParticular1 = new pacienteParticular("Gabriel", 18, 175);
        Paciente pacienteConvenio1 = new pacienteConvenio("Brayan", 17, 132, 30);

        pacienteParticular1.exibirDetalhes();
        pacienteConvenio1.exibirDetalhes();

    }
}
