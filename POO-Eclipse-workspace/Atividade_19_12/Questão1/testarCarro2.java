package Questão1;

public class testarCarro2 {

	public static void main(String[] args) {
		
		
	Motor2 motor = new Motor2("Ford", 2.0, "Gasolina");	
	//Carro2 meuCarro = new Carro2("Fusca Verde", 120, motor, 10000);
	
	//System.out.println(meuCarro.getValorVenda());


	Carro2 carro = new Taxi("Fiat", 100, motor, 10000, "123-x", 120);
	
	System.out.println(((Taxi)carro).getValorVenda());
	
	//((Taxi)carro).getValorVenda();
	
	}
	

}
