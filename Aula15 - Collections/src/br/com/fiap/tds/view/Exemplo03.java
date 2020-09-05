package br.com.fiap.tds.view;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exemplo03 {

	public static void main(String[] args) {
		//Criar um mapa
		Map<String, String> mapa = new HashMap<String, String>();
		
		//Adicionar valores no mapa
				//(Chave, Valor)
		mapa.put("SP", "S�o Paulo");
		mapa.put("AM", "Manaus");
		mapa.put("PE", "Recife");
		
		//Recuperar os valores
		System.out.println("Valor da chave PE: " + mapa.get("PE"));
		
		mapa.put("SP", "Rio de Janeiro");//Altera o valor
		System.out.println("Valor da chave SP: " + mapa.get("SP"));
		
		//Verifica se existe uma chave:
		System.out.println("Existe a chave MG: " + mapa.containsKey("MG"));
		
		//Verifica se existe um valor:
		System.out.println("Existe o valor Recife: " + mapa.containsValue("Recife"));
		
		//Exibir a quantidade de mapeamentos:
		System.out.println("Quantidade: " + mapa.size());
		
		//Verificar se o mapa est� vazio
		System.out.println("Mapa vazio: " + mapa.isEmpty());
		
		//Remover um mapeamento
		mapa.remove("SP");
		System.out.println(mapa.get("SP"));//retorna null
		
		//Recuperar todas as chaves
		Set<String> chaves = mapa.keySet();
		for (Object chave: chaves) {
			System.out.println("Chave: " + chave + " - " + mapa.get(chave));
		}
		
		//Recuperas todos os valores
		Collection<String> valores = mapa.values();
		for (Object valor : valores) {
			System.out.println("Valores: " + valor);
		}
	}

}
