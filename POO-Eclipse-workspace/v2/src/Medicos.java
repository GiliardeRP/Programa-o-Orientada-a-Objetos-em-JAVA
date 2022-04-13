import java.util.Scanner;

public class Medicos extends Funcionarios {
    
    Scanner scan = new Scanner(System.in);
	
	private long[] crm = new long[10];
	private String[] especialidade = new String[10];
	private String[] examePedido = new String[10];
	private Paciente paciente;
	private int idMedico = -1;
	private int inicioFila = -1, fimFila=0;
	int controle2;
	
	public Medicos(){
	    
	}
	
	public long  getCrm(int idMedico) {
		return crm[idMedico];
	}
	public void setCrm(long crm, int idMedico) {
		this.crm[idMedico] = crm;
	}
	public String getEspecialidade(int idMedico) {
		return especialidade[idMedico];
	}
	public void setEspecialidade(String especialidade, int idMedico) {
		this.especialidade[idMedico] = especialidade;
	}
	public String getExamePedido(int idMedico) {
		return examePedido[idMedico];
	}
	public void setExamePedido(String examePedido, int idMedico) {
		this.examePedido[idMedico] = examePedido;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public int getIdidMedico() {
		return idMedico;
	}
	public void setIdidMedico(int idMedico) {
		this.idMedico = idMedico;
	}
	public int getInicioFila() {
		return inicioFila;
	}
	public void setInicioFila(int inicioFila) {
		this.inicioFila = inicioFila;
	}
	public int getFimFila() {
		return fimFila;
	}
	public void setFimFila(int fimFila) {
		this.fimFila = fimFila;
	}
	public int getControle2(){
	    return controle2;
	}
	public void setControle2(int controle2){
	    this.controle2 = controle2;
	}
	
	public void cadastro() {
	    setIdidMedico(getIdidMedico()+1);
		System.out.println("[Pressione Enter]");
		scan.nextLine();
		limpaTela();
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\tCadastrando Médico");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Informe o nome:");
		setNome(scan.nextLine(), idMedico);
		System.out.println("\nInforme o cpf:     \nEX: 'XXX.XXX.XXX-XX'");
		setCpf(scan.nextLine(), idMedico);
		System.out.println("\nInforme a data de nacimento: \nEX: 'XX/XX/XXXX'");
		setDataNascimento(scan.nextLine(), idMedico);
		System.out.println("\nInforme o sexo: \nEX: 'M' ou 'F'");
		setSexo(scan.nextLine().charAt(0), idMedico);
		System.out.println("\nInforme o número para contato:");
		setTelefone(scan.nextLine(), idMedico);
		System.out.println("\nInforme os dias de atendimento: \nEX: 'segunda-quarta-sexta'");
		setDiaSemanaAtendimento(scan.nextLine(), idMedico);
		System.out.println("\nInforme o salário: ");
		setSalario(scan.nextFloat(), idMedico);
		System.out.println("\nInforme o número do CRM: ");
		setCrm(scan.nextLong(), idMedico);
		System.out.println("\nInforme a Especialidade:");
		scan.nextLine();
		setEspecialidade(scan.nextLine(), idMedico);
		
		preencherEndereco(idMedico); 
	}
	
	public void excluirCadastro() {
	    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Dr.(a): "+getNome(idMedico)+" foi removido(a) do sistema.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		setInicioFila(getInicioFila()+1);
	}
	
	public void listaAtendimento(Paciente paciente) {
		int j = paciente.getInicioFila(); //0 -> -1
		
		if(paciente.getInicioFila() == -1) {
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\tListando Pacientes");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("A lista está vazia!");
			System.out.println("______________________________\n\n");
		}
		else {
		    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\tListando Pacientes");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            for(int i = 0; i < paciente.getFimFila()+1; i++){
			    System.out.println("Paciente: " + i + " Nome: " + paciente.getNome(j) 
			        + " Altura: "+ paciente.getAltura(j) + " Peso: "+ paciente.getPeso(j) 
			        +" Sexo: "+ paciente.getSexo(j) + " Status: "+ paciente.getStatus(j));
			    j++;
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            /*for( int i = 1; i < 10; i++) {
				System.out.println("Paciente: " + i + " Nome: " + paciente.getNome(j) 
				    + " Altura: "+ paciente.getAltura(j) + " Peso: "+ paciente.getPeso(j) 
				    +" Sexo: "+ paciente.getSexo(j) + " Status: "+ paciente.getStatus(j));
				    j++;
			}*/
		}
	}

	public void atenderPaciente(Paciente paciente) {
		setControle2(paciente.getInicioFila());
		
		if(getControle2() == -1){
		    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\tAtendendo Paciente");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Não há pacientes para atender!");
			System.out.println("____________________________________");
		}
		else {
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\tAtendendo Paciente");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Paciente: "  + paciente.getNome(getControle2()) 
			+" Altura: "+ paciente.getAltura(getControle2()) 
			+" Peso: "+ paciente.getPeso(getControle2()) 
			+" Sexo: "+ paciente.getSexo(getControle2()));
			
			System.out.println("\nInforme o diagnóstico: ");
			paciente.setDiagnostico(scan.nextLine(), getControle2());
			
			System.out.println("\nInforme a medicação receitada: ");
			paciente.setMedicacaoReceitada(scan.nextLine(), getControle2());
			
			System.out.println("\nInforme o exame passado: ");
			paciente.setExamePedido(scan.nextLine(), getControle2());
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
			paciente.setControle(1,getControle2());
			
			setControle2(getControle2()+1);
			
			darAlta();
		}	
		
	}
	
	public void proximoPaciente(Paciente paciente) {
		 
		if(paciente.getInicioFila() == -1) {
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\tAtendendo Paciente");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Não há pacientes para atender!");
			System.out.println("____________________________________");
		}
		else {
		    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\tAtendendo Paciente");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Paciente: "  + paciente.getNome(controle2) 
			+" Altura: "+ paciente.getAltura(controle2) 
			+" Peso: "+ paciente.getPeso(controle2) 
			+" Sexo: "+ paciente.getSexo(controle2));
			
			System.out.println("Informe o diagnóstico: ");
			paciente.setDiagnostico(scan.nextLine(), controle2);
			
			System.out.println("\nInforme a medicação receitada: ");
			paciente.setMedicacaoReceitada(scan.nextLine(), controle2);
			
			System.out.println("\nInforme o exame passado: ");
			paciente.setExamePedido(scan.nextLine(), controle2);
			
			controle2 += 1;
		}	
		
	}
	
	public void darAlta(){
	    System.out.println("Dar alta para o paciente?\n1_Dar alta.\n2_Ir para o próximo");
		
		int i;
		i = scan.nextInt();
		if(i==1) {
			paciente.excluirCadastro();
		}
		setControle2(getControle2()+1);
	}
	
	public static void limpaTela(){
	    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
	
}