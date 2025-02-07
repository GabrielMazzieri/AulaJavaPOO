package exercicios.exercicio01;

public class Produto {
    String nomeProduto;
    float precoProduto;
    int qtdProduto;

    public Produto(String nomeProduto, float precoProduto, int qtdProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.qtdProduto = qtdProduto;
    }

    public void exibirDetalhes() {
        System.out.printf("Nome do produto: %s, Preço: %,.2f, Quantidade: %d",
                nomeProduto, precoProduto, qtdProduto);
    }

    public void atualizaEstoque(int atualizarEstoque) {
        if (atualizarEstoque < 0) {
            qtdProduto -= atualizarEstoque;
            System.out.printf("Valor atualizado para: %d", qtdProduto);
        } else if (atualizarEstoque > 0) {
            qtdProduto += atualizarEstoque;
            System.out.printf("Valor atualizado para: %d", qtdProduto);
        }
    }

    public void calcularValorEstoque() {
        float calculo = this.precoProduto + this.qtdProduto;
        System.out.println(calculo);
    }
}