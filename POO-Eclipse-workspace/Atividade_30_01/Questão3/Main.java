package Quest�o3;

public class Main {
	
	public static void main(String[] args) {
		
		Veiculo carro = new Carro();
		
		Veiculo moto = new Veiculo();
		
		Veiculo barco = new Barco();
		
		
		
		if( carro instanceof Carro) {
			System.out.println("� do tipo carro");	
		}
		if( moto instanceof Veiculo) {
			System.out.println("� do tipo moto");	
		}if( barco instanceof Barco) {
			System.out.println("� do tipo barco");	
		}
		if( carro instanceof Veiculo) {
			System.out.println("� do tipo veiculo");
		}
		
		//INSTANCEOF � UM OPERADOR QUE SERVE PARA VERIFICAR SE O OBJETO EM QUEST�O � INSTANCIA DE UMA DETERMINADA CLASSE.
		
	}
	
}
