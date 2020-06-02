package br.com.empresa.cadastro.entidades;

public class Pessoa {

	//Atributos
	private int id;
	
	protected String nome;
	
	//Construtores
	public Pessoa() {}

	public Pessoa(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	//Métodos
	//Apesar do exercício pedir para exibir no método, optei por retornar o valor e deixar a responsabilidade da view exibir os dados
	public String exibirNomeFormatado() {
		return nome.toUpperCase();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
