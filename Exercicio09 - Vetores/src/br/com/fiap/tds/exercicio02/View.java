package br.com.fiap.tds.exercicio02;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
	
		//Ler a quantidade de n�meros
		System.out.println("Digite a qtd de n�meros:");
		int qtd = leitor.nextInt();
		
		//Vetor de n�meros com a qtd informada pelo usu�rio
		int vetor[] = new int[qtd];
		
		//Loop -> ler os n�meros
		for (int i=0; i<vetor.length; i++) {
			System.out.println("Digite o " + (i + 1) + " n�mero");
			vetor[i] = leitor.nextInt();
		}
		
		//vari�vel que armazena o maior n�mero, come�a com o valor da primeira posi��o do vetor
		int maior = vetor[0];
		
		//Loop -> verificar o maior n�mero
		for (int i=1; i < vetor.length; i++) {
			if (maior < vetor[i]) {
				maior = vetor[i];
			}
		}
		
		//Exibir o maior n�mero
		System.out.println("Maior n�mero �: " + maior);
		
		leitor.close();
	}
}