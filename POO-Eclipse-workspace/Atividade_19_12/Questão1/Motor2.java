package Quest�o1;

public class Motor2 {
	private String fabricante;
	private double cilindrada;
	private String combust�vel;
	
	public Motor2(String fabricante, double cilindrada, String combustivel) {
		this.fabricante = fabricante;
		this.cilindrada = cilindrada;
		this.combust�vel = combustivel;
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

	public String getCombust�vel() {
		return combust�vel;
	}

	public void setCombust�vel(String combust�vel) {
		this.combust�vel = combust�vel;
	}
}
