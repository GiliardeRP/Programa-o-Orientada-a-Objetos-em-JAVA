package Questão2;

public class Carro extends Veiculo {
	
	
	private String modelo;
	private String motor;
	private String marca;
	private String capacidadeCombustivel;
	
	public Carro(String tipo, String efetividade, String forcaMotriz, String funcao, double peso,
				 String modelo, String motor, String marca, String capacidadeCombustivel) {
			
		super(tipo, efetividade, forcaMotriz, funcao, peso);
		
		this.modelo = modelo;
		this.motor = motor;
		this.marca = marca;
		this.capacidadeCombustivel = capacidadeCombustivel;
		
	}
	
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}
	public void setCapacidadeCombustivel(String capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	}
	
}
