package Questão5_ContaCorrente;

public class ContaCorrente {
	private int id;
	private double saldo;
	private String nomeDoProprietario;
	
	public void setNome(String nome) {
		this.nomeDoProprietario = nome;
		System.out.print("\nO nome do proprietario da conta: " + this.nomeDoProprietario + " foi registrado!\n");
	}
	public void setId(int id) {
		this.id = id;
		System.out.print("O id da conta: " + this.id + " foi registrado!\n");
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
		System.out.print("O Saldo da conta: R$" + this.saldo + " foi registrado!\n");
	}
}
