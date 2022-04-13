package Questão1;

public class Carro2 {
	private String modelo; 
	private int velocidadeMaxima, velocidadeAtual;
	private Motor2 motor;
	private double preco;
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Motor2 get() {
		return motor;
	}
	public void setMotor(Motor2 motor) {
		this.motor = motor;
	}
	public Carro2() {
		this.modelo = "Carro Qualquer";
		this.velocidadeMaxima = 120;
		this.velocidadeAtual = 0;
	}
	public Carro2(String modelo, Motor2 motor) {
		this.modelo = modelo;
		this.motor = motor;
	}
	
	public Carro2(String modelo2, int velocidadeMaxima2, Motor2 motor2, double preco) {
		this.modelo = modelo2;
		this.velocidadeMaxima = velocidadeMaxima2;
		this.motor = motor2;
		this.preco = preco;
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
	public double getValorVenda() {
		double deprec = 0.90;
		return preco * deprec;
	}
	

}
