package br.com.fiap.tds.bean;

public class Formacao {

	//Atributos
	private String descricao;
	
	private int periodo;
	
	protected double mensalidade;
	
	protected int duracao;

	//Construtores
	public Formacao() {}
	
	public Formacao(String descricao, int periodo) {
		this.descricao = descricao;
		this.periodo = periodo;
		definirDuracao();
	}
	
	//Métodos
	
	//Método que é chamado quando imprimimos o objeto
	@Override
	public String toString() {
		return "Descrição: " + descricao + " Período: " + periodo + 
				" Mensalidade: " + mensalidade + " Duração: " + duracao;
	}
	
	public void definirDuracao() {
		//Valida se o objeto é do tipo Medio
		if (this instanceof Medio) {
			duracao = 36;
		} else if (this instanceof Tecnologo){
			duracao = 24;
		} else if (this instanceof Bacharelado) {
			if (descricao != null && descricao.equalsIgnoreCase("Engenharia")) {
				duracao = 60;
			}else {
				duracao = 48;
			}
		}
	}
	
	public double exibirMedia(double ps1, double ps2) {
		return (ps1 + ps2)/2;
	}
	
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2) {
		return (ps1 + ps2 + nac1 + nac2)/4;
	}
	
	public double exibirMedia(double ps1, double ps2, double nac1, 
											double nac2, double am1, double am2) {
		
		return (ps1 + ps2)/2*0.5 + (nac1 + nac2)/2*0.2 + (am1 + am2)/2*0.3;
	
	}
	
	//Métodos Gets/Sets
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
}
