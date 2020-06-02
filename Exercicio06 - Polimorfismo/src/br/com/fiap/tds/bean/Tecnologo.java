package br.com.fiap.tds.bean;

public class Tecnologo extends Formacao {

	//Atributos
	private boolean planoEstendido;
	
	//Construtores
	public Tecnologo() {}
	
	public Tecnologo(String descricao, int periodo, boolean planoEstendido) {
		super(descricao, periodo);
		this.planoEstendido = planoEstendido;
	}
	
	//M�todos
	
	//super.toString() -> chama o m�todo do pai
	@Override
	public String toString() {
		return super.toString() + " Plano estendido: " + planoEstendido;
	}
	
	public void calcularMensalidade(double fator) {
		mensalidade = duracao * fator * 600;
	}

	//M�todos Gets/Sets
	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}
	
}
