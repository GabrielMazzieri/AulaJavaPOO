package aula2_colecoes.exercicios.exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Tarefa> listaTarefas = new ArrayList<>();
        int numOpcao;

        do {
            System.out.println("--Gerenciador de Tarefas--" +
                    "\n\t1. Adicionar Tarefa" +
                    "\n\t2. Listar Tarefas" +
                    "\n\t3. Marcar Tarefa como Concluída" +
                    "\n\t4. Remover Tarefa" +
                    "\n\t5. Sair" +
                    "\n\tEscolha um Número: ");
            numOpcao = sc.nextInt();
            sc.nextLine();

            switch (numOpcao){
                case 1:
                    System.out.println("Digite a tarefa: ");
                    String nomeTarefa = sc.nextLine();
                    listaTarefas.add((new Tarefa(nomeTarefa)));
                    System.out.println("Tarefa adicionada!");
                    break;

                case 2:
                    if (listaTarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa na lista.");
                    } else {
                        System.out.println("Lista de Tarefas:");
                        for (int i = 0; i < listaTarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + listaTarefas.get(i));
                        }

                    }
                    break;
                case 3:
                    if (!listaTarefas.isEmpty()) {
                        System.out.print("Digite o número da tarefa concluída: ");
                        int indice = sc.nextInt();
                        sc.nextLine();
                        if (indice > 0 && indice <= listaTarefas.size()) {
                            listaTarefas.get(indice - 1).concluida();
                            System.out.println("Tarefa marcada como concluída!");
                        } else {
                            System.out.println("Número inválido.");
                        }
                    }
                    break;
                case 4:
                    if (!listaTarefas.isEmpty()) {
                        System.out.print("Digite o número da tarefa a ser removida: ");
                        int indice = sc.nextInt();
                        sc.nextLine();
                        if (indice > 0 && indice <= listaTarefas.size()) {
                            listaTarefas.remove(indice - 1);
                            System.out.println("Tarefa removida com sucesso!");
                        } else {
                            System.out.println("Número inválido.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (numOpcao !=5);
        sc.close();

    }
}
