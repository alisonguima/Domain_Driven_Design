package br.com.fiap.tds.view;

import java.io.File;

public class Exemplo03 {
	
	//Criar um diretório chamado aulas
	public static void main(String[] args) {
		
		//Instanciar um objeto que representa um diretório
		File file = new File("aulas");
		
		//Validar se o diretório  não existe
		if (!file.exists()) {
			file.mkdir(); //Criar um diretório
		} else {
			file.delete(); //Apaga o diretório
		}
		
		System.out.println("Trabalhando com diretórios");
	}
}
