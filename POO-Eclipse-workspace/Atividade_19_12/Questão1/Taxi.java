package Questão1;

public class Taxi extends Carro2{
	
	private String licenca;
	private double taxaAnual;
	
	public Taxi(String modelo, int velocidadeMaxima, Motor2 motor, double preco, String licenca,  double taxaAnual) {
	
		super(modelo, velocidadeMaxima, motor, preco);
		
		this.licenca = licenca;
		this.taxaAnual = taxaAnual;
	}
	
	public String getLicenca() {
		return licenca;
	}
	public void setLicenca(String licenca) {
		this.licenca = licenca;
	}
	public double getTaxaAnual() {
		return taxaAnual;
	}
	public void setTaxaAnual(double taxaAnual) {
		this.taxaAnual = taxaAnual;
	}
	public double getValorVenda() {
		double deprec = 0.75;
		return this.getPreco() * deprec;
		
	}

}
