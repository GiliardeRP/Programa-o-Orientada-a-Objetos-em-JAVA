package Questão1;

public class Pessoa {
	private String nome;
	private char sexo;
	private int idade;
	
	public Pessoa(String nome2, char sexo2, int idade2) {
		
		this.nome = nome2;
		this.sexo = sexo2;
		this.idade = idade2;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if(idade>=0) {
			this.idade = idade;
		}else {
			this.idade=0;
		}
	}

}
