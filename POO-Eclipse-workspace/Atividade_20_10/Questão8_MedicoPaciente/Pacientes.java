package Quest�o8_MedicoPaciente;

public class Pacientes {
	
		private int idade;
		private String nome, endereco;
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public void getBuscaPaciente() {
			System.out.print("\nNome: " + this.nome + "\nIdade: " + this.idade + "\nEndere�o: " + this.endereco);
		}
}	
