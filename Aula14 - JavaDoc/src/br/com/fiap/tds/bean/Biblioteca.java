package br.com.fiap.tds.bean;

/**
 * Classe que define uma biblioteca
 * 
 * @author Alison Guimar�es
 * @version 1.0
 */
public class Biblioteca {

	/**
	 * Define o nome da biblioteca
	 */
	private String nome;
	
	/**
	 * Define o endere�o da biblioteca, com n�mero e complemento
	 */
	private String endereco;
	
	/**
	 * Define os livros dispon�veis na biblioteca
	 */
	private Livro[] livros;

	/**
	 * Cria uma nova biblioteca sem valores nos atributos
	 */
	public Biblioteca() {}

	/**
	 * Cria uma nova biblioteca definindo valores nos atributos
	 * @param nome da biblioteca
	 * @param endereco da biblioteca
	 * @param livros dispon�veis na biblioteca
	 */
	public Biblioteca(String nome, String endereco, Livro[] livros) {
		this.nome = nome;
		this.endereco = endereco;
		this.livros = livros;
	}

	/**
	 * @return retorna o nome da biblioteca
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome nome da biblioteca
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return endere�o da biblioteca
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco endere�o da biblioteca com n�mero e complemento
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return livros dispon�veis na biblioteca
	 */
	public Livro[] getLivros() {
		return livros;
	}

	/**
	 * @param livros livros dispon�veis na biblioteca
	 */
	public void setLivros(Livro[] livros) {
		this.livros = livros;
	}
	
}