package br.com.fiap.tds.view;

public class ExemploConversaoTipos {

	//Convers�o de tipos primitivos para outros
	public static void main(String[] args) {
		
		//Convers�es impl�citas 
		byte valorByte = 10;
		short valorShort = valorByte;
		int valorInt = valorShort;
		long valorLong = valorInt;
		float valorFloat = valorLong;
		double valorDouble = valorFloat;
		
		char valorChar = 'A';
		int charInt = valorChar;
		System.out.println(charInt); //ASCII
		
		//Convers�es expl�citas
		//Cast -> for�ar um tipo ser de outro tipo em determinado momento
		valorFloat = (float) valorDouble;
		valorInt = (int) valorLong;
		
	}
	
}
