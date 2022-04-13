
public class Enfermeiro extends Funcionarios{
	
	private Paciente paciente;
	private int idEnfermeiro=-1;
	private int inicioFila=-1, fimFila=-1;
	private int controle2;
	private Medicamentos remed;
	private Medicos medico;
	
	public Enfermeiro(){
	    
	}
	
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public int getIdEnfermeiro(){
	    return this.idEnfermeiro;
	}
	public void setIdEnfermeiro(int idEnfermeiro){
	    this.idEnfermeiro = idEnfermeiro;
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
	public Medicamentos getRemid() {
		return remed;
	}
	public void setRemid(Medicamentos remed) {
		this.remed = remed;
	}
	public Medicos getMedico(){
	    return medico;
	}
	public void setMedico(Medicos medico){
	    this.medico = medico;
	}
	
	public void cadastro() {
		setIdEnfermeiro(getIdEnfermeiro()+1);
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\tCadastrando Enfermeiro");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Informe o nome:");
		setNome(scan.nextLine(), idEnfermeiro);
		System.out.println("\nInforme o cpf:     \nEX: 'XXX.XXX.XXX-XX'");
		setCpf(scan.nextLine(), idEnfermeiro);
		System.out.println("\nInforme a data de nascimento: \nEX: 'XX/XX/XXXX'");
		setDataNascimento(scan.nextLine(), idEnfermeiro);
		System.out.println("\nInforme o sexo: \nEX: 'M' ou 'F'");
		setSexo(scan.nextLine().charAt(0), idEnfermeiro);
		System.out.println("\nInforme o número para contato:");
		setTelefone(scan.nextLine(),idEnfermeiro);
		System.out.println("\nInforme os dias de atendimento: \nEX: 'segunda-quarta-sexta'");
		setDiaSemanaAtendimento(scan.nextLine(),idEnfermeiro);
		System.out.println("\nInforme o salário: ");
		setSalario(scan.nextFloat(),idEnfermeiro);
		
		preencherEndereco(idEnfermeiro); 
		
	}
	
	public void excluirCadastro() {
	    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Enfermeiro(a): "+getNome(idEnfermeiro)+" foi removido(a) do sistema.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		setInicioFila(getInicioFila()+1);
	}
	
	public void listaAtendimento(Paciente paciente) {
		int j = paciente.getInicioFila();
		
		if(paciente.getInicioFila() == -1) {
			System.out.println("A lista está vazia!");
		}
		else {
            for( int i = 1; i < 10; i++) {
			System.out.println("Paciente: " + i +" Nome: " + paciente.getNome(j) 
				+" Altura: "+ paciente.getAltura(j) 
				+" Peso: "+ paciente.getPeso(j) 
				+" Sexo: "+ paciente.getSexo(j) 
				+" Status: "+ paciente.getStatus(j));
				j++;
            }
		}
	}
	
	public void atenderPaciente(Paciente paciente, Medicamentos remed) {
		setControle2(paciente.getInicioFila());
		
		if(getControle2() == -1) {
			System.out.println("NÃo há pacientes para atender!");
        }
		else if(getInicioFila() < 0 && getFimFila() < 0){
		    System.out.println("NÃo há enfermeiros para realizar atendimento!");
		}
		else{
			System.out.println("Paciente: "  + paciente.getNome(getControle2()) 
                +" Altura: "+ paciente.getAltura(getControle2()) 
				+" Peso: "+ paciente.getPeso(getControle2()) 
                +" Sexo: "+ paciente.getSexo(getControle2()));
            System.out.println("Diagnóstico: " + paciente.getDiagnostico(getControle2()));
            System.out.println("Precisa ser adiministrada a seguinte medicação: ");
            System.out.println(paciente.getMedicacaoReceitada(getControle2()));
			
            remed.admininstrarMedicamento();
			
			/*System.out.println("Dar alta para o paciente ou ir para o prÃ³ximo ?\n1_Dar alta.\n2_Ir para o prÃ³ximo");
			
			int i;
			i = scan.nextInt();
			if(i==1) {
				paciente.excluirCadastro();
			}
			
			setControle2(getControle2()+1);*/
			
			System.out.println("Solicitar alta para o paciente ou ir para o próximo ?\nSolicitar alta.\n2_Ir para o próximo");
			int i;
			i = scan.nextInt();
			if(i==1) {
				medico.darAlta();
			}
			
			setControle2(getControle2()+1);
		}	
		
	}
}