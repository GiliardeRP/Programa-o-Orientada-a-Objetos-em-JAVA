package Quest�o1;

public class Secretaria extends Login {
	
	private long id;
	private String fun��o, setor;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFun��o() {
		return fun��o;
	}
	public void setFun��o(String fun��o) {
		this.fun��o = fun��o;
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
		System.out.println("Digite a fun��o:");
		this.fun��o = scan.next();
		System.out.println("Digite o setor:");
		this.setor = scan.next();
	}
}
