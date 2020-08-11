package br.com.fiap.tds.bean;

/**
 * Define um livro da biblioteca
 * @author Alison Guimar�es
 * @version 1.0
 */
public class Livro {

	// Coment�rio de Linha - n�o entram no javadoc
	
	/*
	 * Coment�rio de Bloco - n�o entram no javadoc
	 */
	private String titulo;
	
	private String categoria;
	
	private int exemplares;
	
	/**
	 * Cria um livro sem valores
	 */
	public Livro() {}

	/**
	 * Cria um livro com valores em seus atributos
	 * @param titulo titulo do livro
	 * @param categoria categoria do livro
	 * @param exemplares n�mero de exemplares dispon�veis na biblioteca
	 */
	public Livro(String titulo, String categoria, int exemplares) {
		super();
		this.titulo = titulo;
		this.categoria = categoria;
		this.exemplares = exemplares;
	}

	/**
	 * @return t�tulo do livro
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo t�tulo do livro
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return categoria do livro
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria categoria do livro
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return n�mero de exemplares da biblioteca
	 */
	public int getExemplares() {
		return exemplares;
	}

	/**
	 * @param exemplares n�mero de exemplares da biblioteca
	 */
	public void setExemplares(int exemplares) {
		this.exemplares = exemplares;
	}
	
}
