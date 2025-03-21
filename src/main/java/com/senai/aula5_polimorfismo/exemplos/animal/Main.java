package com.senai.aula5_polimorfismo.exemplos.animal;

public class Main {
    public static void main(String[] args) {
       // testeSomAnimal(new Cachorro());
        testeSomAnimal(new Pato());
    }
    public static void testeSomAnimal(Animal animal){
        animal.fazerSom();
        Pato pato = (Pato) animal;
        pato.voar();
    }
}
