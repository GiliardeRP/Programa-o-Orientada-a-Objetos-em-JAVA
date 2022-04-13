package Questão6;

public class Funcionario {
	
	private int numeroFilhos, codFuncionario;
	private String nome, sobreNome, endereco, rg, cpf, dataDeAdmição, salario;
	private Trabalho trabalho;
	private Sindicato sindicato;
	
	
	
	public Trabalho getTrabalho() {
		return trabalho;
	}
	public void setTrabalho(Trabalho trabalho) {
		this.trabalho = trabalho;
	}
	public Sindicato getSindicato() {
		return sindicato;
	}
	public void setSindicato(Sindicato sindicato) {
		this.sindicato = sindicato;
	}
	public int getCodFuncionario() {
		return codFuncionario;
	}
	public void setCodFuncionario(int codFuncionario) {
		this.codFuncionario = codFuncionario;
	}
	public int getNumeroFilhos() {
		return numeroFilhos;
	}
	public void setNumeroFilhos(int numeroFilhos) {
		this.numeroFilhos = numeroFilhos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataDeAdmição() {
		return dataDeAdmição;
	}
	public void setDataDeAdmição(String dataDeAdmição) {
		this.dataDeAdmição = dataDeAdmição;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	
	
}
