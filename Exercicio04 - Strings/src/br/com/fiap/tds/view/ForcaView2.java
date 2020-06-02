package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bean.Forca;

public class ForcaView2 {

	public static void main(String[] args) {
		//Ler a qtd de vidas e a palavra
		String palavra = JOptionPane.showInputDialog("Digite a palavra");
		int qtdVidas = 
			Integer.parseInt(JOptionPane.showInputDialog("Digite a qtd de vidas"));
		
		//Instanciar a Forca
		Forca forca = new Forca(palavra, qtdVidas);
		
		do {
			//Ler a letra
			String letra = JOptionPane.showInputDialog("Digite a letra");
			//Processar a letra
			forca.validarLetra(letra);
			
			//Exibir se acertou ou não
			JOptionPane.showMessageDialog(null, (forca.isAcertou()?"Acertou!":"Errou"));
			
			//Gerar a palavra oculta
			forca.gerarPalavraOculta();
			
			//Exibir a palavra oculta, letras erradas e qtd de vidas
			JOptionPane.showMessageDialog(null, forca.getPalavraOculta() + 
				"\nErros: " + forca.getLetrasErradas() + 
				"\nQtd Vidas: " + forca.getQtdVidas());
			
		} while(forca.validarJogada());
		
	}//main
	
}//classe
