package aula2_colecoes.exercicios.exercicio2;

import aula2_colecoes.exercicios.exercicio1.Tarefa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> armazenarProduto = new ArrayList<>();
        int numOpcao;

        do{
            System.out.println("\n-- Controle de Estoque --" +
                    "\n\t1. Cadastra Produto" +
                    "\n\t2. Listar Produtos" +
                    "\n\t3. Atualizar Quantidade" +
                    "\n\t4. Remover Produto" +
                    "\n\t5. Buscar Produto" +
                    "\n\t6. Sair" +
                    "\nEscolha um Número: ");
            numOpcao = sc.nextInt();
            sc.nextLine();

            switch (numOpcao){
                case 1:
                    System.out.println("Digite o Produto: ");
                    String nomeProduto = sc.nextLine();
                    System.out.println("Digite a quantidade inicial do Produto: ");
                    int qtdEmEstoque = sc.nextInt();
                    armazenarProduto.add((new Produto(nomeProduto, qtdEmEstoque)));
                    System.out.println("Produto adicionado!");
                    break;

                case 2:
                    if (armazenarProduto.isEmpty()) {
                        System.out.println("Nenhum produto na lista.");
                    } else {
                        System.out.println("Lista de Produtos:");
                        for (int i = 0; i < armazenarProduto.size(); i++) {
                            System.out.println((i + 1) + ". " + armazenarProduto.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("Digite o número do produto: ");
                    for (int i = 0; i < armazenarProduto.size(); i++) {
                        System.out.println((i + 1) + ". " + armazenarProduto.get(i));
                    }
                    int produtoEscolhido = sc.nextInt() - 1;
                    if (produtoEscolhido >= 0 && produtoEscolhido < armazenarProduto.size()) {
                        System.out.println("Digite a quantidade para ser removida ou adicionada: ");
                        int quantidade = sc.nextInt();
                        armazenarProduto.get(produtoEscolhido).atualizaEstoque(quantidade);
                    } else {
                        System.out.println("Produto inválido.");
                    }
                    break;

                case 4:
                    if (!armazenarProduto.isEmpty()) {
                        System.out.print("Digite o número do produto: ");
                        int indice = sc.nextInt();
                        sc.nextLine();
                        if (indice > 0 && indice <= armazenarProduto.size()) {
                            armazenarProduto.remove(indice - 1);
                            System.out.println("Produto Removido!");
                        } else {
                            System.out.println("Número inválido.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Digite o nome do produto a buscar: ");
                    String nomeBusca = sc.nextLine();
                    boolean encontrado = false;
                    for (Produto pro : armazenarProduto) {
                        if (pro.getNomeProduto().equalsIgnoreCase(nomeBusca)) {
                            System.out.println("Produto encontrado: " + pro);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
            }
        }while (numOpcao != 6);
            sc.close();
    }
}
