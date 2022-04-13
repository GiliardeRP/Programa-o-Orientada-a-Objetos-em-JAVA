package Questão3;

public class Main {
	
	public static void main(String[] args) {
		
		Veiculo carro = new Carro();
		
		Veiculo moto = new Veiculo();
		
		Veiculo barco = new Barco();
		
		
		
		if( carro instanceof Carro) {
			System.out.println("é do tipo carro");	
		}
		if( moto instanceof Veiculo) {
			System.out.println("é do tipo moto");	
		}if( barco instanceof Barco) {
			System.out.println("é do tipo barco");	
		}
		if( carro instanceof Veiculo) {
			System.out.println("é do tipo veiculo");
		}
		
		//INSTANCEOF É UM OPERADOR QUE SERVE PARA VERIFICAR SE O OBJETO EM QUESTÃO É INSTANCIA DE UMA DETERMINADA CLASSE.
		
	}
	
}
