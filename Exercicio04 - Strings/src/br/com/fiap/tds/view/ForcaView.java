package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

/*
 * Implementar um jogo da Forca
 * Inserir uma palavra e o número de vidas
 * 
 * Inserir uma letra
 * Verificar se existe a letra na palavra
 * Exibe se acertou o errou
 * Exibe a palavra oculta (com *) e letras erradas e qtd de vidas
 * 
 * repetir até acabar a qtd de vidas ou acertar a palavra
 * 
 */
public class ForcaView {

	public static void main(String[] args) {
		boolean acertou = false;
		//int qtdVidasAtual = 0;
		String letrasErradas = "";
		
		//Lê a qtd de vidas
		int qtdVidas = Integer.parseInt(
						JOptionPane.showInputDialog("Digite a qtd de vidas"));
		
		//Lê a palavra
		String palavra = JOptionPane.showInputDialog("Digite a palavra");
		
		String palavraOculta = "";
		String letrasCorretas = "";
		
		do {
		
			//Lê a letra
			String letra = JOptionPane.showInputDialog("Digite a letra");
			
			//Valida se existe a letra na palavra
			//valida se encontrou a letra na palavra (se não encontra o retorno é -1)
			if (palavra.indexOf(letra) != -1) {
				acertou = true;
				letrasCorretas += letra; //adiciona mais uma letra correta na variável
			}else {
				acertou = false; 
				qtdVidas--; //decrementa a quantidade de vidas
 				letrasErradas += letra; //adiciona mais uma letra errada na variável
			}
			
			//(condicao?verdadeiro:falso) - Operador ternário
			JOptionPane.showMessageDialog(null, (acertou?"Acertou!":"Errou!") );
			
			/*Exibe se acertou ou errou
			if (acertou) {
				JOptionPane.showMessageDialog(null, "Acertou!");
			}else {
				JOptionPane.showMessageDialog(null, "Errou!");
			}*/
			
			palavraOculta = "";
			//Percorrer todas as posições da palavra
			for (int i=0; i < palavra.length(); i++) {
				//Validar se a letra da posição da palavra está nas letrasCorretas
				if (letrasCorretas.indexOf(palavra.charAt(i)) != -1) 
					//Se estiver, adiciona a letra na palavra oculta
					palavraOculta += palavra.charAt(i);
				else
					//Se não, adiciona o *
					palavraOculta += "*";
			}
			
			//Exibe a palavra oculta (com *) e letras erradas e qtd de vidas
			JOptionPane.showMessageDialog(null, palavraOculta 
					+ "\nErros: " + letrasErradas + "\nVidas: " + qtdVidas);
			
		//Repetir enquanto tem vida e não acertar a palavra
		//método contains() -> valida a String contém uma outra String
		} while(qtdVidas > 0 && palavraOculta.contains("*"));//!palavra.equals(palavraOculta));
		
	}//main
	
}//classe

