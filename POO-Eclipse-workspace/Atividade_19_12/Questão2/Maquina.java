package Questão2;

public class Maquina {
	private String funcao;
	private double peso;
	
	
	public Maquina(String funcao, double peso) {
		this.funcao = funcao;
		this.peso = peso;
	}
	

	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
