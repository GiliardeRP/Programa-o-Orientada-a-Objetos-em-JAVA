package Questão2_Produto;

public class Produto {
	public int id;
	public double preco;
	public String nome, marca, fornecedor;
	
	
	public void nomeProduto(String nome) {
		this.nome = nome;
		System.out.printf("\nO nome do produto: " + nome + " foi registrado!");
	}
	public void idProduto(int id) {
		this.id = id;
		System.out.printf("\nO id do produto: " + id + " foi registrado!");

	}
	public void precoProduto(double preco) {
		this.preco = preco;
		System.out.printf("\nO preco do produto: R$" + preco + " foi registrado!\n");

	}
}
