package Questão4;

import java.util.Scanner;


public class Poligonos {
		
	Scanner scan = new Scanner(System.in);
	private int area, lados;
	private String nome ;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getLados() {
		return lados;
	}
	public void setLados(int lados) {
		this.lados = lados;
	}
	
	public void definaPoligono() {
		System.out.println("Digite a Area:");
		this.nome = scan.next();
		setLados(0);
		
	}
	
}
