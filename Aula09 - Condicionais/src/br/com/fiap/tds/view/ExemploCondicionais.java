package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class ExemploCondicionais {

	public static void main(String[] args) {

		// Ler um número do usuário
		String s = JOptionPane.showInputDialog("Digite um número");
		int x = Integer.parseInt(s);

		// Outra opção em uma única linha
		// int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

		// if com uma única instrução não precisa de { }

		if (x > 10)
			System.out.println("X é maior do que 10");
		else
			System.out.println("X é menor ou igual a 10");

		boolean ok = true; // declara uma variável booleana com valor verdadeiro

		// O diferente no Java é !=, =! é a atribuição e a negação
		if (ok) {
			System.out.println("OK é true");
		} else {
			System.out.println("OK é false");
		}

		// Switch case
		int semana = 
			Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da semana"));

		switch (semana) {
		case 1:
			System.out.println("Segunda");
			break;
		case 2:
			System.out.println("Terça");
			break;
		case 3:
			System.out.println("Quarta");
			break;
		case 4:
			System.out.println("Quinta");
			break;
		case 5:
			System.out.println("Sexta");
			break;
		default:
			System.out.println("Dia inválido");
		}

	}

}
