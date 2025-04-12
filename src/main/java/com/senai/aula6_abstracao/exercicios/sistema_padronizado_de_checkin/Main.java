package com.senai.aula6_abstracao.exercicios.sistema_padronizado_de_checkin;

public class Main {
    public static void main(String[] args) {

        AppFlySecure.exibirMsgBoasVindas();
        CompanhiaAerea AsasAirLines = new CompanhiaAerea();
        AsasAirLines.validarDocumento("12aBc");
        AsasAirLines.verificarBagagem(30, true);
        AsasAirLines.emitirCartao("Gabriel Mazzieri");
    }
}
