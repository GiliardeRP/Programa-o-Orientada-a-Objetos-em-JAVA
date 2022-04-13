package Questão1;

public class testarCarro {

	public static void main(String[] args) {
		
		Condutor meuCondutor;
		Carro meuCarro;
		
		meuCondutor = new Condutor("123456-7");
		meuCarro = new Carro("kombi", new Motor2("Ford", 2.0, "Gasolina"));
		
		meuCondutor.dirigir(meuCarro);
	}

}
