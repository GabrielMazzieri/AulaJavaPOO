package com.senai.aula5_polimorfismo.exemplos.gestao_veiculos;

public class Caminhao extends Veiculo{
    public Caminhao(String modelo) {
        super(modelo);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("verificação dos freios realizados para o Caminhão" + getModelo());
    }
}
