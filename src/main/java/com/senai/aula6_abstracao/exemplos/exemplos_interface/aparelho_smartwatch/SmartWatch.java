package com.senai.aula6_abstracao.exemplos.exemplos_interface.aparelho_smartwatch;

public class SmartWatch implements SensorCardiaco, SensorPassos, SensorSono {
    @Override
    public void medirFrequenciaCardiaca() {
        System.out.println("Medição Cardiaca: 90BPM");
    }

    @Override
    public void contarPassos() {
        System.out.println("Passos Hoje: 2400 Passos");
    }

    @Override
    public void medirQualidadedeSono() {
        System.out.println("Qualidade de Sono: 8h, Qualidade: Sono Agradavel");
    }

    public void exibirInfoDispositivos(){
        System.out.println("Dispositivo Conectado...");
    }
}
