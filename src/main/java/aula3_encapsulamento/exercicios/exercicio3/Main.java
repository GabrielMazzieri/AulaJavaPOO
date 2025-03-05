package aula3_encapsulamento.exercicios.exercicio3;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(
                "Gabriel",
                1320.00,
                "Gerente");

        funcionario1.visualizar();
        funcionario1.aumentoSalario(50);
        funcionario1.visualizar();
    }


}
