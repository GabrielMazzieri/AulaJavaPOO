package com.senai.aula6_abstracao.exemplos.exemplos_interface.aparelho_smartwatch;

public class Main {
    public static void main(String[] args) {
        SmartWatch smartWatch = new SmartWatch();

        smartWatch.contarPassos();
        smartWatch.medirFrequenciaCardiaca();
        smartWatch.medirQualidadedeSono();
        smartWatch.exibirInfoDispositivos();
    }
}
