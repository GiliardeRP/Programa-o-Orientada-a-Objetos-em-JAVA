package Questão5;

public class Mochilas {
	private String[] material = new String[3];
	private double[] pesoMax = new double[3];
	private double[] tipo = new double[3];
	
	
	public void setMaterial1(String material0) {
		this.material[0] = material0;
	}
	public void setMaterial2(String material1) {
		this.material[1] = material1;
	}
	public void setMaterial3(String material2) {
		this.material[2] = material2;
	}
	public void setPesoMax1(double peso0) {
	this.pesoMax[0] = peso0;
	}
	public void setPesoMax2(double peso1) {
	this.pesoMax[1] = peso1;
	}
	public void setPesoMax3(double peso2) {
	this.pesoMax[2] = peso2;
	}
	public void setTipo1(double tipo1) {
		this.tipo[0] = tipo1;
	}
	public void setTipo2(double tipo2) {
		this.tipo[1] = tipo2;
	}
	public void setTipo3(double tipo3) {
		this.tipo[2] = tipo3;
	}
	public void getMaterial1() {
		System.out.print("O material da mochila é:" + this.material[0]) ;
	}
	public void getMaterial2() {
		System.out.print("O material da mochila é:" + this.material[1]) ;
	}
	public void getMaterial3() {
		System.out.print("O material da mochila é:" + this.material[2]) ;
;
	}
	public double getPesoMax1() {
		return this.pesoMax[0];
	}
	public double getPesoMax2() {
		return this.pesoMax[1];
	}
	public double getPesoMax3() {
		return this.pesoMax[2];
	}
	public void getTipo1() {
		System.out.print("O tipo da mochila é:" + this.tipo[0] + "\nMochila de notebook.");
	}
	public void getTipo2() {
		System.out.print("O tipo da mochila é:" + this.tipo[1] + "\nMochila de viagem.");
	}
	public void getTipo3() {
		System.out.print("O tipo da mochila é:" + this.tipo[2] + "\nMochila de negócios.");
	}
	
	
	public void abrir(int tipo) {
		if(tipo == 1) {
			System.out.println("Abrindo a mochila de notebook...\n\nA mochila está aberta!" );
		}else if(tipo == 2) {
			System.out.println("Abrindo a mochila de viagem...\n\nA mochila está aberta!" );
		}else if(tipo == 3 ) {
			System.out.println("Abrindo a mochila de negócios...\n\nA mochila está aberta!" );
		}else {
			System.out.println("tipo invalido, por favor digite um tipo valido!");
		}
	}
	public void fechar() {
		System.out.println("Fechando a mochila...\n\nA mochila está fechada!");
	}
}
