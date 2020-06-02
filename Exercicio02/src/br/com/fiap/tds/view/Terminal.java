package br.com.fiap.tds.view;

import java.util.Scanner;

import br.com.fiap.tds.bean.Funcionario;
import br.com.fiap.tds.bean.Profissao;

public class Terminal {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in); //Instanciando o Scanner
		
		Profissao prof = new Profissao(); //Instanciando a profissao
		
		System.out.println("Digite o nome da profissão");
		//Lendo os dados digitados pelo usuário e atribuindo na profissão
		String nome = leitor.next() + leitor.nextLine(); //Ler mais de uma palavra
		prof.setNome(nome); 
		
		//Ler os dados do funcionário
		System.out.println("Digite o nome do funcionário");
		String nomeFunc = leitor.next() + leitor.nextLine();
		
		System.out.println("Digite a matricula");
		long matricula = leitor.nextLong();
		
		//sout + CTRL Espaço
		System.out.println("Digite o salário");
		double salario = leitor.nextDouble();
		
		//Instanciar o funcionário com os dados
		Funcionario funcionario = new Funcionario(matricula, nomeFunc, prof);
		funcionario.setSalario(salario);
		
		//Exibir os dados do funcionário
		System.out.println(funcionario);
		
		leitor.close();
		
	}
	
}
