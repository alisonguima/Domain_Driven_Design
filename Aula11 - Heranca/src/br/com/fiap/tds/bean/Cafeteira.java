package br.com.fiap.tds.bean;

/*
 * Modificadores de acesso: private, public, protected, default 
 * protected -> classes filhas e classes no mesmo pacote
 */
public class Cafeteira extends Eletrodomestico {

	//Atributos
	private String tipoCafe;
	
	private boolean bandejaRemovivel;

	//Construtor padr�o
	public Cafeteira() {}
	
	//Construtor com todos os atributos
	public Cafeteira(boolean bivolt, int voltagem, String nome, double preco, 
												String tipoCafe, boolean bandeja) {
		super(bivolt, voltagem, nome, preco);
		this.tipoCafe = tipoCafe;
		this.bandejaRemovivel = bandeja;
	}
	
	//M�todos
	public String getTipoCafe() {
		return tipoCafe;
	}

	public void setTipoCafe(String tipoCafe) {
		this.tipoCafe = tipoCafe;
	}

	public boolean isBandejaRemovivel() {
		return bandejaRemovivel;
	}

	public void setBandejaRemovivel(boolean bandejaRemovivel) {
		this.bandejaRemovivel = bandejaRemovivel;
	}
	
}
