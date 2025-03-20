package com.senai.aula4_heranca.exercicios.sistema_de_funcionarios;

public class Professor extends Funcionario {
    private String disciplina;

    public Professor(String nome, double salario, String disciplina) {
        super(nome, salario);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void exibirDetalhes(){
        System.out.printf("Nome: %s | Salário: %,.2f | Disciplina: %S", getNome(), getSalario(), disciplina);
    }

    @Override
    public String toString() {
        return "Nome Professor: " + getNome();
    }
}

