package br.com.fiap.tds.ltp.sistema.banco.contas;

/**
 * Classe que define um conta 
 * @author Alison Guimar�es
 * @version 1.0
 */
public class Conta {
	
	private int agencia;
	
	private String numero;
	
	/**
	 * Armazena o saldo da conta
	 */
	protected double saldo;
	
	/**
	 * Inicializa uma conta vazia
	 */
	public Conta() {}
	
	/**
	 * Inicializa uma conta com o n�mero da agencia e da conta
	 * @param agencia n�mero da agencia
	 * @param numero n�mero da conta, com d�gito
	 */
	public Conta(int agencia, String numero) {
		this.setAgencia(agencia);
		this.setNumero(numero);
	}

	/**
	 * @return n�mero da agencia
	 */
	public int getAgencia() {
		return agencia;
	}

	/**
	 * @param agencia n�mero da agencia
	 */
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	/**
	 * @return n�mero da conta, com d�gito
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero n�mero da conta com d�gito
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

}