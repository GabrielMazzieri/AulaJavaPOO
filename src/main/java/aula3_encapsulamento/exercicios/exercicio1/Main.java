package aula3_encapsulamento.exercicios.exercicio1;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Gabriel", 8);

        System.out.println(produto1.getNome());
        produto1.setPreco(-1);
        System.out.println(produto1.getPreco());


    }
}
