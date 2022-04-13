package Questão2;

public class Lapis {
	private String tipo;
	private String cor;
	private String texto;
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Lapis(String tipo, String cor) {
		this.tipo = tipo;
		this.cor = cor;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void escrever(String texto) {
		this.texto = texto;
		System.out.println("....ESCREVENDO....\n" + this.texto);
	}
}
