package Questão1;

public class Condutor2 extends Pessoa{
	
	private String codHabilitacao;
	
	
	public Condutor2(String codHabilitacao, String nome, char sexo, int idade) {
		
		super(nome, sexo, idade);
		
		this.codHabilitacao = codHabilitacao;
	}
	

	public String getCodHabilitacao() {
		return codHabilitacao;
	}

	public void setCodHabilitacao(String codHabilitacao) {
		this.codHabilitacao = codHabilitacao;
	}
	
	public void dirigir(Carro2 carro) {
		System.out.println("Condutor" + getCodHabilitacao() + " dirigindo um carro");
		System.out.println("É um modelo: " + carro.getModelo());
		System.out.println("Motor: " + carro.get().getCilindrada());
		
	}
	

}
