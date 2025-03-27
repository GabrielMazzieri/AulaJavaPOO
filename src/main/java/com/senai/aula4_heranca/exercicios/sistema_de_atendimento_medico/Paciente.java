package com.senai.aula4_heranca.exercicios.sistema_de_atendimento_medico;

public class Paciente {
    private String nome;
    private int idade;

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirDetalhes(){
        System.out.printf("Nome do Paciente: %s | Idade: %d", nome, idade);
    }

}
