package aula2_colecoes.exemplos.exemplo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Gabriel", 18);
        Pessoa pessoa2 = new Pessoa("Allan", 19);
        Pessoa pessoa3 = new Pessoa("Mateus", 17);

        Pessoa[] matrizPessoas = new Pessoa[4];

        matrizPessoas[0] = pessoa1;
        matrizPessoas[1] = pessoa2;
        matrizPessoas[2] = pessoa3;

        for (Pessoa pessoa : matrizPessoas){
            System.out.println(pessoa);
        }

        matrizPessoas[0].falar("oi");
        matrizPessoas[3] = new Pessoa("Bruno", 20);
        System.out.println(matrizPessoas[3].nome);

        ArrayList lista = new ArrayList();

        lista.add(12);
        lista.add(true);
        lista.add("teste");
        lista.add(pessoa1);

        Pessoa pessoa = (Pessoa) lista.get(3);
        pessoa.falar("teste");

        ArrayList<Pessoa> listaPessoas = new ArrayList();

        listaPessoas.add(pessoa1);
        listaPessoas.add(new Pessoa("José", 20));

        System.out.println("tamanho da lista: "+listaPessoas.size());
        listar(listaPessoas);
        listaPessoas.remove(pessoa1);
        listar(listaPessoas);

        listaPessoas.set(0,pessoa2);
        listar(listaPessoas);

        listaPessoas.add(0,pessoa3);
        listar(listaPessoas);
        System.out.println("-----teste------");
        listaPessoas.forEach(System.out::println);

        List<Pessoa> listraFiltrada = listaPessoas.stream().filter(p -> p.nome.contains("Al")).toList();
        System.out.println("-------teste filtrada--------");

        listraFiltrada.forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Preencha as informações a seguir: ");
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Idade: ");
        int idade = scanner.nextInt();
        listaPessoas.add(new Pessoa(nome,idade));
        listaPessoas.forEach(System.out::println);
    }

    public static void listar(ArrayList<Pessoa> lista){
        System.out.println("\n--------lista--------");
        for (Pessoa pessoa: lista){
            System.out.println(pessoa);
        }
        System.out.println("---------------------");
    }



}

