package br.com.fiap.tds.view;

import java.util.Scanner;

import br.com.fiap.tds.bean.Data;

public class Terminal {

	public static void main(String[] args) {
		//Ler os dados do usu�rio
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o dia:");
		int dia = leitor.nextInt();
		
		System.out.println("Digite o m�s:");
		int mes = leitor.nextInt();
		
		System.out.println("Digite o ano:");
		int ano = leitor.nextInt();
		
		//Criar um objeto de Data com os dados
		Data data = new Data(dia, mes, ano);
		
		//Exibir a data formatada
		System.out.println(data);
		
		//Exibir o nome do m�s
		System.out.println(data.retornarMes());
		
		//Verificar se o usu�rio deseja modificar a data
		System.out.println("Deseja modificar a data? 1-S/2-N");
		int opcao = leitor.nextInt();
		while(opcao != 2 ) {
			
			System.out.println("Deseja modificar o dia? 1-S/2-N");
			opcao = leitor.nextInt();
			if (opcao ==1) {
				System.out.println("Digite o dia:");
				data.setDia(leitor.nextInt());
			}
			
			System.out.println("Deseja modificar o m�s? 1-S/2-N");
			opcao = leitor.nextInt();
			if (opcao == 1) {
				System.out.println("Digite o m�s");
				data.setMes(leitor.nextInt());
			}
			
			System.out.println("Deseja modificar o ano? 1-S/2-N");
			opcao = leitor.nextInt();
			if (opcao == 1) {
				System.out.println("Digite o ano");
				data.setAno(leitor.nextInt());
			}
			
			System.out.println(data); // 12 de janeiro de 2010 <- 12/1/2010
			
			System.out.println("Deseja modificar a data? 1-S/2-N");
			opcao = leitor.nextInt();
		}
		
		System.out.println("Fim do programa");
		leitor.close();
	}
	
}