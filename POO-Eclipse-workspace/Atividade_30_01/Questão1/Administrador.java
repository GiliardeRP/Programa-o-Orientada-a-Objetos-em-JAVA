package Questão1;

public class Administrador extends Login{
	
	private long cdAdm;
	private String subordinados;
	public long getCdAmd() {
		return cdAdm;
	}
	public void setCdAmd(long cdAmd) {
		this.cdAdm = cdAmd;
	}
	public String getSubordinados() {
		return subordinados;
	}
	public void setSubordinados(String subordinados) {
		this.subordinados = subordinados;
	}
	
	public void cadastro() {
		
		System.out.println("Digite o nome:");
		setNome(scan.nextLine());
		System.out.println("Digite o cpf:");
		setCpf(scan.nextLine());
		System.out.println("Digite o codigo de adiministrador:");
		this.cdAdm = scan.nextLong();
		System.out.println("Digite o nome do subordinado");
		this.subordinados = scan.next();
		
	}

}
