package Questão1_Cliente;

public class testeCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		c1.setNome("Carlos");
		c1.setEndereco("AvBrasil");
		c1.setOcupacao("Advogado");
		
		c2.setNome("Pedro");
		c2.setEndereco("RuaGuaruja");
		c2.setOcupacao("Engenheiro");
	}

}
