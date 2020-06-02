package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class ComparacaoStrings {
	
	public static void main(String[] args) {
		
		
		//Ler duas Strings
		String nome1 = JOptionPane.showInputDialog("Digite o nome");
		String nome2 = JOptionPane.showInputDialog("Digite outro nome");
		
		//Comparar ignorando letras mai�sculas e min�sculas
		if (nome1.equalsIgnoreCase(nome2)) {
			JOptionPane.showMessageDialog(null, "Os nomes s�o iguais");
		} else {
			JOptionPane.showMessageDialog(null, "Os nomes s�o diferentes");
		}
		
		//Verificar se o nome1 come�a com "A" ou termina com "Silva"
		if (nome1.startsWith("A") || nome1.endsWith("Silva")) {
			JOptionPane.showMessageDialog(null, "O nome come�a com \"A\" ou termina com \"Silva\"");
		}
		
		//Exibir a quantidade de caracteres do nome1
		JOptionPane.showMessageDialog(null, "A qtd de caracteres � " + nome1.length());
	
		//Exibir o nome1 (console) na vertical
		//Vari�vel para armazenar o nome com \n (quebra de linha)
		String nomeVertical = "";
		//Loop com a qtd de vezes igual ao n�mero de caracteres do nome1
		for (int i=0; i<nome1.length(); i++) { 
			//Exibir o caractere da posi��o i
			System.out.println(nome1.charAt(i));
			nomeVertical += nome1.charAt(i) + "\n";
		}
		JOptionPane.showMessageDialog(null, nomeVertical);
		
		//Exibe a posi��o do "a" no nome1 ou -1 se n�o existir o "a"
		System.out.println(nome1.indexOf("a"));
		
		//Verificar se existe o caracter "a" no nome1
		if (nome1.indexOf("a") != -1) {
			JOptionPane.showMessageDialog(null, 
				"A primeira ocorr�ncia do caractere \'a\' est� na posi��o: " + nome1.indexOf("a"));
		} else {
			JOptionPane.showMessageDialog(null, "N�o tem \'a\' no nome");
		}
		
		//Exibir a �ltima posi��o do "a" no nome1
		System.out.println("A �ltima ocorr�ncia de \'a\' � " + nome1.lastIndexOf("a"));
		
		//Exibir os tr�s primeiros caracteres do nome1
		JOptionPane.showMessageDialog(null, nome1.substring(0, 3));
		
		//Exibir o sobrenome do nome1, se existir
		if (nome1.indexOf(" ") != -1) {
			//Recupera a �ltima posi��o do espa�o no nome1
			int posicao = nome1.lastIndexOf(" ");
			//0123456789
			//Pedro da Silva
			String sobrenome = nome1.substring(posicao+1);
			JOptionPane.showMessageDialog(null, "Sobrenome: " + sobrenome);
		}
		
		
	}//main

}//classe


