package com.senai.aula5_polimorfismo.exemplos.sistema_de_pagamento;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pagamentos> listaPagamento = new ArrayList<>();
        listaPagamento.add(new CLT("Gabriel", 3766));
        listaPagamento.add((new PJ("Brayan", 15, 4)));
        listaPagamento.add(new Freelancers("Rafael", 3000));

        listaPagamento.forEach(pagamentos -> System.out.printf("%s recebe R$%,.2f\n",
                pagamentos.getNome(),
                pagamentos.calcularPagamento()));
    }
}
