package com.senai.aula4_heranca.exemplos.sistema_de_cadastro_de_funcionarios;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Gabriel", 5300);
        Gerente gerente1 = new Gerente("Gabriel", 7000, 2000);

        funcionario1.exibirDados();
        gerente1.exibirDados();
    }
}
