package Questão2;

public class Veiculo extends Maquina{
	private String tipo;
	private String efetividade;
	private String forcaMotriz;
	
	public Veiculo(String tipo, String efetividade, String forcaMotriz, String funcao, double peso){
		
		super(funcao, peso);
		
		this.tipo = tipo;
		this.efetividade = efetividade;
		this.forcaMotriz = forcaMotriz;
		
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getEfetividade() {
		return efetividade;
	}
	public void setEfetividade(String efetividade) {
		this.efetividade = efetividade;
	}
	public String getForcaMotriz() {
		return forcaMotriz;
	}
	public void setForcaMotriz(String forcaMotriz) {
		this.forcaMotriz = forcaMotriz;
	}
	
}
