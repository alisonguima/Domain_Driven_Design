package br.com.fiap.tds.bean;

public class Produto {

	//atributos
	
	public String marca;
	
	public String nome;
	
	public double preco;
	
	public boolean blackfriday;
	
	//m�todos
	
	//void -> n�o retorna nenhum valor
	public void colocarBlackFriday() {
		blackfriday = true;
		preco /= 2; // preco = preco/2; Coloca o pre�o pela metade
	}
	
	public double calcularParcelasPrazo(int parcelas) {
		double valor = preco / parcelas; //calcula as parcelas
		return valor; //retorna o valor calculado
	}
	
	public void trocarNome(String novoNome) {
		nome = novoNome;
		//this representa a classe para referenciar o atributo
		//utilizado quando o parametro tem o mesmo nome do atributo
		//this.nome = nome; 
	}
	
	//Criar um m�todo que recebe os valores da marca, nome, pre�o e blackfriday
	public void inicializar(String marca, String nome, double preco, boolean blackfriday) {
		this.marca = marca;
		this.nome = nome;
		this.preco = preco;
		this.blackfriday = blackfriday;
	}
	
	//m�todo que retorna os detalhes do produto
	public String retornarDetalhes() {
		String detalhes = nome + " " + marca + " " + preco + " " + blackfriday;
		return detalhes;
	}
	
}

