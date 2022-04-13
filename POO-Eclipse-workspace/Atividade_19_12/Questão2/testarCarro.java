package Questão2;

public class testarCarro {

	public static void main(String[] args) {
		//String tipo, String efetividade, String forcaMotriz, String funcao, double peso,
		// String modelo, String motor, String marca, int capacidadeCombustivel
		
		Carro meuCarro = new Carro("Terrestre", "Efetividade: Alta", "Mecanica à Combustão","Transportar", 1590.68, 
								   "Modelo: Super Esportivo", "Motor: V12--1.450 Cavalos--5.8", "Lamborghini", "34,7 Litros");
		
			System.out.println(meuCarro.getPeso() + " Kl/g");
			System.out.println(meuCarro.getEfetividade());
			System.out.println(meuCarro.getModelo());
			System.out.println(meuCarro.getMotor());
			System.out.println(meuCarro.getCapacidadeCombustivel());
	}

}
