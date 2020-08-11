package br.com.fiap.tds.ltp.sistema.banco.contas;

/**
 * Classe que define uma conta corrente
 * @author Alison Guimar�es
 * @version 1.0
 */
public class ContaCorrente extends Conta{

	/**
	 * Inicializa uma conta corrente com o n�mero da agencia, 
	 * n�mero da conta com d�gito e o saldo
	 * @param agencia n�mero da agencia
	 * @param numero n�mero da conta com d�gito
	 * @param saldo saldo da conta 
	 */
	public ContaCorrente(int agencia, String numero, double saldo) {
		super(agencia, numero);
		this.saldo = saldo;
	}
	
	/**
	 * Exibe as movimenta��es da conta corrente
	 * @param dias dias de movimenta��o da conta, a partir da data atual
	 */
	public void exibirExtrato(int dias) {
		
	}
	
	/**
	 * @return saldo da conta corrente
	 */
	public double getSaldo() {
		return saldo;
	}
	
}