package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class ExemploStrings {

	public static void main(String[] args) {
		//Caracteres de escape \n , \" , \\
		JOptionPane.showMessageDialog(null, "\"Escolha uma op��o: \n 1-Entrar \n 2-Sair\"");
		
		String curso = "TDS";
		
		String nome = curso + " - Analise e Desenvolvimento de Sistemas";
		
		nome = nome.concat(" - FIAP");
		
		JOptionPane.showMessageDialog(null, nome);
		
		String facu = new String("FIAP");
		String facu2 = "FIAP";
		
		//Compara��o de Strings
		if (facu.equals(facu2))
			JOptionPane.showMessageDialog(null, "Iguais");
		else
			JOptionPane.showMessageDialog(null, "Diferentes");
		
	}
	
}
