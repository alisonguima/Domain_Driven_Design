package br.com.fiap.tds.bean;

public class Cor {

	private String nome;
	
	private int r;
	
	private int b;
	
	private int g;
	
	//Construtores -> métodos especiais que são chamados no new
	//não possuem retorno e possuem o mesmo nome da classe
	public Cor(String nome) {
		this.nome = nome; 
	}
	
	//Construtor padrão sem parâmetros
	public Cor() {
		
	}
	
	//Construtor com 3 inteiros (r,g,b)
	public Cor(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	//Construtor com todos os parâmetros
	public Cor(String nome, int r, int g, int b) {
		this.nome = nome;
		this.r = r;
		this.g = g;
		this.b = b;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setR(int r) {
		this.r = r;
	}
	
	public int getR() {
		return r;
	}
	
	public void setG(int g) {
		this.g = g;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public int getG() {
		return g;
	}
	
	public int getB() {
		return b;
	}
	
}
