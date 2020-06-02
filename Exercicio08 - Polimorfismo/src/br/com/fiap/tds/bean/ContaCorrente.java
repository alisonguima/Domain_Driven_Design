package br.com.fiap.tds.bean;

public class ContaCorrente extends ContaBancaria {

	//Atributos
	private double limiteCredito;
	
	//Construtores
	public ContaCorrente() {}
	
	public ContaCorrente(double saldo, Titular titular, int agencia, String numeroConta, double limiteCredito) {
		super(saldo, titular, agencia, numeroConta);
		this.limiteCredito = limiteCredito;
	}

	//Métodos
	@Override
	public double exibirSaldo() {
		return saldo + limiteCredito;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Limite: " + limiteCredito;
	}
	
	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
}
