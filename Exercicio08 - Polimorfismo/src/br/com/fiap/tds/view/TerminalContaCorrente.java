package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bean.ContaCorrente;
import br.com.fiap.tds.bean.Titular;

public class TerminalContaCorrente {

	public static void main(String[] args) {
		//Ler os dados da conta
		double saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo"));
		int agencia = Integer.parseInt(JOptionPane.showInputDialog("Agência"));
		String numeroConta = JOptionPane.showInputDialog("Número da conta");
		double limite = Double.parseDouble(JOptionPane.showInputDialog("Limite"));
		
		//Ler os dados do titular
		String nome = JOptionPane.showInputDialog("Nome do titular");
		String cpf = JOptionPane.showInputDialog("Cpf" );
		
		//Instanciar um titular
		Titular titular = new Titular(nome, cpf);
		
		//Intanciar uma conta corrente
		ContaCorrente cc = new ContaCorrente(saldo, titular, agencia, numeroConta, limite);
		
		//Ler o valor para sacar
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor para saque"));
		cc.sacar(valor);
		JOptionPane.showMessageDialog(null, "Saldo após saque: " + cc.exibirSaldo());
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Valor para depósito"));
		cc.depositar(valor);
		JOptionPane.showMessageDialog(null, "Saldo após depósito: " + cc.exibirSaldo());
		
		JOptionPane.showMessageDialog(null, cc);
	}
	
}
