package br.com.fiap.tds.bean;

public class Medio extends Formacao {

	//Atributos
	private String tipo;

	//Construtores
	public Medio() {}
	
	public Medio(String descricao, int periodo, String tipo) {
		super(descricao, periodo);
		this.tipo = tipo;
	}

	//Métodos
	
	@Override
	public String toString() {
		return super.toString() + " tipo: " + tipo;
	}
	
	public void calcularMensalidade(double fator) {
		mensalidade = duracao * fator * 500;
	}

	//Gets e Sets
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
