package br.com.empresa.cadastro.entidades;

public class Cliente extends Pessoa {

	// Atributos
	private String titulo;

	// Construtores
	public Cliente() {}

	public Cliente(int id, String nome, String titulo) {
		super(id, nome);
		this.titulo = titulo;
	}

	// Métodos
	public String exibirNomeFormatado() {
		return titulo.toUpperCase() + " - " + nome.toUpperCase();
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
