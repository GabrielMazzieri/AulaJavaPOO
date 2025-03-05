package aula2_colecoes.exercicios.exercicio1;

import java.util.ArrayList;

public class Tarefa {
    String nomeTarefa;
    Boolean status;
    ArrayList<Tarefa> listaTarefas;

    public Tarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
        this.status = false;
    }

    public String getNomeTarefa(){
        return nomeTarefa;
    }

    public Boolean getStatus(){
        return status;
    }

    public void concluida(){
        this.status = true;
    }

    @Override
    public String toString(){
        return nomeTarefa + " - [" +(status ? "Concluida" : "Pendente")+"]";
    }
}
