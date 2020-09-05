package br.com.fiap.tds.view;

import java.util.HashSet;
import java.util.Set;

public class Exemplo02 {
	
	public static void main(String[] args) {
		//Criar um conjunto (Set)
		Set<String> conjunto = new HashSet<String>();
		
		//Adicionar valores no conjunto
		conjunto.add("Segunda");
		conjunto.add("Ter�a");
		
		conjunto.add("Segunda"); //Ignorado
		
		/*Remover um elemento no conjunto
		conjunto.remove("Segunda");*/
		
		//Exibir a quantidade de elementos no conjunto
		System.out.println("Quantidade de elementos: " +conjunto.size());
		
		//Verificar se "Segunda" est� no conjunto
		System.out.println("Segunda est� no conjunto: " + conjunto.contains("Segunda"));
	
		//Verificar se o conjunto est� vazio
		System.out.println("Conjunto est� vazio: " + conjunto.isEmpty());
		
		//Loop
		for (String item : conjunto) {
			System.out.println(item);
		}
		
		//Remover todos os elementos do conjunto
		conjunto.clear();
		
		//Transforma o conjunto no vetor
		//Object vetor[] = conjunto.toArray();
	}
}
