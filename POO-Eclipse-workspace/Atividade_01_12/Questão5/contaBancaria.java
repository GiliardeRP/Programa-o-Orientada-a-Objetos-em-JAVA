package Questão5;

public class contaBancaria {
	private int codConta;
	private double saldo, limiteDeCredito;
	private String proprietario, dataDeAbertura;
	
	public int getCodConta() {
		return codConta;
	}
	public void setCodConta(int codConta) {
		this.codConta = codConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimiteDeCredito() {
		return limiteDeCredito;
	}
	public void setLimiteDeCredito(double limiteDeCredito) {
		this.limiteDeCredito = limiteDeCredito;
	}
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	public String getDataDeAbertura() {
		return dataDeAbertura;
	}
	public void setDataDeAbertura(String dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}
	
	public void saldo() {
		System.out.println("Seu saldo é de : " + this.saldo);
	}
	
	public void depositar(Double valor){
		this.saldo += valor;
		saldo();
	}
	public void sacar(Double valor) {
		this.saldo -= valor;
		saldo();
	}
	
}
