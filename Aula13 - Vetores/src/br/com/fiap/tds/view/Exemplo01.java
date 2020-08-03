package br.com.fiap.tds.view;

public class Exemplo01 {

	public static void main(String[] args) {
		
		double precos [] = new double[4];
		
		precos[0] = 100;
		precos[1] = 200;
		precos[2] = 150;
		precos[3] = 100;
		
		System.out.println(precos[2]);
		System.out.println(precos.length);
		
		for (int i = 0; i < precos.length; i++) {
			System.out.println(precos[i]);
		}
		
		for (double item: precos) {
			System.out.println(item);
		}
	}
}
