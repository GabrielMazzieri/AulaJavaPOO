package exercicios.exercicio01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto(
                "Caixa de suco",
                7.00f,
                5
                );
        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque um valor para atualizar estoque: ");
        int valorMudanca = sc.nextInt();

        System.out.println("Você deseja dimuir ou aumentar o valor: ");
        String mais_menos = sc.nextLine();


        produto1.atualizaEstoque(valorMudanca);
    }
}
