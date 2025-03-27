package com.senai.aula5_polimorfismo.exemplos.gestao_veiculos;

public class Moto extends Veiculo{
    public Moto(String modelo) {
        super(modelo);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Troca de óleo realizado para a moto" + getModelo());
    }
}
