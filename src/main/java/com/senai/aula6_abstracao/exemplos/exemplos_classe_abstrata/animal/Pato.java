package com.senai.aula6_abstracao.exemplos.exemplos_classe_abstrata.animal;

public class Pato extends Animal {
    public Pato(String nome) {
        super(nome);
    }

    @Override
    void fazerSom() {
        System.out.println("Quac");
    }

    void botarOvo(){
        System.out.println(nome+" virou mãe");
    }
}
