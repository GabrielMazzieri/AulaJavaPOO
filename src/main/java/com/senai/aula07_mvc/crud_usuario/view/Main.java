package com.senai.aula07_mvc.crud_usuario.view;

import com.senai.aula07_mvc.crud_usuario.controller.OperadorController;
import com.senai.aula07_mvc.crud_usuario.controller.SupervisorController;
import com.senai.aula07_mvc.crud_usuario.model.Operador;
import com.senai.aula07_mvc.crud_usuario.model.Supervisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OperadorController opController = new OperadorController();
        SupervisorController supController = new SupervisorController();

        String menu =
                """
                            MENU
                                1 - Cadastra Usuário
                                2 - Deletar Usuário
                                3 - Atualizar Usuário
                                4 - Exibir Usuário
                                5 - ligar Máquina
                                6 - Demitir Operador
                                7 - Sair         
                        
                        """;
        int opcao = 0;

        do {
            System.out.println(menu);
            opcao = sc.nextInt();
            sc.nextLine();
            System.out.println("Que tipo de Usuário Cadastrar?");
            System.out.println("1 - Operador");
            System.out.println("2 - Supervisor");
            int escolhaTipo = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:

                    System.out.println("Preencha os dados a seguir: ");
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    if (escolhaTipo == 1) {
                        String setor = sc.nextLine();
                        Operador operador = new Operador(nome, id, setor);
                        opController.cadastrarOperador(operador);
                    } else if (escolhaTipo == 2) {
                        String area = sc.nextLine();
                        Supervisor supervisor = new Supervisor(nome, id, area);
                        supController.cadastrarSupervisor(supervisor);
                    } else {
                        System.out.println("Opção Inválida");
                    }
                    break;

                case 2:
                    if (escolhaTipo == 1)
                        opController.listarOperadores().forEach(System.out::println);

                    else if (escolhaTipo == 2)
                        supController.listarSupervisor().forEach(System.out::println);
                        System.out.println("Escolha um usuário para deletar: ");
                        id = sc.nextInt();
                        sc.nextLine();

                        if(escolhaTipo == 1)
                            opController.deletarOperador(id);
                        else if (escolhaTipo == 2)
                            supController.deletarSupervisor(id);
                    break;

                case 3:
                    if (escolhaTipo == 1)
                        opController.listarOperadores().forEach(System.out::println);

                    else if (escolhaTipo == 2)
                        supController.listarSupervisor().forEach(System.out::println);
                        System.out.println("Escolha um usuário para atualizar: ");
                        id = sc.nextInt();
                        sc.nextLine();

                    System.out.println("Atualize as Seguintes Informações: ");
                    nome = sc.nextLine();

                    if (escolhaTipo == 1){
                        System.out.println("Setor: ");
                        String setor = sc.nextLine();
                        Operador operador = new Operador(nome, id, setor);
                        opController.atualizarOperador(operador);
                    } else if (escolhaTipo == 2) {
                        System.out.println("Área: ");
                        String area = sc.nextLine();
                        Supervisor supervisor = new Supervisor(nome, id, area);
                        supController.atualizarSupervisor(supervisor);
                    }
                    System.out.println("Usuário Atualizado!");
                    break;

                case 4:
                    if (escolhaTipo == 1)
                        opController.listarOperadores().forEach(System.out::println);

                    else if (escolhaTipo == 2)
                        supController.listarSupervisor().forEach(System.out::println);
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    System.out.println("Saindo do Sistema...");
                    sc.close();
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        } while(opcao != 7);

    }
}
