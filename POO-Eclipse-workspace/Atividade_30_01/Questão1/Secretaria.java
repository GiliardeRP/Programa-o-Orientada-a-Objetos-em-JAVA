package Questão1;

public class Secretaria extends Login {
	
	private long id;
	private String função, setor;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFunção() {
		return função;
	}
	public void setFunção(String função) {
		this.função = função;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}

	public void cadastro() {
		System.out.println("Digite o nome:");
		setNome(scan.nextLine());
		System.out.println("Digite o cpf:");
		setCpf(scan.nextLine());
		System.out.println("Digite o id:");
		this.id = scan.nextLong();
		System.out.println("Digite a função:");
		this.função = scan.next();
		System.out.println("Digite o setor:");
		this.setor = scan.next();
	}
}
