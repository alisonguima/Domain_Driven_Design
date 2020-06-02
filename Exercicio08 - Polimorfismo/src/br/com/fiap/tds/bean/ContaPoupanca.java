package br.com.fiap.tds.bean;

public class ContaPoupanca extends ContaBancaria {

	//Atributos
	private double taxaJuros;

	//Construtores
	public ContaPoupanca() {}
	
	public ContaPoupanca(double saldo, Titular titular, int agencia, String numeroConta, double taxaJuros) {
		super(saldo, titular, agencia, numeroConta);
		this.taxaJuros = taxaJuros;
	}

	//Métodos
	public void atualizarSaldo() {
		saldo += saldo*taxaJuros/100;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Taxa: " + taxaJuros;
	}
	
	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
}
