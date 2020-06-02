package br.com.fiap.tds.view;

import br.com.fiap.tds.bean.Cafeteira;
import br.com.fiap.tds.bean.Geladeira;

public class Terminal {

	public static void main(String[] args) {
		//Instanciar uma cafeteira
		Cafeteira cafeteira = new Cafeteira();
		
		cafeteira.setNome("Nespresso");
		
		//Calcular a garantia da cafeteira
		double garantia = cafeteira.calcularGarantiaEstendida(2);
		
		//Instanciar uma geladeira
		Geladeira geladeira = new Geladeira();
		
		//Calcular a garantia da geladeira
		garantia = geladeira.calcularGarantiaEstendida(3);
		
	}
	
}
