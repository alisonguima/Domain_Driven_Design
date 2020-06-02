package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bean.ContaPoupanca;
import br.com.fiap.tds.bean.Titular;

public class TerminalContaPoupanca {

	public static void main(String[] args) {
		//Ler os dados da conta
		double saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo"));
		int agencia = Integer.parseInt(JOptionPane.showInputDialog("Ag�ncia"));
		String numeroConta = JOptionPane.showInputDialog("N�mero da conta");
		double juros = Double.parseDouble(JOptionPane.showInputDialog("Taxa juros"));
		
		//Ler os dados do titular
		String nome = JOptionPane.showInputDialog("Nome do titular");
		String cpf = JOptionPane.showInputDialog("Cpf" );
		
		//Instanciar um titular
		Titular titular = new Titular(nome, cpf);
		
		//Intanciar uma conta corrente
		ContaPoupanca cp = new ContaPoupanca(saldo, titular, agencia, numeroConta, juros);
		
		//Ler o valor para sacar
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor para saque"));
		cp.sacar(valor);
		JOptionPane.showMessageDialog(null, "Saldo ap�s saque: " + cp.exibirSaldo());
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Valor para dep�sito"));
		cp.depositar(valor);
		JOptionPane.showMessageDialog(null, "Saldo ap�s dep�sito: " + cp.exibirSaldo());
		
		JOptionPane.showMessageDialog(null, cp);
	}
	
}
