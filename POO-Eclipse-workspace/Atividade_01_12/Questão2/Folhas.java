package Questão2;

public class Folhas {
	private String tipo;
	private int quantidade;
	private Borrachas borracha;
	
	public Borrachas getBorracha() {
		return borracha;
	}


	public void setBorracha(Borrachas borracha) {
		this.borracha = borracha;
	}


	public Lapis getLapis() {
		return lapis;
	}


	public void setLapis(Lapis lapis) {
		this.lapis = lapis;
	}
	private Lapis lapis;
	
	public Folhas(String tipo, int quantidade, Lapis lapis, Borrachas borracha) {
		this.tipo = tipo;
		this.quantidade = quantidade;
		this.borracha = borracha;
		this.lapis = lapis;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
