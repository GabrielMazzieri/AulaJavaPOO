package com.senai.aula6_abstracao.exemplos.controle_equipamentos_inteligentes;

public class TVSmart implements AparelhosInteligentes{
    private int volume;
    public TVSmart() {
        this.volume = 0;
    }
    @Override
    public void ligar() {
        System.out.println("TVSmart Ligada");
    }
    @Override
    public void desligar() {
        System.out.println("TVSmart Desligada");
    }
    public void aumentarVolume(){
        System.out.printf("Volume %d\n", volume = ajusteNivel(volume,1));
    }
    public void baixarVolume(){
        System.out.printf("Volume %d\n", volume = ajusteNivel(volume,-1));
    }
}
