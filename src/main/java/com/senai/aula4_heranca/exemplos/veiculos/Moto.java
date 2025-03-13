package com.senai.aula4_heranca.exemplos.veiculos;

class Moto extends Veiculo {
    boolean partidaEletrica;

    public Moto(String marca, int ano, boolean partidaEletrica) {
        super(marca, ano);
        this.partidaEletrica = partidaEletrica;
    }

    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Partida elétrica: " + (partidaEletrica ? "Sim" : "Não"));
    }
}
