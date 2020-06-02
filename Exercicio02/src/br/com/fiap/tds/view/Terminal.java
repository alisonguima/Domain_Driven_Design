package br.com.fiap.tds.view;

import java.util.Scanner;

import br.com.fiap.tds.bean.Funcionario;
import br.com.fiap.tds.bean.Profissao;

public class Terminal {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in); //Instanciando o Scanner
		
		Profissao prof = new Profissao(); //Instanciando a profissao
		
		System.out.println("Digite o nome da profiss�o");
		//Lendo os dados digitados pelo usu�rio e atribuindo na profiss�o
		String nome = leitor.next() + leitor.nextLine(); //Ler mais de uma palavra
		prof.setNome(nome); 
		
		//Ler os dados do funcion�rio
		System.out.println("Digite o nome do funcion�rio");
		String nomeFunc = leitor.next() + leitor.nextLine();
		
		System.out.println("Digite a matricula");
		long matricula = leitor.nextLong();
		
		//sout + CTRL Espa�o
		System.out.println("Digite o sal�rio");
		double salario = leitor.nextDouble();
		
		//Instanciar o funcion�rio com os dados
		Funcionario funcionario = new Funcionario(matricula, nomeFunc, prof);
		funcionario.setSalario(salario);
		
		//Exibir os dados do funcion�rio
		System.out.println(funcionario);
		
		leitor.close();
		
	}
	
}
