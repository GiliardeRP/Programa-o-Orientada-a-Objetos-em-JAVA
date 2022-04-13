package Questão1;

import java.util.Scanner;

public class Login {
	
	Scanner scan = new Scanner(System.in);
	
	private String nome, cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void cadastro() {
		
		System.out.println("Digite o nome:");
		setNome(scan.nextLine());
		System.out.println("Digite o cpf:");
		setCpf(scan.nextLine());
		
		
	}

}
