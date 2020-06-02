package br.com.fiap.tds.ltp.jogo.personagem.humano;

import br.com.fiap.tds.ltp.jogo.personagem.Personagem;

public class Humano extends Personagem {

	//Atributos
	private String classe;
	
	//Construtor
	public Humano() {}
	
	public Humano(int forca, int inteligencia, int destreza, 
							int level, String nome, String classe) {
		super(forca, inteligencia, destreza, level, nome);
		this.classe = classe;
	}
	
	//Método
	//~ -> default
	String definirClasse(String classe) {
		this.classe = classe; //define o valor para classe
		return this.classe; //retorna o valor 
	}
	
	//Métodos - Gets e Sets
	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}
	
}
