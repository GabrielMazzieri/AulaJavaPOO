package com.senai.aula01_introducao_poo.exemplo.exemplos1.concessionaria;

public class Carro {
    String motor;
    String placa;
    String cor_carro;
    String marca;
    String modelo;
    double valorCompra;
    int km;
    int ano;

    public void testeDrive(){
        System.out.println("Partida no "+modelo);
    }

    public Carro(String motor, String placa, String cor_carro, String marca, String modelo, double valorCompra, int km, int ano) {
        this.motor = motor;
        this.placa = placa;
        this.cor_carro = cor_carro;
        this.marca = marca;
        this.modelo = modelo;
        this.valorCompra = valorCompra;
        this.km = km;
        this.ano = ano;
    }

    public void comprar(String nomeCliente){
        System.out.println("Parabéns! "+nomeCliente+" você adquiriu seu novo veiculo, "+marca+" "+modelo);
    }

    public void tabelaFipe(int anoReferencia){
        int idadeCarro = anoReferencia - this.ano;
        double valorDesvalorizado = valorCompra;

        for (int i = 0; i<idadeCarro; i++){
            valorDesvalorizado -= valorDesvalorizado*0.02;
        }
        System.out.printf("Sua %s de %d vale R$%,.2f na tabela fipe",
                modelo, anoReferencia, valorDesvalorizado);
    }

    @Override
    public String toString() {
        return "A marca "+this.marca+" possui o modelo " +this.modelo+" do ano "+this.ano+" com motor "+this.motor+
                " no qual o cliente adquiriu esse veiculo com a Quilometragem de " +this.km+" com a placa: "+this.placa+" na cor "+this.cor_carro+
                " no preço de R$"+this.valorCompra;
    }

}

