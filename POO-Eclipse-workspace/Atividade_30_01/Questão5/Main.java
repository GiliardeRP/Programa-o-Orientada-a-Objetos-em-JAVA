package Quest�o5;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	//	Banco banco = new Banco();
	
	//	System.out.println("Digite o nome do banco: ");
	//	banco.setNomeBanco(scan.nextLine());
		
		
		Banco pessoa = new Pessoa();
		
		System.out.println("Digite o nome do banco: ");
		pessoa.setNomeBanco(scan.next());
		
		
		//CLASSE ABSTRATA � UMA CLASSE QUE N�O PODE SER INSTANCIADA DIRETAMENTE, ELA NECESSITA QUE UMA SUB-CLASSE A INSTANCIE.
		// O ATRIBUTO "ABSTRACT" TAMB�M PODE SER UTILIZADO EM METODOS EM SUPER CLASSES OBRIGANDO AS SUB-CLASSER A TER OS METODOS COM O ATRIBUTO "ABSTRACT". 
		
		
	}

}
