package br.com.fiap.view;

import javax.swing.JOptionPane;

/*
• não eleitor (abaixo de 16 anos)
• eleitor obrigatório (entre 18 e 65 anos)
• eleitor facultativo (16 , 17 anos ou maior que 65 anos)
 */

public class TesteEleitores {

	public static void main(String[] args) {
		
		//Laços de repetição: while, do-while, for
		
		int obrigatorio = 0;
		
		for(int contador=0; contador <3; contador++) {
			
			//Ler a idade
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
			
			//Validar o tipo de eleitor
			if (idade < 16) {
				JOptionPane.showMessageDialog(null, "Não eleitor");
			} else if (idade >= 18 && idade <= 65) {
				JOptionPane.showMessageDialog(null, "Eleitor obrigatório");
				obrigatorio = obrigatorio + 1;
			} else {
				JOptionPane.showMessageDialog(null, "Eleitor facultativo");
			}
			
		}//For
		
		JOptionPane.showMessageDialog(null, "Total obrigatório: " + obrigatorio);
		
	}//Main
	
}//Classe
