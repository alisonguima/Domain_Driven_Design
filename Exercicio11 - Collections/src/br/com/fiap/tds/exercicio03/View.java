package br.com.fiap.tds.exercicio03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class View {
	public static void main(String[] args) {

		// Criar um mapa (chave = UF, valores = DDDs)
		Map<String, Set<Integer>> mapa = new HashMap<String, Set<Integer>>();
		Scanner scan = new Scanner(System.in);

		int opcao;
		do {
			System.out.println("Informe o que você deseja: ");
			System.out.println(
					"1 - Incluir o estado e seus DDDs" + "\n2 - Consultar os DDDs de um estado" + "\n3 - Sair");
			opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				//Ler o estado
				System.out.println("Digite a UF do estado: ");
				String uf = scan.next();
				//Loop -> Ler os ddds até o usuário
				String op; //escolha se vai cadastrar mais ddds
				//Verifica se o estado já está mapeado
				Set<Integer> conjunto;
				if (mapa.containsKey(uf)) {
					conjunto =  mapa.get(uf); //armazena os ddds no conjunto do estado
				} else {
					conjunto = new HashSet<Integer>(); //armazena os ddds em um novo conjunto
				}
				do {
					System.out.println("Digite o ddd: ");
					int ddd = scan.nextInt();
					conjunto.add(ddd);
					System.out.println("Deseja adicionar mais algum DDD? S/N");
					op = scan.next();
				} while(op.equalsIgnoreCase("S"));
				//Adicionar mapeamento
				mapa.put(uf,conjunto);
				break;
			case 2:
				//Ler o estado
				System.out.println("Digite a UF do estado: ");
				uf = scan.next();
				//Valida se o estado está cadastrado
				if (mapa.containsKey(uf)) {
					System.out.println(mapa.get(uf));
				} else {
					System.out.println("Estado não encontrado");
				}
				break;
			case 3:
				System.out.println("Obrigado!");
				break;
			default:
				System.out.println("Opção inválida");
			}
		} while (opcao != 3);
		scan.close();
	}
}
