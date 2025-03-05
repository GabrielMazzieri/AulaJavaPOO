package aula3_encapsulamento.exercicios.exercicio3;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        setNome(nome);
        setSalario(salario);
        setCargo(cargo);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        if (nome == null || nome.isEmpty()){
            throw new RuntimeException("ERRO: Deve ter um nome.");
        } else {
            this.nome = nome;
        }
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario) {
        if (salario>=1320.00) {
            this.salario = salario;
        } else {
            throw new RuntimeException("ERRO: Salário menor que R$1320,00");
        }
    }

    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo) {
        if (cargo.equals("Gerente") || cargo.equals("Analista") || cargo.equals("Programador")){
          this.cargo = cargo;
        } else {
            throw new RuntimeException("Necessário ser um dos seguintes cargos: Gerente, Analista ou Programador.");
        }
    }

    public void aumentoSalario(double porcentagem){
        if(porcentagem>0){
            double aumento = salario * porcentagem/100;
            salario += aumento;
            System.out.println("Valor aplicado. Salário atualizado para: "+salario);
        }else {
            throw new RuntimeException("ERRO: Valor da porcentagem inválido");
        }
    }

    public void visualizar() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$" + salario);
        System.out.println("Cargo: " + cargo);
    }

}
