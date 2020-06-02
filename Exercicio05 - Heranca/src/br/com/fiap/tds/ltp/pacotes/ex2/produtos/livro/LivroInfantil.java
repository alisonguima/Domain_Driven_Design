package br.com.fiap.tds.ltp.pacotes.ex2.produtos.livro;

public class LivroInfantil extends Livro {

	private String ilustrador;
	
	public LivroInfantil() {}

	public LivroInfantil(int codigo, double preco, String autor, 
					String livro, String isbn, String ilustrador) {
		super(codigo, preco, autor, livro, isbn);
		this.ilustrador = ilustrador;
	}

	public String getIlustrador() {
		return ilustrador;
	}

	public void setIlustrador(String ilustrador) {
		this.ilustrador = ilustrador;
	}
	
}
