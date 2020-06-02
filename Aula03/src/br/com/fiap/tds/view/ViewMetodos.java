package br.com.fiap.tds.view;

import br.com.fiap.tds.bean.Carro;

public class ViewMetodos {

	public static void main(String args[]) {
		//Criar um objeto da classe Carro
		Carro car = new Carro();
		
		//Atribuir um valor ao atributo pre�o
		car.preco = 40000;
		
		//Chamar o m�todo calcularIpva()
		double valorIpva = car.calcularIpva();
		
		//Exibir o valor do IPVA
		System.out.println("IPVA � " + valorIpva);
		
		//Chamar o m�todo para aumentar o valor do carro em 1000 reais
		car.aumentarValor(1000);
		
		//Exibir o preco do carro
		System.out.println("Novo valor " + car.preco);
		
		//Calcular novamente o valor do IPVA
		valorIpva = car.calcularIpva();
		
		//Exibir o novo valor
		System.out.println("Novo valor IPVA � " + valorIpva);
		
		//Chamar o m�todo para calcular o desconto de 10%
		double valorComDesconto = car.calcularDesconto(10);
		
		//Exibir o valor com desconto
		System.out.println("Valor com desconto: " + valorComDesconto);
		
	}
	
}
