package Questão1;

public class Carro {
	private String modelo; 
	private int velocidadeMaxima, velocidadeAtual;
	private Motor2 motor;
	
	public Motor2 get() {
		return motor;
	}
	public void setMotor(Motor2 motor) {
		this.motor = motor;
	}
	public Carro() {
		this.modelo = "Carro Qualquer";
		this.velocidadeMaxima = 120;
		this.velocidadeAtual = 0;
	}
	public Carro(String modelo, Motor2 motor) {
		this.modelo = modelo;
		this.motor = motor;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return this.modelo;
	}
	public void ligarCarro() {
		System.out.println(" O carro está ligado.");
	}
	public void desligarCarro() {
		System.out.println("O carro está desligado");
	}
	public void acelera(int veloc) {
		if(this.velocidadeAtual + veloc <= this.velocidadeMaxima) {
			this.velocidadeAtual += veloc;
			System.out.println("acelerando, Velicidade Atual: " + this.velocidadeAtual);
		}else {
			this.velocidadeAtual = this.velocidadeMaxima;
			System.out.println("Velocidade maxima atingida! \n" + "Velocidade atual: " + this.velocidadeAtual);
		}
	}
	public void reduzir(int veloc) {
		if((this.velocidadeAtual - veloc) > 0) {
			this.velocidadeAtual -= veloc;
			System.out.println("O carro parou, Velocidade Atual: " + this.velocidadeAtual);
			
		}
	}
	

}
