package Questão2;

public class Borrachas {
	private String cor;
	private String tamanho;
	private Lapis lapis;
	
	public Lapis getLapis() {
		return lapis;
	}
	public void setLapis(Lapis lapis) {
		this.lapis = lapis;
	}
	public Borrachas(String cor, String tamanho) {
		this.cor = cor;
		this.tamanho = tamanho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public void apagar(Folhas minhasFolhas) {
		System.out.println(".....Apagando.....");
		minhasFolhas.getLapis().setTexto("APAGOU");

		
	}

}
