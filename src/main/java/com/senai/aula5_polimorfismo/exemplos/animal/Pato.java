package com.senai.aula5_polimorfismo.exemplos.animal;

public class Pato extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Quak Quak");
    }
    public void voar(){
        System.out.println("Voando");
    }
}
