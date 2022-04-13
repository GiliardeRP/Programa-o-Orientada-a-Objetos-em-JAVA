package Questão2;

public class testarVeiculo {

	public static void main(String[] args) {
		//String tipo, String efetividade, String forcaMotriz, String funcao, double peso
		Veiculo meuVeiculo = new Veiculo("Terrestre", "Alta", "Mecanica à Combustão","Transportar", 1590.68);
		
		System.out.println(meuVeiculo.getTipo());
		System.out.println(meuVeiculo.getFuncao());
		
		
		
		
	}

}
