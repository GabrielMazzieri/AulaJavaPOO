package com.senai.aula01_introducao_poo.exemplos.exercicios.exercicio02;

public class Aluno {
    String nomeAluno;
    int idadeAluno;
    float notaAluno;

    public Aluno(String nomeAluno, int idadeAluno, float notaAluno) {
        this.nomeAluno = nomeAluno;
        this.idadeAluno = idadeAluno;
        this.notaAluno = notaAluno;
    }

    public void exibirInformacoes(){
        System.out.printf("\nNome: %s | Idade: %d | Nota: %,.2f",
                nomeAluno, idadeAluno, notaAluno);
    }

    public void atualizaNota(float valorNota){
        if(notaAluno + valorNota >=0){
            this.notaAluno += valorNota;
            System.out.printf("Nota atualizada de %s: %,.2f", this.nomeAluno, this.notaAluno);
        } else {
            System.out.println("A nota não pode ser menor que 0");
        }

    }

    public void verificaAprovacao(){
        if (notaAluno >= 6){
            boolean resultadoT = true;
            System.out.println("\nResultado: "+resultadoT);
            System.out.printf("\t%s foi aprovado!", this.nomeAluno);
        } else {
            boolean resultadoF = false;
            System.out.println("\nResultado: "+resultadoF);
            System.out.printf("\t%s foi reprovado : ", this.nomeAluno);
        }
    }
}

