package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class ExemploConversaoPrimitivo {

	//Transformando uma String em um tipo primitivo
	public static void main(String[] args) {
		
		String idade = JOptionPane.showInputDialog("Digite a idade");
		
		byte idadeByte = Byte.parseByte(idade);
		short idadeShort = Short.parseShort(idade);
		int idadeInt = Integer.parseInt(idade);
		long idadeLong = Long.parseLong(idade);
		
		float idadeFloat = Float.parseFloat(idade);
		double idadeDouble = Double.parseDouble(idade);
		
		//Somar todas as idades
		double total = idadeByte + idadeShort + idadeInt + idadeLong
				+ idadeFloat + idadeDouble;
		
		System.out.println(total);
		
		String passou = "true";
		
		boolean passouBoolean = Boolean.parseBoolean(passou);
		System.out.println(passouBoolean);	
	}
	
}