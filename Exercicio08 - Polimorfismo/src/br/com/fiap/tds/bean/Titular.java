package br.com.fiap.tds.bean;

public class Titular {

	//Atributos
	private String nome;
	
	private String cpf;
	
	//Construtores
	public Titular() {}

	public Titular(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	//Métodos
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + " Cpf: " + cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
