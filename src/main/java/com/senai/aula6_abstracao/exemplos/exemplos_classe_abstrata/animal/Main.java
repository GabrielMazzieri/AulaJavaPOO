package com.senai.aula6_abstracao.exemplos.exemplos_classe_abstrata.animal;

public class Main {
    public static void main(String[] args) {
        testarAnimal(new Cachorro("Bob"));
        testarAnimal(new Pato("Alexandre"));
    }
    private static void testarAnimal(Animal animal){
        animal.dormir();
        animal.fazerSom();
    }
}
