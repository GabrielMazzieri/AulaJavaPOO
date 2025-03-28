package com.senai.aula4_heranca.exercicios.sistema_de_bibliotecas;

public class LivroDigital extends LivroFisico {
    private double tamanhoArquivo;

    public LivroDigital(String titulo, String autor, int numPaginas, double tamanhoArquivo) {
        super(titulo, autor, numPaginas);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public void exibirDetalhes(){
        System.out.printf("\nTitulo: %s | Autor: %s | Número de Páginas: %d | Tamanho de Arquivo: %,.2fMB", getTitulo(), getAutor(), getNumPaginas(), tamanhoArquivo);
    }
}


