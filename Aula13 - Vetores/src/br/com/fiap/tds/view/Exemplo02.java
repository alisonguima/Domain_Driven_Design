package br.com.fiap.tds.view;

public class Exemplo02 {

	public static void main(String[] args) {
		
		String semana [] = {"Domingo", "Segunda-feira",
				"Ter�a-feira", "Quarta-feira", 
				"Quinta-feira", "Sexta-feira", 
				"S�bado"};
		
		System.out.println(semana[3]);
		System.out.println(semana.length);
		
		for (int i = 0; i < semana.length; i++) {
			System.out.println(semana[i]);
		}
		
		for (String dia: semana) {
			System.out.println(dia);
		}
	}
}
