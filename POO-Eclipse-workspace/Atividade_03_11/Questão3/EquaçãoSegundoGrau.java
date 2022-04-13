package Questão3;

	import java.util.Scanner;
	
public class EquaçãoSegundoGrau {
	Scanner scan = new Scanner(System.in);
	private double a, b, c, delta, x1, x2;
	
	
	public void setCoeficienteA(double a) {
		if(a==0) {
			this.a = 1;
		}else {
			this.a = a;
		}
	}
	public void setCoeficienteB(double b) {
		this.b = b;
	}
	public void setCoeficienteC(double c) {
		this.c = c;
	}
	
	public void Bhaskara() {
		double aux;
		aux = (Math.pow(this.b, 2) - 4*this.a*this.c);
		
		if(aux > 0) {
			this.delta = Math.sqrt(aux);
			this.x1 = ((-this.b + this.delta)/(2*a));
			this.x2 = ((-this.b - this.delta)/(2*a));
			System.out.printf("\nX1: " + this.x1 + "\nX2: " + this.x2);
		}else {
			System.out.println(aux);
			System.out.println("O Delta é Negativo, não possui raizes!!");
		}

	}
	
}
