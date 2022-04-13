package Questão1_Cliente;

public class Cliente {
	private int telefone;
	private String nome;
	private String sobreNome;
	private String endereco;
	private String ocupacao;	



public void setNome(String nome) {
	this.nome = nome;
	System.out.printf("\nO nome do cliente: " + this.nome + " foi registrado!");
	}
public void setEndereco(String endereco) {
	this.endereco = endereco;
	System.out.printf("\nO endereco do cliente: " + this.endereco + " foi registrado!");
	}
public void setOcupacao(String ocupacao) {
	this.ocupacao = ocupacao;
	System.out.printf("\nA ocupacao do cliente: " + this.ocupacao + " foi registrado!\n");
	}

}
