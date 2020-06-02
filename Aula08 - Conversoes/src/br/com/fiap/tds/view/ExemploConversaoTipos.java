package br.com.fiap.tds.view;

public class ExemploConversaoTipos {

	//Conversão de tipos primitivos para outros
	public static void main(String[] args) {
		
		//Conversões implícitas 
		byte valorByte = 10;
		short valorShort = valorByte;
		int valorInt = valorShort;
		long valorLong = valorInt;
		float valorFloat = valorLong;
		double valorDouble = valorFloat;
		
		char valorChar = 'A';
		int charInt = valorChar;
		System.out.println(charInt); //ASCII
		
		//Conversões explícitas
		//Cast -> forçar um tipo ser de outro tipo em determinado momento
		valorFloat = (float) valorDouble;
		valorInt = (int) valorLong;
		
	}
	
}
