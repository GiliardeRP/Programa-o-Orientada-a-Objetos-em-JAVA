package Quest�o2;

public class TesteALL {
	
	public static void main(String[] args) {
		
		
		Folhas minhasFolhas = new Folhas("A4", 50, new Lapis("Grafite", "Preto"), new Borrachas("Branca", "M�dia"));
		
		System.out.println("Tipo de folha: " + minhasFolhas.getTipo() + "\nQuantidade: " + minhasFolhas.getQuantidade());
		System.out.println("\nTipo de Lapis: " + minhasFolhas.getLapis().getTipo() + "\nCor: " + minhasFolhas.getLapis().getCor());
		System.out.println("\nCor da borracha: " + minhasFolhas.getBorracha().getCor() + "\nTamanh: " + minhasFolhas.getBorracha().getTamanho() + "\n\n");
		

		// TESTANDO METODOS E FUN��ES
		
		minhasFolhas.getLapis().escrever("IF Baiano � uma escola renomada!");
		
		System.out.println("\n" + minhasFolhas.getLapis().getTexto());
		
		minhasFolhas.getBorracha().apagar(minhasFolhas);
		
		
		System.out.println(minhasFolhas.getLapis().getTexto());

		
		
	}
}
