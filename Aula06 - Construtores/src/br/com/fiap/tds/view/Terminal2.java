package br.com.fiap.tds.view;

import java.util.Scanner;
import br.com.fiap.tds.bean.Carro;
import br.com.fiap.tds.bean.Cor;

public class Terminal2 {

	public static void main(String[] args) {
		
		//Objeto para ler o teclado
		Scanner leitor = new Scanner(System.in);
		
		//Ler os dados que o usuário informar
		System.out.println("Digite o nome da cor");
		String nome = leitor.next(); //Lê o nome da cor

		//Instanciar uma cor com o nome
		Cor cor = new Cor(nome);
		
		//Ler os dados do carro
		System.out.println("Digite o modelo do carro");
		String modelo = leitor.next();
		
		System.out.println("Digite a placa do carro");
		String placa = leitor.next();
		
		//Instanciar um Carro com o modelo, cor e placa
		Carro carro = new Carro(modelo, cor, placa);
		
		//Exibir os dados: Modelo, Nome da Cor e Placa
		System.out.println("Modelo: " + carro.getModelo());
		System.out.println("Cor: " + carro.getCor().getNome());
		System.out.println("Placa: " + carro.getPlaca());
	
		//Quando utilizar o leitor (Scanner) devemos fechar o recurso no final
		leitor.close();
	}
	
}