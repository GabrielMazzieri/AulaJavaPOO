package aula3_encapsulamento.exercicios.exercicio1;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome,double preco ) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco) {
        if(preco >= 0) {
            this.preco = preco;
        } else {
            throw new IllegalArgumentException("O valor do produto não pode ser negativo");
        }
    }
}
