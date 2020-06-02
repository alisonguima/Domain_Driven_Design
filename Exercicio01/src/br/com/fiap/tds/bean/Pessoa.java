package br.com.fiap.tds.bean;

public class Pessoa {

	//atributos
	public String nome;
	
	private int idade;
	
	private float altura;
	
	//métodos
	public void setNome(String nome) {
		//this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float getAltura() {
		return altura;
	}
	
}