package com.senai.aula01_introducao_poo.exemplo.exemplos1.pessoa;

public class Endereco {
    String rua;
    int numero;
    String bairro;
    String cidade;
    String estado;

    public Endereco(String rua, int numero, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  "Rua:" + rua +
                ", Numero:" + numero +
                ", Bairro: " + bairro +
                ", Cidade: " + cidade +
                ", Estado: " + estado ;
    }
}
