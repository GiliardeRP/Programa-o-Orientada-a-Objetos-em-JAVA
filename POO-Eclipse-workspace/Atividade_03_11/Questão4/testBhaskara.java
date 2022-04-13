package Questão4;

import java.util.Scanner;

public class testBhaskara {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		CalculodeBhaskara c = new CalculodeBhaskara();
		
		//X2 – 3X + 2. Obs. X2 é X ao quadrado.
		//RESULTADO X1 = 2 && X2 = 1
		
		System.out.println("Digite o coeficiente A: ");
		double recebA, recebB, recebC;
		recebA = scan.nextDouble();
	
		c.setCoeficienteA(recebA);
 	
		System.out.println("Digite o coeficiente B: ");
		recebB = scan.nextDouble();
		
		c.setCoeficienteB(recebB);		
		
		System.out.println("Digite o coeficiente C: ");
		recebC = scan.nextDouble();
		
		c.setCoeficienteC(recebC);		
		
		c.Calcular();
		
	}
}