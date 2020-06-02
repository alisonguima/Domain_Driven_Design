package br.com.fiap.tds.bean;

public class ContaBancaria {

	//Atributos
	protected double saldo;
	
	private Titular titular;
	
	private int agencia;
	
	private String numeroConta;
	
	//Construtores
	public ContaBancaria() {}
	
	public ContaBancaria(double saldo, Titular titular, int agencia, String numeroConta) {
		super();
		this.saldo = saldo;
		this.titular = titular;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
	}

	//M�todos
	public double exibirSaldo() {
		return saldo;
	}
	
	@Override
	public String toString() {
		return "Titular: " + titular + " Agencia: " + agencia + " N�mero: " + numeroConta;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
}
