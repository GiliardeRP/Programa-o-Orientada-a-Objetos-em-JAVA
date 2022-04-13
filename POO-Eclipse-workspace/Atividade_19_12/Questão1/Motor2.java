package Questão1;

public class Motor2 {
	private String fabricante;
	private double cilindrada;
	private String combustível;
	
	public Motor2(String fabricante, double cilindrada, String combustivel) {
		this.fabricante = fabricante;
		this.cilindrada = cilindrada;
		this.combustível = combustivel;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getCombustível() {
		return combustível;
	}

	public void setCombustível(String combustível) {
		this.combustível = combustível;
	}
}
