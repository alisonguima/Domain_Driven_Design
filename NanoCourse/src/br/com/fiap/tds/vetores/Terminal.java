package br.com.fiap.tds.vetores;

import java.util.Scanner;

public class Terminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Variaveis var = new Variaveis();
		
			Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		var.setNumA(sc.nextInt());
		
		System.out.println("Digite o segundo n�mero: ");
		var.setNumB(sc.nextInt());
		while (var.getNumB() == var.getNumA()) {
			System.out.println("N�O PODE DIGITAR N�MEROS REPETIDOS.");
		}
		
		System.out.println("Digite o terceiro n�mero: ");
		var.setNumC(sc.nextInt());
		while (var.getNumC() == var.getNumB() || var.getNumC() == var.getNumA()) {
			System.out.println("N�O PODE DIGITAR N�MEROS REPETIDOS.");
		}
		
		System.out.println("Digite o quarto n�mero: ");
		var.setNumD(sc.nextInt());
		while (var.getNumD() == var.getNumC() || var.getNumD() == var.getNumB() || var.getNumD() == var.getNumA()) {
			System.out.println("N�O PODE DIGITAR N�MEROS REPETIDOS.");
		}
		
		System.out.println("Digite o quinto n�mero: ");
		var.setNumC(sc.nextInt());
		while (var.getNumE() == var.getNumD() || var.getNumE() == var.getNumC() || var.getNumE() == var.getNumB() || var.getNumE() == var.getNumA()) {
			System.out.println("N�O PODE DIGITAR N�MEROS REPETIDOS.");
		}
		
		sc.close();

		if (var.getNumA() > var.getNumB() && var.getNumA() > var.getNumC() && var.getNumA() > var.getNumD() && var.getNumA() > var.getNumE()) {
			System.out.println("O maior n�mero � " + var.getNumA());
		}
		
		if (var.getNumB() > var.getNumA() && var.getNumB() > var.getNumC() && var.getNumB() > var.getNumD() && var.getNumB() > var.getNumE()) {
			System.out.println("O maior n�mero � " + var.getNumB());
		}
		
		if (var.getNumC() > var.getNumA() && var.getNumC() > var.getNumB() && var.getNumC() > var.getNumD() && var.getNumC() > var.getNumE()) {
			System.out.println("O maior n�mero � " + var.getNumC());
		}
		
		if (var.getNumD() > var.getNumA() && var.getNumD() > var.getNumB() && var.getNumD() > var.getNumC() && var.getNumD() > var.getNumE()) {
			System.out.println("O maior n�mero � " + var.getNumD());
		}
		
		if (var.getNumE() > var.getNumA() && var.getNumE() > var.getNumB() && var.getNumE() > var.getNumC() && var.getNumE() > var.getNumD()) {
			System.out.println("O maior n�mero � " + var.getNumE());
		}
	}
}
