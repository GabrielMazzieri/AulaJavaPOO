package com.senai.aula4_heranca.exercicios.sistema_de_bibliotecas;

public class LivroFisico extends Livro {
    private int numPaginas;

    public LivroFisico(String titulo, String autor, int numPaginas) {
        super(titulo, autor);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void exibirDetalhes(){
        System.out.printf("\nTitulo: %s | Autor: %s | Número de Páginas: %d", getTitulo(), getAutor(), numPaginas);
    }
}

