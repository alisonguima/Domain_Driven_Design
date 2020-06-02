package br.com.fiap.view;

import javax.swing.JOptionPane;

/*
� n�o eleitor (abaixo de 16 anos)
� eleitor obrigat�rio (entre 18 e 65 anos)
� eleitor facultativo (16 , 17 anos ou maior que 65 anos)
 */

public class TesteEleitores {

	public static void main(String[] args) {
		
		//La�os de repeti��o: while, do-while, for
		
		int obrigatorio = 0;
		
		for(int contador=0; contador <3; contador++) {
			
			//Ler a idade
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
			
			//Validar o tipo de eleitor
			if (idade < 16) {
				JOptionPane.showMessageDialog(null, "N�o eleitor");
			} else if (idade >= 18 && idade <= 65) {
				JOptionPane.showMessageDialog(null, "Eleitor obrigat�rio");
				obrigatorio = obrigatorio + 1;
			} else {
				JOptionPane.showMessageDialog(null, "Eleitor facultativo");
			}
			
		}//For
		
		JOptionPane.showMessageDialog(null, "Total obrigat�rio: " + obrigatorio);
		
	}//Main
	
}//Classe
