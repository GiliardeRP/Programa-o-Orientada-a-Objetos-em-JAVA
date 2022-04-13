package Questão3;

public class Pessoa {
	private String nome, endereco, telefone;
	private Documentos doc;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Documentos getDoc() {
		return doc;
	}
	public void setDoc(Documentos doc) {
		this.doc = doc;
	}
}
