package Quest�o2;

public class testarVeiculo {

	public static void main(String[] args) {
		//String tipo, String efetividade, String forcaMotriz, String funcao, double peso
		Veiculo meuVeiculo = new Veiculo("Terrestre", "Alta", "Mecanica � Combust�o","Transportar", 1590.68);
		
		System.out.println(meuVeiculo.getTipo());
		System.out.println(meuVeiculo.getFuncao());
		
		
		
		
	}

}
