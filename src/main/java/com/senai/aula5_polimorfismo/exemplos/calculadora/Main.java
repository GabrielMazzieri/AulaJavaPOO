package com.senai.aula5_polimorfismo.exemplos.calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calc1 = new Calculadora();

        calc1.somar(5, 1);
        calc1.somar(8,9,9);
        calc1.somar(8.1,1.0);
        calc1.somar(7,9.7);
        calc1.somar(9.9, 2);
    }
}
