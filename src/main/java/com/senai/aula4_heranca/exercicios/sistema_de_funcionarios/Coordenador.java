package com.senai.aula4_heranca.exercicios.sistema_de_funcionarios;

import java.util.ArrayList;

public class Coordenador extends Funcionario {
    private ArrayList<Professor> listaProfessores;

    public Coordenador(String nome, double salario, ArrayList<Professor> professores) {
        super(nome, salario);
        this.listaProfessores = professores;
    }

    public ArrayList<Professor> getListaProfessores() {
        return listaProfessores;
    }

    public void setListaProfessores(ArrayList<Professor> listaProfessores) {
        this.listaProfessores = listaProfessores;
    }

    public void exibirDetalhes(){
        System.out.println("\nNome do Coordenador: " + getNome() +
                "\nEquipe:");
        listaProfessores.forEach(System.out::println);
    }
}
