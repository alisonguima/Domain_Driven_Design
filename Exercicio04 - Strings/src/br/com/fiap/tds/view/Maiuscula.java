package br.com.fiap.tds.view;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Maiuscula {

	//Exibir a palavra em maiúscula
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//String palavra = JOptionPane.showInputDialog("Digite uma palavra");
		String palavra = sc.next();
		
		JOptionPane.showMessageDialog(null, palavra.toUpperCase());
		System.out.println(palavra.toUpperCase());
		
	}
	
}