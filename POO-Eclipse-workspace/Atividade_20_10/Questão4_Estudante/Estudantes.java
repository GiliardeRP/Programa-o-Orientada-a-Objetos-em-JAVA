package Questão4_Estudante;

public class Estudantes {
	private int idade;
	private String nome, sobreNome, endereco, anoEscolar;
	
	public void setNome(String nome) {
		this.nome = nome;
		System.out.print("\nO nome do Aluno: " + this.nome + " foi registrado!\n");
	}
	public void setAnoEscolar(String anoEscolar) {
		this.anoEscolar = anoEscolar;
		System.out.print("O ano escolar: " + this.anoEscolar + " foi registrado!\n");
	}
	public void setIdade(int idade) {
		this.idade = idade;
		System.out.print("A idade: " + this.idade + " foi registrado!\n");
	}
	
}
