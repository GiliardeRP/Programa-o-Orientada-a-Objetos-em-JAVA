package Questão1;

public class Condutor {
	private String codHabilitacao;
	
	public Condutor(String codHabilitacao) {
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
