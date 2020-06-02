package br.com.fiap.tds.ltp.pacotes.ex2.produtos.cd;

import br.com.fiap.tds.ltp.pacotes.ex2.produtos.Produto;

public class Cd extends Produto {

	//Atributos
	private String artista;
	
	private String album;

	public Cd() {
		super();
	}

	public Cd(int codigo, double preco, String artista, String album) {
		super(codigo, preco);
		this.artista = artista;
		this.album = album;
	}

	//M�todos Gets/Sets
	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}
	
}
