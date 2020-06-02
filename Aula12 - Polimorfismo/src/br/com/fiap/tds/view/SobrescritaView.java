package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bean.Funcionario;
import br.com.fiap.tds.bean.Gerente;
import br.com.fiap.tds.bean.Pessoa;

public class SobrescritaView {

	public static void main(String[] args) {
		//Ler os dados
		String nome = JOptionPane.showInputDialog("Nome");
		String data = JOptionPane.showInputDialog("Data de nascimento");
		double salario = 
				Double.parseDouble(JOptionPane.showInputDialog("Sal�rio"));
		
		//Instanciar um Funcion�rio
		Funcionario funcionario = new Funcionario(nome, data, salario);
		
		//Instanciar um Gerente
		Gerente gerente = new Gerente(nome, data, salario);
		
		//Ler o aumento
		double aumento = 
				Double.parseDouble(JOptionPane.showInputDialog("Aumento"));
				
		//Aumentar o sal�rio do funcion�rio e gerente
		funcionario.aumentarSalario(aumento); //chama o m�todo do Funcion�rio
		gerente.aumentarSalario(aumento); //chama o m�todo do Gerente
		
		//Exibir o sal�rio atual
		System.out.println("Sal�rio do funcion�rio: " + funcionario.getSalario());	
		System.out.println("Sal�rio do gerente: " + gerente.getSalario());
		
		Funcionario f = new Gerente(nome, data, salario);
		f.aumentarSalario(aumento); //chama o m�todo Gerente
		System.out.println("Novo sal�rio: " + f.getSalario());
		
	}
	
}
