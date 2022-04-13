package Questão3_Funcionario;

public class Funcionario {
	private int numeroFilhos;
	private String nome, sobreNome, endereco, ocupacao;
	
	public void setNome(String nome) {
		this.nome = nome;
		System.out.print("\nO nome do funcionario: " + this.nome + " foi registrado!\n");
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
		System.out.print("O endereco do funcionario: " + this.endereco + " foi registrado!\n");
	}
	public void setNumeroFilhos(int numeroFilhos) {
		this.numeroFilhos = numeroFilhos;
		System.out.print("O numero de  filhos do funcionario: " + this.numeroFilhos + " foi registrado!\n");
	}
}
