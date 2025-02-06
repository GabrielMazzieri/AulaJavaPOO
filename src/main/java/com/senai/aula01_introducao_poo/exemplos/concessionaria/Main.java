package com.senai.aula01_introducao_poo.exemplos.concessionaria;


public class Main {
 public static void main(String[] args) {

  Carro carro1 = new Carro(
    "M TwinPower Turbo",
          "BMW2M20",
          "Baby Blue",
          "BMW",
          "M2",
          600000,
          231,
          2024

  );

  System.out.println(carro1);
  carro1.testeDrive();
  carro1.comprar("Gabriel");
  carro1.tabelaFipe(2025);

 }
}
