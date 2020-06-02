package br.com.fiap.tds.view;

import br.com.fiap.tds.bean.Produto;

public class Terminal {
	
	//m�todo que come�a a execu��o do programa
	public static void main(String args[]) {
		
		//Instanciar (criar um objeto) de produto
		Produto celular = new Produto();
		
		//Utilizar o m�todo para inicializar os valores no objeto
		celular.inicializar("Xiaomi", "Mi10", 1000, false);
		
		//Colocar o produto na blackfriday
		celular.colocarBlackFriday();
		
		//Exibir o pre�o do produto
		System.out.println("Pre�o: "+ celular.preco);
		
		//Calcular o pre�o da parcela para 5x
		double parcela = celular.calcularParcelasPrazo(5);
		
		//Exibir o pre�o da parcela
		System.out.println("Parcela: " + parcela);
		//System.out.println("Parcela: " + celular.calcularParcelasPrazo(5));
		
		//Recuperar os detalhes do produto
		//String d = celular.retornarDetalhes();
		
		//Exibir os detalhes
		//System.out.println(d);
		System.out.println(celular.retornarDetalhes());
		
	}
	
}
