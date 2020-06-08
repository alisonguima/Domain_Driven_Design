package br.com.fiap.tds.vetores;

import java.util.Scanner;

public class Terminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Variaveis var = new Variaveis();
		
			Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		var.setNumA(sc.nextInt());
		
		System.out.println("Digite o segundo número: ");
		var.setNumB(sc.nextInt());
		while (var.getNumB() == var.getNumA()) {
			System.out.println("NÃO PODE DIGITAR NÚMEROS REPETIDOS.");
		}
		
		System.out.println("Digite o terceiro número: ");
		var.setNumC(sc.nextInt());
		while (var.getNumC() == var.getNumB() || var.getNumC() == var.getNumA()) {
			System.out.println("NÃO PODE DIGITAR NÚMEROS REPETIDOS.");
		}
		
		System.out.println("Digite o quarto número: ");
		var.setNumD(sc.nextInt());
		while (var.getNumD() == var.getNumC() || var.getNumD() == var.getNumB() || var.getNumD() == var.getNumA()) {
			System.out.println("NÃO PODE DIGITAR NÚMEROS REPETIDOS.");
		}
		
		System.out.println("Digite o quinto número: ");
		var.setNumC(sc.nextInt());
		while (var.getNumE() == var.getNumD() || var.getNumE() == var.getNumC() || var.getNumE() == var.getNumB() || var.getNumE() == var.getNumA()) {
			System.out.println("NÃO PODE DIGITAR NÚMEROS REPETIDOS.");
		}
		
		sc.close();

		if (var.getNumA() > var.getNumB() && var.getNumA() > var.getNumC() && var.getNumA() > var.getNumD() && var.getNumA() > var.getNumE()) {
			System.out.println("O maior número é " + var.getNumA());
		}
		
		if (var.getNumB() > var.getNumA() && var.getNumB() > var.getNumC() && var.getNumB() > var.getNumD() && var.getNumB() > var.getNumE()) {
			System.out.println("O maior número é " + var.getNumB());
		}
		
		if (var.getNumC() > var.getNumA() && var.getNumC() > var.getNumB() && var.getNumC() > var.getNumD() && var.getNumC() > var.getNumE()) {
			System.out.println("O maior número é " + var.getNumC());
		}
		
		if (var.getNumD() > var.getNumA() && var.getNumD() > var.getNumB() && var.getNumD() > var.getNumC() && var.getNumD() > var.getNumE()) {
			System.out.println("O maior número é " + var.getNumD());
		}
		
		if (var.getNumE() > var.getNumA() && var.getNumE() > var.getNumB() && var.getNumE() > var.getNumC() && var.getNumE() > var.getNumD()) {
			System.out.println("O maior número é " + var.getNumE());
		}
	}
}
