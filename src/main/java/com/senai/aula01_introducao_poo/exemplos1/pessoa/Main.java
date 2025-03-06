package com.senai.aula01_introducao_poo.exemplos1.pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa(
                "Gabriel",
                18,
                1.7f,
                new Endereco(
                        "ruinha",
                        199,
                        "Bairro das Laranjas",
                        "São Paulo",
                        "SP"
                        )
        );

        Pessoa pessoa2 = new Pessoa(
                "Lucas Moura",
                32,
                1.8f,
                new Endereco(
                        "Av Marques São Vicente",
                        199,
                        "Barra Funda",
                        "São Paulo",
                        "SP"
                )
        );


        String[] etiquetas = {"nome: ", "idade: ", "altura: ", "endereço: \n\t rua: ", "\tnumero: ", "\tbairro: ", "\tcidade: ", "\testado: "};
        String[] dados = new String[etiquetas.length];

        System.out.println("Preencha o formulário: ");
        for (int i = 0; i< etiquetas.length; i++){
            System.out.println(etiquetas[i]);
            dados[i] = sc.nextLine();
        }
        Pessoa pessoa3 = new Pessoa(
                dados[0],
                Integer.parseInt(dados[1]),
                Float.parseFloat(dados[2]),
                new Endereco(
                        dados[3],
                        Integer.parseInt(dados[4]),
                        dados[5],
                        dados[6],
                        dados[7]
                )

        );
        System.out.println(pessoa3);

        System.out.println(pessoa1.endereco.rua);
        pessoa1.falar("Olá!");
        pessoa2.falar("Oi, tudo bem?");
        pessoa1.comer("Maça");
    }
}
