package br.com.fiap.tds.view;

import br.com.fiap.tds.bean.Carro;
import br.com.fiap.tds.bean.Cor;

public class Terminal {

	public static void main(String[] args) {
		
		//Instanciar uma Cor
		Cor cor = new Cor("Vermelho",56,56,56);
		
		//Instanciar um Carro
		//f no final para transformar um double em um float
		Carro gol = new Carro("Gol", 4, 3.8f , 3, 2010, cor, "DDD-9999", 2);
		
		//Instanciar outra cor, utilizando o construtor
		Cor preta = new Cor("Preto");
		
		//Instanciar um carro, utilizando outro construtor
		Carro fusca = new Carro("Fusca", preta, "ABC-1234");
		
		//Exibindo algumas informações do objeto carro (fusca)
		System.out.println(fusca.getModelo());
		//Exibir o nome da cor que está no atributo cor do carro
		System.out.println(fusca.getCor().getNome()); 
		
	}
	
}