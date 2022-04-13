package Questão8_MedicoPaciente;

public class testeMP_Consulta {
		public static void main(String[] args) {
			Pacientes p1 = new Pacientes();
			Medicos m1 = new Medicos();
			
			
			p1.setNome("Hiago");
			p1.setEndereco("AvBrasil");
			p1.setIdade(25);
			
			m1.setNome("João");
			m1.setIdade(45);
			m1.setEndereco("RuaBarbaBranca");
			
			p1.getBuscaPaciente();
			m1.getBuscaMedicos();
			
			/*SIM, A PROPRIA CONSULTA PODERIA SER UMA CLASSE POIS PODERIA VER PASCIENTES E MEDICOS COMO OBJETO E COLOCALOS EM UMA 
			CLASSE DE PESSOAS.*/
	}
}
