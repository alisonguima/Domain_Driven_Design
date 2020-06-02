package br.com.fiap.tds.view;

public class ExemploConversaoString {

	//Transformar um primitivo em uma String
	public static void main(String[] args) {
		
		byte idade = 19;
		String idadeString = String.valueOf(idade);//Transforma o byte em String
		
		float valor = 10;
		String valorString = String.valueOf(valor);//Transforma o float em String
		
		System.out.println(idade + valor);
		System.out.println(idadeString + valorString);
		
	}
	
}
