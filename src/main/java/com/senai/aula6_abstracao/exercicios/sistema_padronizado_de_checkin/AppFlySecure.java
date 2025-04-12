package com.senai.aula6_abstracao.exercicios.sistema_padronizado_de_checkin;

public interface AppFlySecure {
    double PESO_MAX_NACIONAL = 18.00;
    double PESO_MAX_INTERNACIONAL = 25.00;

    void validarDocumento(String documento);
    void emitirCartao(String nome);

    default void exibirMsgSeguranca(){
        System.out.println("Check-in seguro realizado pela FlySecure");
    }

    static void exibirMsgBoasVindas(){
        System.out.println("Bom-Vindo a FlySecure, com a gente você está seguro!");
    }

    default boolean pesoBagagem(double peso, boolean vooInternacioal){
        double limite = vooInternacioal ? PESO_MAX_INTERNACIONAL : PESO_MAX_NACIONAL;
        return peso <= limite;
    }
}
