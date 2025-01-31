package com.senai.aula01_introducao_poo.exemplos.pessoa;

public class Main {
    public static void main(String[] args) {

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

        System.out.println(pessoa1.endereco.rua);
        pessoa1.falar("Olá!");
        pessoa2.falar("Oi, tudo bem?");
        pessoa1.comer("Maça");
        pessoa2.comer("Hamburguer");

        Pessoa pessoa3 = new Pessoa("Gabriel", 10);
    }
}
