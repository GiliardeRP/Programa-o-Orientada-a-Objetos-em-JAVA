package Questão9_Moto;

public class Moto {
	public String modelo;
	public int veloMax, veloAtual=0;
	
	public void ligar() {
		System.out.printf("Modelo:" + this.modelo); 
		System.out.println("A moto esta ligada"); 
	}
	public void acelerar(int velo) {
		this.veloAtual += velo;
		if(this.veloAtual < this.veloMax) {
			System.out.print("Acelerando.... Velocidade atual de:" + this.veloAtual + "\n"); 
		}else {
			this.veloAtual = this.veloMax;
			System.out.print("Velocidade máxima atingida!!Nitro?\n"); 
		}
	}
	public void reduzir(int velo) {
		this.veloAtual -= velo;
		if(this.veloAtual > 0) {
			System.out.print("Reduzindo.... Velocidade atual de:" + this.veloAtual + "\n"); 
		}else {
			this.veloAtual = 0;
			System.out.print("Está parado.... Velocidade atual de:" + this.veloAtual); 
		}
	}
	public void nitro(int velo) {
		this.veloAtual += velo;
		System.out.print("#####-NITRO_ON-#####.... Velocidade atual de:" + this.veloAtual + "\n"); 
	}
}
