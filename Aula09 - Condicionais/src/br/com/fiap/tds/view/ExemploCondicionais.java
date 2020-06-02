package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class ExemploCondicionais {

	public static void main(String[] args) {

		// Ler um n�mero do usu�rio
		String s = JOptionPane.showInputDialog("Digite um n�mero");
		int x = Integer.parseInt(s);

		// Outra op��o em uma �nica linha
		// int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));

		// if com uma �nica instru��o n�o precisa de { }

		if (x > 10)
			System.out.println("X � maior do que 10");
		else
			System.out.println("X � menor ou igual a 10");

		boolean ok = true; // declara uma vari�vel booleana com valor verdadeiro

		// O diferente no Java � !=, =! � a atribui��o e a nega��o
		if (ok) {
			System.out.println("OK � true");
		} else {
			System.out.println("OK � false");
		}

		// Switch case
		int semana = 
			Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da semana"));

		switch (semana) {
		case 1:
			System.out.println("Segunda");
			break;
		case 2:
			System.out.println("Ter�a");
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
			System.out.println("Dia inv�lido");
		}

	}

}
