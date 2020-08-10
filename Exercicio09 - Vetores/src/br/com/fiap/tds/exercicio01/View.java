package br.com.fiap.tds.exercicio01;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Ler a quantidade de produtos
		System.out.println("Digite a qtd de produtos:");
		int posicoes = leitor.nextInt();
		
		//Declarar o vetor de produtos com a qtd informada
		Produto[] vetor = new Produto[posicoes];
		
		//Loop -> para ler todos os dados do produto, 
		//instanciar o produto e adicionar no vetor
		for (int i=0; i<vetor.length; i++) {
			
			System.out.println("Digite o preço");
			double preco = leitor.nextDouble();
			
			System.out.println("Digite a quantidade");
			int qtd = leitor.nextInt();
			
			System.out.println("Digite o desconto (em %)");
			double desconto = leitor.nextDouble();
			
			Produto produto = new Produto(qtd,preco,desconto);
			
			//adiciona o objeto produto no vetor
			vetor[i] = produto;
		}
		
		//variável para armazenar o valor total
		double valorTotal = 0;
		
		//Loop -> para calcular o valor total
		for (Produto p : vetor) {
			System.out.println("Preço: " + p.getPreco() + " Qtd: " + p.getQuantidade() + " Desc:" + p.getDesconto());
			valorTotal += p.getPreco() * p.getQuantidade() * (100-p.getDesconto())/100;
		}
		
		//Exibir o valor total
		System.out.println("Valor total: " + valorTotal);
		
		leitor.close();
	}
	
}