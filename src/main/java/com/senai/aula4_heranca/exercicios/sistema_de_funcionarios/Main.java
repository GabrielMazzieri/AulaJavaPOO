package com.senai.aula4_heranca.exercicios.sistema_de_funcionarios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Professor professor1 = new Professor("Gabriel", 3000, "Gastronomia");
        Professor professor2 = new Professor("Brayan", 18000, "Matemática");

        ArrayList<Professor> listaProfessores = new ArrayList<>();
        listaProfessores.add(professor1);
        listaProfessores.add(professor2);

        Coordenador coordenador1 = new Coordenador("José", 5000, listaProfessores);

        coordenador1.exibirDetalhes();



    }
}
