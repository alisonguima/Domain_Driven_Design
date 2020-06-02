package br.com.fiap.tds.bean;

public class Elevador {

	//Atributos
	private int andarAtual;
	
	private int totalAndares;
	
	private int capacidade;
	
	private int qtdPessoas;
	
	//Métodos
	public void inicializa(int capacidade, int totalAndares) {
		this.capacidade = capacidade;
		this.totalAndares = totalAndares;
	}
	
	//Adiciona a qtd passada no parâmetro do método ao qtdPessoas;
	public int entra(int qtd) {
		//Valida se não excede a capacidade do elevador
		if (validar(qtd))
			qtdPessoas = qtdPessoas + qtd;
		return qtdPessoas;
	}
	
	public void entra() {
		if (validar(1))
			qtdPessoas++; //qtdPessoas +=1; //qtdPessoas = qtdPessoas + 1;
	}
	
	private boolean validar(int qtd) {
//		if (qtdPessoas + qtd <= capacidade)
//			return true;
//		else 
//			return false;
		return qtdPessoas + qtd <= capacidade;
	}
	
	private boolean validarSair(int qtd) {
		return qtdPessoas - qtd >= 0;
	}
	
	public int sai(int qtd) {
		if (validarSair(qtd))
			qtdPessoas -= qtd;
		return qtdPessoas;
	}
	
	public void sai() {
		if (validarSair(1))
			qtdPessoas--; //qtdPessoas -=1; //qtdPessoas = qtdPessoas - 1;
	}
	
	public boolean sobe() {
		if (andarAtual < totalAndares) {
			andarAtual++;
			return true;
		}
		return false;
	}
	
	public boolean desce() {
		if (andarAtual > 0) {
			andarAtual--;
			return true;
		}
		return false;
	}
	
	public int getAndarAtual() {
		return andarAtual;
	}
	
	public int getTotalAndares() {
		return totalAndares;
	}
	
	public int getQtdPessoas() {
		return qtdPessoas;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
}