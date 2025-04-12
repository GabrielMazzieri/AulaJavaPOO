package com.senai.aula6_abstracao.exercicios.sistema_padronizado_de_checkin;

public class CompanhiaAerea implements AppFlySecure {
    @Override
    public void validarDocumento(String documento) {
        if (documento == null || documento.length() < 5){
            System.out.println("Documento Inválido.");
        } else {
            System.out.println("Documento Validado");
        }
    }

    @Override
    public void emitirCartao(String nome) {
        System.out.printf("Cartão de Embarque emitido para: %s \n", nome);
        exibirMsgSeguranca();
    }

    public void verificarBagagem(double peso, boolean vooInternacional){
        if(pesoBagagem(peso, vooInternacional)){
            System.out.println("Bagagem Validada e no limite!");
        } else{
            System.out.println("Bagagem em Excesso.");
        }
    }

}
