package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class ComparacaoStrings {
	
	public static void main(String[] args) {
		
		
		//Ler duas Strings
		String nome1 = JOptionPane.showInputDialog("Digite o nome");
		String nome2 = JOptionPane.showInputDialog("Digite outro nome");
		
		//Comparar ignorando letras maiúsculas e minúsculas
		if (nome1.equalsIgnoreCase(nome2)) {
			JOptionPane.showMessageDialog(null, "Os nomes são iguais");
		} else {
			JOptionPane.showMessageDialog(null, "Os nomes são diferentes");
		}
		
		//Verificar se o nome1 começa com "A" ou termina com "Silva"
		if (nome1.startsWith("A") || nome1.endsWith("Silva")) {
			JOptionPane.showMessageDialog(null, "O nome começa com \"A\" ou termina com \"Silva\"");
		}
		
		//Exibir a quantidade de caracteres do nome1
		JOptionPane.showMessageDialog(null, "A qtd de caracteres é " + nome1.length());
	
		//Exibir o nome1 (console) na vertical
		//Variável para armazenar o nome com \n (quebra de linha)
		String nomeVertical = "";
		//Loop com a qtd de vezes igual ao número de caracteres do nome1
		for (int i=0; i<nome1.length(); i++) { 
			//Exibir o caractere da posição i
			System.out.println(nome1.charAt(i));
			nomeVertical += nome1.charAt(i) + "\n";
		}
		JOptionPane.showMessageDialog(null, nomeVertical);
		
		//Exibe a posição do "a" no nome1 ou -1 se não existir o "a"
		System.out.println(nome1.indexOf("a"));
		
		//Verificar se existe o caracter "a" no nome1
		if (nome1.indexOf("a") != -1) {
			JOptionPane.showMessageDialog(null, 
				"A primeira ocorrência do caractere \'a\' está na posição: " + nome1.indexOf("a"));
		} else {
			JOptionPane.showMessageDialog(null, "Não tem \'a\' no nome");
		}
		
		//Exibir a última posição do "a" no nome1
		System.out.println("A última ocorrência de \'a\' é " + nome1.lastIndexOf("a"));
		
		//Exibir os três primeiros caracteres do nome1
		JOptionPane.showMessageDialog(null, nome1.substring(0, 3));
		
		//Exibir o sobrenome do nome1, se existir
		if (nome1.indexOf(" ") != -1) {
			//Recupera a última posição do espaço no nome1
			int posicao = nome1.lastIndexOf(" ");
			//0123456789
			//Pedro da Silva
			String sobrenome = nome1.substring(posicao+1);
			JOptionPane.showMessageDialog(null, "Sobrenome: " + sobrenome);
		}
		
		
	}//main

}//classe


