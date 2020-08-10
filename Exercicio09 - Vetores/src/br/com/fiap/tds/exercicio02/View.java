package br.com.fiap.tds.exercicio02;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
	
		//Ler a quantidade de números
		System.out.println("Digite a qtd de números:");
		int qtd = leitor.nextInt();
		
		//Vetor de números com a qtd informada pelo usuário
		int vetor[] = new int[qtd];
		
		//Loop -> ler os números
		for (int i=0; i<vetor.length; i++) {
			System.out.println("Digite o " + (i + 1) + " número");
			vetor[i] = leitor.nextInt();
		}
		
		//variável que armazena o maior número, começa com o valor da primeira posição do vetor
		int maior = vetor[0];
		
		//Loop -> verificar o maior número
		for (int i=1; i < vetor.length; i++) {
			if (maior < vetor[i]) {
				maior = vetor[i];
			}
		}
		
		//Exibir o maior número
		System.out.println("Maior número é: " + maior);
		
		leitor.close();
	}
}