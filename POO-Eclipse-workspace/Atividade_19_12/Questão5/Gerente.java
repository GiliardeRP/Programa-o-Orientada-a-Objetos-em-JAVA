package Questão5;

public class Gerente extends Funcionario {
    int senha;
    int numeroDeFuncionariosGerenciados;

    @Override
    public double getBonificacao() {
        return this.salario * 0.15;
    }
    // ...
}
