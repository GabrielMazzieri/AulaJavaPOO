package com.senai.aula6_abstracao.exemplos.exemplos_interface.aparelhos_eletronicos;

public class Main {
    public static void main(String[] args) {
        testarAparelhos(new Televisao());
        testarAparelhos(new Computador());
    }
    public static void testarAparelhos(AparelhoEletronico aparelhoEletronico){
        System.out.println("Testando Aparelhos");
        aparelhoEletronico.ligar();
        aparelhoEletronico.desligar();
    }

}
