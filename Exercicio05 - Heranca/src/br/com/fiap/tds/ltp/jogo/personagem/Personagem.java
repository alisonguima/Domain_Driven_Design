package br.com.fiap.tds.ltp.jogo.personagem;

public class Personagem {

	//Atributos
	private int forca, inteligencia, destreza, level;
	
	private String nome;

	//Construtores
	public Personagem() {}
	
	public Personagem(int forca, int inteligencia, int destreza, 
											int level, String nome) {
		this.forca = forca;
		this.inteligencia = inteligencia;
		this.destreza = destreza;
		this.level = level;
		this.nome = nome;
	}
	
	//# -> protected
	protected double subirLevel() {
		level++; //aumenta o nível em 1
		return level; //retorna o valor do nível
	}

	//Métodos gets/sets
	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getDestreza() {
		return destreza;
	}

	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
