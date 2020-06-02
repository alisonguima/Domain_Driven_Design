package br.com.fiap.tds.view;

import java.util.Scanner;

import br.com.fiap.tds.bean.Funcionario;

public class View {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		//Ler o nome, data de nascimento e sal�rio
		System.out.println("Digite o nome");
		String nome = leitor.next() + leitor.nextLine();
		
		System.out.println("Digite a data de nascimento");
		String data = leitor.next();
		
		System.out.println("Digite o sal�rio");
		double salario = leitor.nextDouble();
		
		//Instanciar um funcion�rio com o nome, data nascimento e sal�rio
		Funcionario func = new Funcionario(nome, data, salario);
		
		//Aumentar o sal�rio em valor absoluto
		System.out.println("Valor do aumento:");
		double valor = leitor.nextDouble();
		func.aumentarSalario(valor);
		
		//Exibir o sal�rio
		System.out.println("Novo sal�rio: " + func.getSalario());
		
		//Aumentar o valor em %
		System.out.println("Valor do aumento em %");
		int porcentagem = leitor.nextInt();
		func.aumentarSalario(porcentagem);
		
		//Exibir o sal�rio
		System.out.println("Novo sal�rio: " + func.getSalario());
		
		//Aumentar o sal�rio em comiss�o
		System.out.println("Quantidade de comiss�es:");
		int qtd = leitor.nextInt();
		System.out.println("Valor da comiss�o:");
		double comissao = leitor.nextDouble();
		func.aumentarSalario(qtd, comissao);
		
		//Exibir o sal�rio
		System.out.println("Novo sal�rio: " + func.getSalario());
		
		//Exibir os dados do funcion�rio //m�todo toString()
		System.out.println(func);
		
		leitor.close();
	}
	
}
